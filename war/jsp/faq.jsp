<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<head>
<%@ include file="../jsp/head.jsp"%>

<style type="text/css">
.panel-heading .accordion-toggle.collapsed:after {
	content: "\e080" !important;
}

.panel-heading .accordion-toggle:after {
	font-family: 'Glyphicons Halflings';
	content: "\e114" !important;
	float: left;
	margin-right: 5px;
}
</style>

</head>
<body>
	<%@ include file="../jsp/menu.jsp"%>

	<br />
	<div class="panel panel-default">
		<div class="panel-heading">
			<h2 style="display: inline;">
				<fmt:message key="menu_faq" />
			</h2>
		</div>
	</div>

	<hr class="featurette-divider">

	<div class="container">
		<div class="panel-group" id="accordion">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseOne"> <fmt:message
								key="faq_perg1" />
						</a>
					</h4>
				</div>
				<div id="collapseOne" class="panel-collapse collapse">
					<div class="panel-body">
						<p class="lead">
							<fmt:message key="faq_resp1" />
						</p>
						<a
							href="http://www.nfe.fazenda.gov.br/portal/perguntasFrequentes.aspx?tipoConteudo=E4+tmY+ODf4="
							target="_blank" class="btn btn-info"> <fmt:message
								key="learn_more" />
						</a>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseTwo"> <fmt:message
								key="faq_perg2" /></a>
					</h4>
				</div>
				<div id="collapseTwo" class="panel-collapse collapse">
					<div class="panel-body">
						<p class="lead">
							<fmt:message key="faq_resp2" />
						</p>
						<a
							href="http://www.nfe.fazenda.gov.br/portal/perguntasFrequentes.aspx?tipoConteudo=E4+tmY+ODf4="
							target="_blank" class="btn btn-info"> <fmt:message
								key="learn_more" />
						</a>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseThree"> <fmt:message
								key="faq_perg3" />
						</a>
					</h4>
				</div>
				<div id="collapseThree" class="panel-collapse collapse">
					<div class="panel-body">
						<p class="lead">
							<fmt:message key="faq_resp3" />
						</p>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseFour"> <fmt:message
								key="faq_perg4" />
						</a>
					</h4>
				</div>
				<div id="collapseFour" class="panel-collapse collapse">
					<div class="panel-body">
						<p class="lead">
							<fmt:message key="faq_resp4" />
						</p>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseFive"> <fmt:message
								key="faq_perg5" />
						</a>
					</h4>
				</div>
				<div id="collapseFive" class="panel-collapse collapse">
					<div class="panel-body">
						<p class="lead">
							<fmt:message key="faq_resp5" />
						</p>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseSix"> <fmt:message
								key="faq_perg6" />
						</a>
					</h4>
				</div>
				<div id="collapseSix" class="panel-collapse collapse">
					<div class="panel-body">
						<p class="lead">
							<fmt:message key="faq_resp6" />
						</p>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseSeven"> <fmt:message
								key="faq_perg7" />
						</a>
					</h4>
				</div>
				<div id="collapseSeven" class="panel-collapse collapse">
					<div class="panel-body">
						<div class="row">
							<div class="col-sm-3"></div>
							<div class="col-sm-6">
								<div class="flex-video widescreen"
									style="margin: 0 auto; text-align: center;">
									<iframe width="640" height="480"
										src="//www.youtube.com/embed/1jHtT6VXskM" frameborder="0"></iframe>
								</div>
							</div>
							<div class="col-sm-3"></div>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseEight"> <fmt:message
								key="faq_perg8" />
						</a>
					</h4>
				</div>
				<div id="collapseEight" class="panel-collapse collapse">
					<div class="panel-body">
						<div class="row">
							<div class="col-sm-3"></div>
							<div class="col-sm-6">
								<div class="flex-video widescreen"
									style="margin: 0 auto; text-align: center;">
									<iframe width="640" height="480"
										src="//www.youtube.com/embed/CWGlpR-JE0I" frameborder="0"></iframe>
								</div>
							</div>
							<div class="col-sm-3"></div>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseNine"> <fmt:message
								key="faq_perg9" />
						</a>
					</h4>
				</div>
				<div id="collapseNine" class="panel-collapse collapse">
					<div class="panel-body">
						<div class="row">
							<div class="col-sm-3"></div>
							<div class="col-sm-6">
								<div class="flex-video widescreen"
									style="margin: 0 auto; text-align: center;">
									<iframe width="640" height="480"
										src="//www.youtube.com/embed/uggHqf6-6cM" frameborder="0"></iframe>
								</div>
							</div>
						</div>
						<div class="col-sm-3"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Content -->

	<%@ include file="../jsp/footer.jsp"%>

</body>
</html>