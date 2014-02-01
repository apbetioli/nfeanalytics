<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<head>
<%@ include file="../jsp/head.jsp"%>
<link href="../css/jquery/jquery.uploadfile.css" rel="stylesheet">
<script src="../js/jquery/jquery.min.js"></script>
<script src="../js/jquery/jquery.uploadfile.min.js"></script>
</head>
<body>

	<img src="../images/load.gif" alt="" id="loading_upload"
		style="visibility: hidden" />

	<div id="status"></div>

	<div id="mulitplefileuploader">Upload</div>

	<script>
		function startLoadingUpload() {
			document.getElementById('loading_upload').style.visibility = 'visible'
		}

		function stopLoadingUpload() {
			document.getElementById('loading_upload').style.visibility = 'hidden'
		}

		$(document)
				.ready(
						function() {

							var settings = {
								url : "/ajaxupload",
								method : "POST",
								allowedTypes : "xml",
								fileName : "myfile",
								multiple : true,
								autoSubmit : true,
								maxFileSize : 1024 * 1024,
								showStatusAfterSuccess : true,
								/*
								dragDropStr : "<span><b>Faites glisser et déposez les fichiers</b></span>",
								abortStr : "abandonner",
								cancelStr : "résilier",
								doneStr : "fait",
								multiDragErrorStr : "Plusieurs Drag & Drop de fichiers ne sont pas autorisés.",
								extErrorStr : "n'est pas autorisé. Extensions autorisées:",
								sizeErrorStr : "n'est pas autorisé. Admis taille max:",
								uploadErrorStr : "Upload n'est pas autorisé",
								onSuccess:function(files,data,xhr)
								{
									$("#eventsmessage").html($("#eventsmessage").html()+"<br/>Success for: "+JSON.stringify(data));
									
								},
								onError: function(files,status,errMsg)
								{
									$("#eventsmessage").html($("#eventsmessage").html()+"<br/>Error for: "+JSON.stringify(files));
								},
								 */
								onSubmit : function(files) {
									startLoadingUpload();

									$("#status").html(" ");

								},
								afterUploadAll : function() {
									stopLoadingUpload();

									var xhr = new XMLHttpRequest();
									xhr.open('GET', '/ajaxupload', true);
									xhr.send();

									$("#status")
											.html(
													"<div class='alert alert-success'><fmt:message key='upload_sucess'/>");

								}

							}
							$("#mulitplefileuploader").uploadFile(settings);

						});
	</script>
</body>