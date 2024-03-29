<script type="text/javascript" src="/js/application.js"></script>

<script type="text/javascript">
	var lastState;

	function log(msg) {
		//alert(msg);
	}

	function startLoadingDashboard() {
		document.getElementById('loading_dashboard').style.visibility = 'visible';
	}

	function stopLoadingDashboard() {
		document.getElementById('loading_dashboard').style.visibility = 'hidden';
	}

	sendMessage = function(path) {
		log('send message to ' + path);

		var xhr = new XMLHttpRequest();
		xhr.open('POST', path, true);
		xhr.addEventListener("progress", updateProgress, false);
		xhr.addEventListener("load", transferComplete, false);
		xhr.addEventListener("error", transferFailed, false);
		xhr.addEventListener("abort", transferCanceled, false);
		xhr.send();

		startLoadingDashboard();
	};

	// progress on transfers from the server to the client (downloads)
	function updateProgress(oEvent) {
		if (oEvent.lengthComputable) {
			var percentComplete = oEvent.loaded / oEvent.total;
			// ...
		} else {
			// Unable to compute progress information since the total size is unknown
		}
	}

	function transferComplete(evt) {
		log("The transfer is complete.");
	}

	function transferFailed(evt) {
		log("An error occurred while transferring the file.");
	}

	function transferCanceled(evt) {
		log("The transfer has been canceled by the user.");
	}

	onOpen = function() {
		log('open');

		applyFilters();

		reagendar(500);
	}

	function reagendar(time) {
		log('reagendar');

		setTimeout(
				function() {
					log('refresh '
							+ (document.getElementById('loading_dashboard').style.visibility == 'visible'));
					
					if (document.getElementById('loading_dashboard').style.visibility == 'visible') {
						applyFilters();
						reagendar(2 * time);
					}
				}, time);
	}

	onMessage = function(m) {
		log('message received');

		newState = JSON.parse(m.data);
		updateCharts(newState);
		updateFilters(newState);

		stopLoadingDashboard();
	}

	onError = function() {

		/*
		TODO - Dar um alerta na tela pedindo para recarregar a p�gina. Pode ocorrer ap�s 2 horas de uso do channel, ou quando o server parar.
		 */

		log('error');

		stopLoadingDashboard();
	}

	onComplete = function() {
		log('completed');

		stopLoadingDashboard();
	}

	function openChannel(token) {
		log('opening channel with token ' + token);

		startLoadingDashboard();

		var channel = new goog.appengine.Channel(token);
		var handler = {
			'onopen' : onOpen,
			'onmessage' : onMessage,
			'onerror' : onError,
			'onclose' : onComplete
		};
		var socket = channel.open(handler);
		socket.onopen = onOpen;
		socket.onmessage = onMessage;
		socket.onerror = onError;
		socket.oncomplete = onComplete;

		$(window).on('beforeunload', function() {
			clearTimeout(socket.pollingTimer_);
		});
	}

	function updateChart(chartType, containerId, json, options) {
		if (json) {
			var data = new google.visualization.DataTable(json);

			var wrapper = new google.visualization.ChartWrapper({
				chartType : chartType,
				dataTable : data,
				options : options,
				containerId : containerId
			});

			wrapper.draw();
		}
	}

	/* Necessario para redesenhar os charts quando trocar de abas */
	function refreshCharts() {
		if (lastState) {
			updateCharts(lastState);
		}
	}

	function updateCharts(newState) {

		lastState = newState;

		updateChart('PieChart', 'pie_div', newState.pie, {
			height : 240,
			is3D : true
		});

		updateChart('BarChart', 'bar_div', newState.bar, {
			height : 240,
			vAxis : {
				title : "Clientes"
			},
			hAxis : {
				title : "Valor"
			}
		});

		updateChart('LineChart', 'line_div', newState.line, {
			height : 240,
			vAxis : {
				title : "Valor"
			},
			hAxis : {
				title : "M�s"
			}
		});

		updateChart('PieChart', 'impostos_div', newState.impostos, {
			height : 240,
			pieHole : 0.5
		});

		updateChart('ColumnChart', 'receita_div', newState.receita, {
			height : 240,
			vAxis : {
				title : "Valor"
			},
			hAxis : {
				title : "Ano"
			}
		});

		updateChart('ColumnChart', 'frete_estado_div', newState.frete_estado, {
			height : 240,
			vAxis : {
				title : "Frete"
			},
			hAxis : {
				title : "Estado"
			}
		});

		updateChart('BarChart', 'produtos_div', newState.produtos, {
			height : 400,
			vAxis : {
				title : "Produtos"
			},
			hAxis : {
				title : "Valor"
			}
		});

		updateMap(newState.map);
	}

	function drawChart() {
		openChannel('${token}');
	}

	google.setOnLoadCallback(drawChart);
</script>
