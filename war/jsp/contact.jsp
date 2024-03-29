<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<head>
<%@ include file="../jsp/head.jsp"%>

<script type="text/css">
label.valid {
  width: 24px;
  height: 24px;
  display: inline-block;
  text-indent: -9999px;
}
label.error {
  font-weight: bold;
  color: red;
  padding: 2px 8px;
  margin-top: 2px;
}
label.success{
 color: red;
}
</script>
<script type="text/javascript">
	$(document)
			.ready(
					function() {

						$('#contact-form')
								.validate(
										{
											rules : {
												name : {
													required : true
												},
												email : {
													required : true,
													email : true
												},
												comment : {
													required : true
												}
											},
											messages : {
												name : "<fmt:message key='contato_campo_obrig' />",
												comment : "<fmt:message key='contato_campo_obrig' />",
												email : {
													required : "<fmt:message key='contato_campo_obrig' />",
													email : "<fmt:message key='contato_campo_email_inv' />",

												}

											},
											highlight : function(element) {
												$(element).closest(
														'.form-group')
														.removeClass('success')
														.addClass('has-error');
											},
											success : function(element) {
												element
														.closest('.form-group')
														.removeClass('error')
														.addClass('has-success');
											}
										});
					}); // end document.ready
</script>
<script src="../js/jquery/jquery.validate.min.js" type="text/javascript"></script>

</head>
<body>
	<%@ include file="../jsp/menu.jsp"%>

	<br />
	<div class="panel panel-default">
		<div class="panel-heading">
			<h2 style="display: inline;">
				<fmt:message key="menu_contato" />
			</h2>
		</div>
	</div>

	<div class="container">
		<c:if test="${sucessSend !=null}">
			<c:if test="${!sucessSend}">
				<div id="upload-alert" class="alert alert-warning">
					<a class="close" data-dismiss="alert" href="#" aria-hidden="true">&times;</a>
					<fmt:message key="contato_envio_erro" />

				</div>
			</c:if>
			<c:if test="${sucessSend}">
				<div id="upload-alert" class="alert alert-info">
					<a class="close" data-dismiss="alert" href="#" aria-hidden="true">&times;</a>
					<fmt:message key="contato_envio_sucesso" />

				</div>
			</c:if>
		</c:if>
		<form method="post" action="/contact" id="contact-form">
			<div class="form-group">
				<label for="name"><fmt:message key="contato_nome" /></label> <input
					type="text" class="form-control" id="name" name="name"
					placeholder="<fmt:message
						key="contato_nomeph" />">
				</input>
			</div>

			<div class="form-group">
				<label for="email"><fmt:message key="contato_email" /></label> <input
					type="text" class="form-control" id="email" name="email"
					placeholder="<fmt:message
						key="contato_emailph" />">
				</input>
			</div>

			<div class="form-group">
				<label for="comment"><fmt:message key="contato_coment" /></label>
				<textarea class="form-control" id="comment" name="comment"
					placeholder="<fmt:message
						key="contato_comentph" />">
						</textarea>
			</div>

			<button type="submit" class="btn btn-info">
				<fmt:message key="contato_enviar" />
			</button>
			<button type="reset" class="btn btn-default">
				<fmt:message key="contato_limpar" />
			</button>
		</form>
	</div>

	<%@ include file="../jsp/footer.jsp"%>

</body>
</html>