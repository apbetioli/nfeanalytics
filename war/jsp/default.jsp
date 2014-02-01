<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<head>
<%@ include file="../jsp/head.jsp"%>
</head>
<body>
	<%@ include file="../jsp/menu.jsp"%>

	<!-- Start Content -->
	<div class="container">
		<br />
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 style="display: inline;">
					<fmt:message key="something" />
				</h2>
			</div>
		</div>

		<hr class="featurette-divider">

	</div>
	<!-- End Content -->

	<%@ include file="../jsp/footer.jsp"%>

</body>
</html>