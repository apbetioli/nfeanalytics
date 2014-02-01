showUploadModal = function() {
	$('#upload_modal').modal({
		show : true
	})
	$('#iframe').attr("src", "/jsp/uploadform.jsp");
};

$('#upload_btn').click(showUploadModal);

$('#upload_alert_btn').click(showUploadModal);

!function($) {

	$(function() {

		// IE10 viewport hack for Surface/desktop Windows 8 bug
		if (navigator.userAgent.match(/IEMobile\/10\.0/)) {
			var msViewportStyle = document.createElement("style");
			msViewportStyle.appendChild(document
					.createTextNode("@-ms-viewport{width:auto!important}"));
			document.getElementsByTagName("head")[0]
					.appendChild(msViewportStyle);
		}

		$("[data-toggle=tooltip]").tooltip()

		$("[data-toggle=popover]").popover()

		$('a[data-toggle="tab"]').on('shown.bs.tab', function(e) {
			// e.target // activated tab
			// e.relatedTarget // previous tab
			refreshCharts();
		})

	})
}(jQuery)
