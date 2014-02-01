<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="modal fade" id="upload_modal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">

	<div class="modal-dialog">

		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					onclick="applyFilters();" aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="myModalLabel">
					<span class="glyphicon glyphicon-cloud-upload"></span>
					<fmt:message key="menu_upload" />
				</h4>
			</div>
			<div class="modal-body">
				<p align="justify">
					<fmt:message key="upload_texto" />
				</p>

				<iframe id="iframe" src="" style="zoom: 0.60" width="99.6%"
					height="300" frameborder="0"></iframe>

			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					onclick="applyFilters();">
					<fmt:message key="btn_fechar" />
				</button>
			</div>

		</div>
	</div>
</div>
