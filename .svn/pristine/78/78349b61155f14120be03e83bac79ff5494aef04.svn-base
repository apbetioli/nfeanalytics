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
						<fmt:message key="menu_xml" />
					</h2>
				</div>
				<div class="col-sm-2">
					<button class="btn btn-danger pull-right" data-toggle="modal"
						data-target="#myModal2" style="margin-right: 15px;">
						<fmt:message key="xml_modal_delete_tudo" />
					</button>
				</div>

			</div>
		</div>

	</div>
	<div class="container">
		<c:if test="${param.deleteAll}">
			<div id="upload-alert" class="alert alert-warning">
				<a class="close" data-dismiss="alert" href="#" aria-hidden="true">&times;</a>
				<fmt:message key="xml_delete_tudo_solic" />

			</div>
		</c:if>

		<div class="modal fade" id="myModal2" tabindex="-2" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">
							<fmt:message key="xml_modal_delete" />
						</h4>
					</div>
					<div class="modal-body">
						<fmt:message key="xml_modal_delete_tudo_texto" />
					</div>
					<div class="modal-footer">
						<img src="../images/load.gif" alt="" id="loading_delete"
							style="visibility: hidden" />
						<form action="/xml" method="post">
							<button type="submit" class="btn btn-default">
								<fmt:message key="xml_modal_delete_sim" />
							</button>
							<button type="button" class="btn btn-default"
								data-dismiss="modal">
								<fmt:message key="xml_modal_delete_nao" />
							</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="table-responsive">
				<table style="text-align: center"
					class="table table-striped table-bordered table-hover table-condensed">
					<thead>
						<tr>
							<th style="text-align: center"><fmt:message key="xml_chnfe" /></th>

							<th style="text-align: center"><fmt:message
									key="xml_data_upload" /></th>

							<th style="text-align: center"><fmt:message key="xml_status" /></th>

							<th style="text-align: center"><fmt:message
									key="xml_download" /></th>

							<th style="text-align: center"><fmt:message
									key="xml_excluir" /></th>
						</tr>
					</thead>
					<tbody id="myTable">

						<c:forEach var="xml" items="${listXML}">
							<tr>
								<td>${xml.chNFe}</td>

								<td>${xml.uploadDateString}</td>

								<td><fmt:message
										key="${xml.processingError eq 'false' ? 'xml_processado' : 'xml_nao_processado'}" />
								</td>

								<td><c:url value="/xml" var="urlDownload">
										<c:param name="param_action" value="download" />
										<c:param name="param_chNFe" value="${xml}" />
									</c:url> <a href="${urlDownload}"><span
										class="glyphicon glyphicon-save" /></a></td>

								<td>
									<button class="btn btn-link" data-toggle="modal"
										data-target="#myModal">
										<span class="glyphicon glyphicon-trash" />
									</button>

									<div class="modal fade" id="myModal" tabindex="-1"
										role="dialog" aria-labelledby="myModalLabel"
										aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<h4 class="modal-title" id="myModalLabel">
														<fmt:message key="xml_modal_delete" />
													</h4>
												</div>
												<div class="modal-body">
													<fmt:message key="xml_modal_delete_texto" />
												</div>
												<div class="modal-footer">
													<c:url value="/xml" var="urlDelete">
														<c:param name="param_action" value="delete" />
														<c:param name="param_chNFe" value="${xml}" />
													</c:url>
													<a href="${urlDelete}" class="btn btn-default"><fmt:message
															key="xml_modal_delete_sim" /></a>
													<button type="button" class="btn btn-default"
														data-dismiss="modal">
														<fmt:message key="xml_modal_delete_nao" />
													</button>
												</div>
											</div>
										</div>
									</div>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
			<div class="col-md-12 text-center">
				<ul class="pagination" id="myPager"></ul>
			</div>
		</div>
	</div>

	<%@ include file="../jsp/footer.jsp"%>

	<script type='text/javascript'>
		function startLoadingUpload() {
			document.getElementById('loading_delete').style.visibility = 'visible'
		}

		function stopLoadingUpload() {
			document.getElementById('loading_delete').style.visibility = 'hidden'
		}
		$.fn.pageMe = function(opts) {
			var $this = this, defaults = {
				perPage : 7,
				showPrevNext : false,
				numbersPerPage : 5,
				hidePageNumbers : false
			}, settings = $.extend(defaults, opts);

			var listElement = $this;
			var perPage = settings.perPage;
			var children = listElement.children();
			var pager = $('.pagination');

			if (typeof settings.childSelector != "undefined") {
				children = listElement.find(settings.childSelector);
			}

			if (typeof settings.pagerSelector != "undefined") {
				pager = $(settings.pagerSelector);
			}

			var numItems = children.size();
			var numPages = Math.ceil(numItems / perPage);

			pager.data("curr", 0);

			if (settings.showPrevNext) {
				$('<li><a href="#" class="prev_link">«</a></li>').appendTo(
						pager);
			}

			var curr = 0;
			while (numPages > curr && (settings.hidePageNumbers == false)) {
				$(
						'<li><a href="#" class="page_link">' + (curr + 1)
								+ '</a></li>').appendTo(pager);
				curr++;
			}

			if (settings.numbersPerPage > 1) {
				$('.page_link').hide();
				$('.page_link').slice(pager.data("curr"),
						settings.numbersPerPage).show();
			}

			if (settings.showPrevNext) {
				$('<li><a href="#" class="next_link">»</a></li>').appendTo(
						pager);
			}

			pager.find('.page_link:first').addClass('active');
			pager.find('.prev_link').hide();
			if (numPages <= 1) {
				pager.find('.next_link').hide();
			}
			pager.children().eq(1).addClass("active");

			children.hide();
			children.slice(0, perPage).show();

			pager.find('li .page_link').click(function() {
				var clickedPage = $(this).html().valueOf() - 1;
				goTo(clickedPage, perPage);
				return false;
			});
			pager.find('li .prev_link').click(function() {
				previous();
				return false;
			});
			pager.find('li .next_link').click(function() {
				next();
				return false;
			});

			function previous() {
				var goToPage = parseInt(pager.data("curr")) - 1;
				goTo(goToPage);
			}

			function next() {
				goToPage = parseInt(pager.data("curr")) + 1;
				goTo(goToPage);
			}

			function goTo(page) {
				var startAt = page * perPage, endOn = startAt + perPage;

				children.css('display', 'none').slice(startAt, endOn).show();

				if (page >= 1) {
					pager.find('.prev_link').show();
				} else {
					pager.find('.prev_link').hide();
				}

				if (page < (numPages - 1)) {
					pager.find('.next_link').show();
				} else {
					pager.find('.next_link').hide();
				}

				pager.data("curr", page);

				if (settings.numbersPerPage > 1) {
					$('.page_link').hide();
					$('.page_link').slice(page, settings.numbersPerPage + page)
							.show();
				}

				pager.children().removeClass("active");
				pager.children().eq(page + 1).addClass("active");

			}
		};

		$(document).ready(function() {

			$('#myTable').pageMe({
				pagerSelector : '#myPager',
				showPrevNext : true,
				hidePageNumbers : false,
				perPage : 10
			});

		});
	</script>

</body>
</html>