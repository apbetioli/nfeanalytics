<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<!DOCTYPE html>
<head>
<%@ include file="../jsp/head.jsp"%>
</head>
<body>
	<%@ include file="../jsp/menu.jsp"%>

	<br />
	<div class="panel panel-default">

		<div class="panel-heading">
			<div class="row">
				<div class="col-sm-10">
					<h2 style="display: inline;">
						<fmt:message key="menu_api_key" />
					</h2>
				</div>
				<div class="col-sm-2">
					<a href="/api_key?generate"
						<button class="btn btn-success pull-right"
						style="margin-right: 15px;">
						<fmt:message key="api_key_gerar_btn" />
					</button></a>
				</div>

			</div>
		</div>
	</div>

	<c:if test="${empty apiKey}">
		<div class="alert alert-warning">
			<fmt:message key="api_key_nao_existe_alert">
				<fmt:param>
					<a href="/api_key?generate"
						<button class="btn btn-success">
						<fmt:message key="api_key_gerar_btn" />
					</button></a>
				</fmt:param>
			</fmt:message>
		</div>
	</c:if>
	<c:if test="${not empty apiKey}">
		<div class="alert alert-info">
			<fmt:message key="api_key_existe_alert">
				<fmt:param>${apiKey.key}</fmt:param>
			</fmt:message>
		</div>
	</c:if>

	<div class="container">

		<h2>
			<fmt:message key="api_key_doc_titulo" />
		</h2>

		<p>
			<fmt:message key="api_key_doc_description" />
		</p>

		<table class="table">
			<thead>
				<tr>
					<th><fmt:message key="api_key_doc_table_head_http_method" /></th>
					<th><fmt:message key="api_key_doc_table_head_url" /></th>
					<th><fmt:message key="api_key_doc_table_head_param" /></th>
					<th><fmt:message key="api_key_doc_table_head_accept" /></th>
					<th><fmt:message key="api_key_doc_table_head_content" /></th>
					<th><fmt:message key="api_key_doc_table_head_description" /></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>GET</td>
					<td>/api/nfe</td>
					<td>api-key${empty apiKey ? "" : ": "}${empty apiKey ? "" : apiKey.key}</td>
					<td></td>
					<td>application/json</td>
					<td><fmt:message key="api_key_doc_table_method1" /></td>
				</tr>
				<tr>
					<td>POST</td>
					<td>/api/nfe</td>
					<td>api-key${empty apiKey ? "" : ": "}${empty apiKey ? "" : apiKey.key}</td>
					<td>application/xml</td>
					<td></td>
					<td><fmt:message key="api_key_doc_table_method2" /></td>
				</tr>
				<tr>
					<td>GET</td>
					<td>/api/nfe/{chNFe}</td>
					<td>api-key${empty apiKey ? "" : ": "}${empty apiKey ? "" : apiKey.key}</td>
					<td></td>
					<td>application/json</td>
					<td><fmt:message key="api_key_doc_table_method3" /></td>
				</tr>
				<tr>
					<td>DELETE</td>
					<td>/api/nfe/{chNFe}</td>
					<td>api-key${empty apiKey ? "" : ": "}${empty apiKey ? "" : apiKey.key}</td>
					<td></td>
					<td></td>
					<td><fmt:message key="api_key_doc_table_method4" /></td>
				</tr>
				<tr>
					<td>GET</td>
					<td>/api/nfe/{chNFe}.xml</td>
					<td>api-key${empty apiKey ? "" : ": "}${empty apiKey ? "" : apiKey.key}</td>
					<td></td>
					<td>application/xml</td>
					<td><fmt:message key="api_key_doc_table_method5" /></td>
				</tr>
			</tbody>
		</table>

		<ul>
			<li><b>{chNFe}</b> - <fmt:message key="api_key_doc_obs1" /></li>
			<li><fmt:message key="api_key_doc_obs2">
					<fmt:param>${empty apiKey ? "" : apiKey.key}</fmt:param>
				</fmt:message></li>
		</ul>

		<hr class="featurette-divider">

		<p>
			<fmt:message key="api_key_doc_status_desc" />
		</p>

		<table class="table">
			<thead>
				<tr>
					<th><fmt:message key="api_key_doc_status_head1" /></th>
					<th><fmt:message key="api_key_doc_status_head2" /></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>200</td>
					<td><fmt:message key="api_key_doc_status_200" /></td>
				</tr>
				<tr>
					<td>204</td>
					<td><fmt:message key="api_key_doc_status_204" /></td>
				</tr>
				<tr>
					<td>400</td>
					<td><fmt:message key="api_key_doc_status_400" /></td>
				</tr>
				<tr>
					<td>401</td>
					<td><fmt:message key="api_key_doc_status_401" /></td>
				</tr>
				<tr>
					<td>500</td>
					<td><fmt:message key="api_key_doc_status_500" /></td>
				</tr>
			</tbody>
		</table>

	</div>

	<%@ include file="../jsp/footer.jsp"%>
</body>
</html>