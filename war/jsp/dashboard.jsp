<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<head>
<%@ include file="../jsp/head.jsp"%>
<%@ include file="../jsp/dashboard_head.jsp"%>

<link href="../css/jquery/jquery.uploadfile.css" rel="stylesheet">

<script src="../js/jquery/jquery.uploadfile.min.js"></script>

</head>
<body>
	<%@ include file="../jsp/menu.jsp"%>

	<br />

	<!-- Filters -->

	<div class="panel panel-default">

		<div class="panel-heading">
			<div class="row">
				<div class="col-sm-2">
					<h2 style="display: inline;">
						<fmt:message key="dashboard_titulo" />
						<img src="../images/load.gif" alt="" id="loading_dashboard"
							style="visibility: hidden" />
					</h2>
				</div>
				<div class="col-sm-6">
					<!-- Nav tabs -->
					<ul class="nav nav-pills">
						<li class="active"><a href="#vendas" data-toggle="tab"><fmt:message
									key="tab_vendas" /></a></li>
						<li><a href="#clientes" data-toggle="tab"><fmt:message
									key="tab_clientes" /></a></li>
						<li><a href="#impostos" data-toggle="tab"><fmt:message
									key="tab_impostos" /></a></li>
						<li><a href="#logistica" data-toggle="tab"><fmt:message
									key="tab_logistica" /></a></li>
						<li><a href="#produtos" data-toggle="tab"><fmt:message
									key="tab_produtos" /></a></li>
					</ul>
				</div>
				<div class="col-sm-1">&nbsp;</div>
				<div class="col-sm-3">
					<button id="upload_btn" type="button" class="btn btn-success">
						<span class="glyphicon glyphicon-cloud-upload"></span>
						<fmt:message key="menu_upload" />
					</button>
					<button type="button" class="btn btn-success"
						data-toggle="collapse" data-target="#filterPanel">
						<span class="glyphicon glyphicon-search"></span>
						<fmt:message key="dashboard_filtros" />
					</button>
				</div>
			</div>
		</div>

		<div id="filterPanel" class="panel-collapse collapse">
			<div class="panel-body">
				<div class="row">
					<div class="col-sm-6">
						<label><fmt:message key="dashboard_data_inicio" /></label> <br />
						<input type="date" id="begin" name="begin" />
					</div>
					<div class="col-sm-6">
						<label><fmt:message key="dashboard_data_fim" /></label> <br /> <input
							type="date" id="end" name="end" />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6">
						<label><fmt:message key="dashboard_cliente" /></label> <br /> <select
							id="customers" style="width: 95%">
							<option />
							<c:forEach var="item" items="${customers}">
								<option>${item}</option>
							</c:forEach>
						</select>
					</div>
					<div class="col-sm-6">
						<label><fmt:message key="dashboard_uf" /></label> <br /> <select
							id="ufs">
							<option />
							<c:forEach var="item" items="${ufs}">
								<option>${item}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<br />
				<div>
					<button type="button" class="btn btn-primary"
						onclick="applyFilters();">
						<fmt:message key="dashboard_btn_aplicar" />
					</button>
					<button type="button" class="btn btn-primary"
						onclick="applyFilters();" data-toggle="collapse"
						data-target="#filterPanel">
						<fmt:message key="dashboard_btn_aplicar_fechar" />
					</button>
					<button type="button" class="btn btn-warning"
						onclick="resetFilters();">
						<fmt:message key="dashboard_btn_limpar" />
					</button>
					<button type="button" class="btn btn-default"
						data-toggle="collapse" data-target="#filterPanel">
						<fmt:message key="btn_fechar" />
					</button>
				</div>
			</div>
		</div>

	</div>

	<div class="tab-content">

		<div class="tab-pane active" id="vendas">

			<c:if test="${empty ufs}">
				<div id="upload-alert" class="alert alert-warning">
					<a class="close" data-dismiss="alert" href="#" aria-hidden="true">&times;</a>
					<fmt:message key="upload_warning">
						<fmt:param>
							<button id="upload_alert_btn" type="button" data-dismiss="alert"
								class="btn btn-success">
								<span class="glyphicon glyphicon-cloud-upload"></span>
								<fmt:message key="menu_upload" />
							</button>
						</fmt:param>
					</fmt:message>
				</div>
			</c:if>


			<div class="row">
				<div class="col-sm-12">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<fmt:message key="dashboard_desempenho_empresa" />
							<button type="button"
								class="btn btn-xs btn-info glyphicon glyphicon-info-sign pull-right"
								data-container="body" data-toggle="popover"
								data-placement="left"
								data-content="<fmt:message key='dashboard_desempenho_empresa_texto' />"
								data-original-title="" />
						</div>
						<div class="panel-body">
							<div id="line_div"></div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<fmt:message key="dashboard_distribuicao_vendas" />
							<button type="button"
								class="btn btn-xs btn-info glyphicon glyphicon-info-sign pull-right"
								data-container="body" data-toggle="popover"
								data-placement="left"
								data-content="<fmt:message key='dashboard_distribuicao_vendas_texto' />"
								data-original-title="" />
						</div>
						<div class="panel-body">
							<div id="map-canvas"></div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="tab-pane" id="impostos">
			<div class="row">
				<div class="col-sm-6">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<fmt:message key="dashboard_receita" />

							<button type="button"
								class="btn btn-xs btn-info glyphicon glyphicon-info-sign pull-right"
								data-container="body" data-toggle="popover"
								data-placement="left"
								data-content="<fmt:message key='dashboard_receita_texto' />"
								data-original-title="" />
						</div>
						<div class="panel-body">
							<div id="receita_div"></div>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<fmt:message key="dashboard_impostos" />
							<button type="button"
								class="btn btn-xs btn-info glyphicon glyphicon-info-sign pull-right"
								data-container="body" data-toggle="popover"
								data-placement="left"
								data-content="<fmt:message key='dashboard_impostos_texto' />"
								data-original-title="" />
						</div>
						<div class="panel-body">
							<div id="impostos_div"></div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="tab-pane" id="clientes">
			<div class="row">
				<div class="col-sm-6">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<fmt:message key="dashboard_melhores_clientes" />
							<button type="button"
								class="btn btn-xs btn-info glyphicon glyphicon-info-sign pull-right"
								data-container="body" data-toggle="popover"
								data-placement="left"
								data-content="<fmt:message key='dashboard_melhores_clientes_texto' />"
								data-original-title="" />
						</div>
						<div class="panel-body">
							<div id="bar_div"></div>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<fmt:message key="dashboard_metodo_pgto" />

							<button type="button"
								class="btn btn-xs btn-info glyphicon glyphicon-info-sign pull-right"
								data-container="body" data-toggle="popover"
								data-placement="left"
								data-content="<fmt:message key='dashboard_metodo_pgto_texto' />"
								data-original-title="" />
						</div>
						<div class="panel-body">
							<div id="pie_div"></div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="tab-pane" id="logistica">
			<div class="row">
				<div class="col-sm-12">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<fmt:message key="dashboard_frete_estado" />

							<button type="button"
								class="btn btn-xs btn-info glyphicon glyphicon-info-sign pull-right"
								data-container="body" data-toggle="popover"
								data-placement="left"
								data-content="<fmt:message key='dashboard_frete_estado_texto' />"
								data-original-title="" />
						</div>
						<div class="panel-body">
							<div id="frete_estado_div"></div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="tab-pane" id="produtos">
			<div class="row">
				<div class="col-sm-12">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<fmt:message key="dashboard_produtos" />
							<button type="button"
								class="btn btn-xs btn-info glyphicon glyphicon-info-sign pull-right"
								data-container="body" data-toggle="popover"
								data-placement="left"
								data-content="<fmt:message key='dashboard_produtos_texto' />"
								data-original-title="" />
						</div>
						<div class="panel-body">
							<div id="produtos_div"></div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<%@ include file="../jsp/footer.jsp"%>
	<%@ include file="../jsp/dashboard_footer.jsp"%>
	<%@ include file="../jsp/upload_modal.jsp"%>

</body>
</html>
