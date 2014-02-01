<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String language = (String) request.getAttribute("language");
%>
<!DOCTYPE html>
<head>
<%@ include file="../jsp/head.jsp"%>
<script
	src="https://www.google.com/moderator/static/moderator-embed-api.js"
	type="text/javascript"></script>

</head>
<body>
	<%@ include file="../jsp/menu.jsp"%>

	<!-- Start Content -->
	<div class="container">
		<br />
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 style="display: inline;">
					<fmt:message key="menu_moderator" />
				</h2>
			</div>
		</div>

		<hr class="featurette-divider">


		<div id="moderator-embed-target" class="moderator"></div>
		<script type="text/javascript">
			var mod = new MODERATOR(
					"http://www.google.com/moderator/#16/e=214417");
			mod.hl = '${language}';
			mod.width = 1000;
			mod.height = 500;
			mod.embed("moderator-embed-target");
		</script>
		<!-- End Content -->
		<%@ include file="../jsp/footer.jsp"%>
</body>
</html>
