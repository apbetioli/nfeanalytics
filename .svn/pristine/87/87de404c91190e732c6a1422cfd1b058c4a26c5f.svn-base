<script src='/_ah/channel/jsapi'></script>

<script type="text/javascript" src="https://www.google.com/jsapi"></script>

<script type="text/javascript">
	google.load('visualization', '1', {
		'packages' : [ 'corechart' ]
	});
</script>

<script
	src="https://maps.googleapis.com/maps/api/js?key=${initParam['maps.api.key']}&v=3.exp&sensor=false&libraries=visualization"></script>

<script>
	var map;
	var heatmap;

	function updateMap(json) {
		if (json) {
			var coordinates = [];

			$.each(JSON.parse(json), function(key, val) {
				coordinates.push(new google.maps.LatLng(val.lat, val.lng));
			});

			var pointArray = new google.maps.MVCArray(coordinates);

			if (heatmap)
				heatmap.setMap(null);

			heatmap = new google.maps.visualization.HeatmapLayer({
				data : pointArray
			});

			heatmap.setMap(map);
			heatmap.setOptions({
				radius : 15
			});
		}

	}

	function initialize() {

		var myLatlng = new google.maps.LatLng(-15.522802, -51.671858);

		var mapOptions = {
			zoom : 4,
			center : myLatlng,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		};

		map = new google.maps.Map(document.getElementById('map-canvas'),
				mapOptions);

		updateMap('');
	}

	function applyFilters() {
		var begin = document.getElementById("begin").value;
		var end = document.getElementById("end").value;
		var customers = document.getElementById("customers").value;
		var ufs = document.getElementById("ufs").value;

		var link = '/dashboard?token=${token}';

		if (begin)
			link = link + '&begin=' + begin;
		if (end)
			link = link + '&end=' + end;
		if (customers)
			link = link + '&customers=' + customers;
		if (ufs)
			link = link + '&ufs=' + ufs;

		sendMessage(link);
	}

	function resetFilters() {
		document.getElementById("begin").value = '';
		document.getElementById("end").value = '';
		document.getElementById("customers").value = '';
		document.getElementById("ufs").value = '';

		applyFilters();
	}

	function updateFilters(newState) {
		var customers = JSON.parse(newState.customers);
		var ufs = JSON.parse(newState.ufs);

		updateSelect('customers', customers);
		updateSelect('ufs', ufs);
	}

	function updateSelect(id, values) {

		var selected = document.getElementById(id).value;
		
		document.getElementById(id).options.length = 0;
		document.getElementById(id).options[0] = new Option('', '', true, false);

		i = 0;
		while (i < values.length) {
			document.getElementById(id).options[i + 1] = new Option(values[i],
					values[i], false, false);
			i++;
		}
		
		document.getElementById(id).value = selected;

	}

	google.maps.event.addDomListener(window, 'load', initialize);
</script>