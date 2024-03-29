<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<head>
<%@ include file="/jsp/head.jsp"%>
</head>
<body>
	<%@ include file="/jsp/menu.jsp"%>

	<div class="container">

		<div class="jumbotron">
			<section class="row">
				<div class="col-sm-6">
					<div class="flex-video widescreen">
						<iframe width="640" height="480"
							src="//www.youtube.com/embed/gmbts9t1LDg" frameborder="0"
							allowfullscreen></iframe>
					</div>
				</div>
				<div class="col-sm-6">
					<h1 class="featurette-heading">
						<fmt:message key="video_descricao" />
					</h1>
				</div>
			</section>
		</div>

		<h2 class="featurette-heading">
			<fmt:message key="info_somente_3_passos" />
		</h2>

		<div class="row">
			<div class="col-lg-4">
				<h4>
					<a href="/dashboard" class="link"> <span class="red">1</span> <fmt:message
							key="info_login_google" />
					</a>
				</h4>
				<p>
					<fmt:message key="info_login_google_texto" />
				</p>
			</div>
			<div class="col-lg-4">
				<h4>
					<a href="/dashboard" class="link"> <span class="orange">2</span>
						<fmt:message key="info_upload_nfes" />
					</a>
				</h4>
				<p>
					<fmt:message key="info_upload_nfes_empresa" />
				</p>
			</div>
			<div class="col-lg-4">
				<h4>
					<a href="/dashboard" class="link"> <span class="green">3</span>
						<fmt:message key="info_resultados" />
					</a>
				</h4>
				<p>
					<fmt:message key="info_analise_o_dashboard" />
				</p>
			</div>
		</div>

		<hr class="featurette-divider">

		<div class="row featurette">
			<div class="col-md-9">
				<h2 class="featurette-heading">
					<fmt:message key="sobre_titulo1" />
				</h2>
				<p class="lead">
					<fmt:message key="sobre_texto1" />
				</p>
			</div>
			<div class="col-md-3">
				<img class="featurette-image img-responsive"
					src="/images/sobre1.jpg" alt="NFe">
			</div>
		</div>

		<hr class="featurette-divider">

		<div class="row featurette">
			<div class="col-md-3">
				<img class="featurette-image img-responsive"
					src="/images/sobre2.jpg" alt="Brasil competitivo">
			</div>
			<div class="col-md-9">
				<h2 class="featurette-heading">
					<fmt:message key="sobre_titulo2" />
				</h2>
				<p class="lead">
					<fmt:message key="sobre_texto2" />
				</p>
				<a href="http://www.nfe.fazenda.gov.br/portal/infoEstatisticas.aspx"
					target="_blank" class="btn btn-info"> <fmt:message
						key="learn_more" />
				</a>
			</div>
		</div>

		<hr class="featurette-divider">

		<div class="row featurette">
			<div class="col-md-9">
				<h2 class="featurette-heading">
					<fmt:message key="sobre_titulo3" />
				</h2>
				<p class="lead">
					<fmt:message key="sobre_texto3" />
				</p>
			</div>
			<div class="col-md-3">
				<p class="center-block">
					<img class="featurette-image img-responsive"
						src="/images/sobre5.jpg" alt="Respositório">
				</p>
			</div>
		</div>


		<hr class="featurette-divider">

		<div class="row featurette">
			<div class="col-md-3">
				<p class="center-block">
					<img class="featurette-image img-responsive"
						src="/images/sobre3.jpg" alt="Estatísticas">
				</p>
			</div>
			<div class="col-md-9">
				<h2 class="featurette-heading">
					<fmt:message key="sobre_titulo4" />
				</h2>
				<p class="lead">
					<fmt:message key="sobre_texto4" />
				</p>
			</div>
		</div>

		<hr class="featurette-divider">

		<div class="row featurette">
			<div class="col-md-9">
				<h2 class="featurette-heading">
					<fmt:message key="sobre_titulo5" />
				</h2>
				<p class="lead">
					<fmt:message key="sobre_texto5" />
				</p>
				<a href="https://cloud.google.com/" target="_blank"
					class="btn btn-info"> <fmt:message key="learn_more" />
				</a>
			</div>
			<div class="col-md-3">
				<p class="center-block">
					<img class="featurette-image img-responsive"
						src="/images/sobre4.jpg" alt="Google Cloud Platform">
				</p>
			</div>
		</div>




	</div>

	<%@ include file="/jsp/footer.jsp"%>

</body>
</html>