<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%@ page import="com.google.appengine.api.users.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	UserService userService = UserServiceFactory.getUserService();
	User user = userService.getCurrentUser();
	request.setAttribute("user", user);
	request.setAttribute("logoutURL", userService.createLogoutURL("/"));
	request.setAttribute("loginURL", userService.createLoginURL("/dashboard"));
%>
<script type="text/javascript">

	loadAvatar = function() {
		var xhr = new XMLHttpRequest();
		xhr.open('HEAD', 'http://plus.google.com/s2/photos/profile/me?sz=25',
				true);
		xhr.onreadystatechange = function() {
			if (xhr.status == 200) {
				$('#avatar')
						.html(
								'<img src="'+path+'" class="img-circle" />&nbsp;<span class="user-info">${user.nickname}</span><b class="caret">');
			}
		};
		xhr.send();
	};
	
	setTimeout(loadAvatar, 500);
	
</script>
<div style="height: 50px;">

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/"> <img src="../images/logo.gif" />
			</a>
		</div>

		<div class="collapse navbar-collapse navbar-ex1-collapse">

			<ul class="nav navbar-nav navbar-right navbar-user">

				<c:if test="${user.nickname != null}">
					<li><a href="/dashboard"><button type="button"
								class="btn btn-success">
								<span class="glyphicon glyphicon-dashboard"> </span>
								<fmt:message key="menu_dashboard" />
							</button> </a></li>
				</c:if>

				<li class="dropdown"><a data-toggle="dropdown" href="#"
					class="dropdown-toggle">
						<button type="button" class="btn btn-info">
							<span class="glyphicon glyphicon-info-sign"> </span>
							<fmt:message key="menu_opcoes" />
							<b class="caret"></b>
						</button>
				</a>

					<ul
						class="user-menu dropdown-menu dropdown-yellow dropdown-caret dropdown-close">

						<li><a
							href="http://www.google.com/moderator/#15/e=214417&t=214417.40&f=214417.6e507c"
							target="_blank"><span class="glyphicon glyphicon-info-sign">
							</span> <fmt:message key="menu_moderator" /> </a></li>

						<li><a href="/faq"><span
								class="glyphicon glyphicon-question-sign"> </span> <fmt:message
									key="menu_faq" /> </a></li>
						<li><a href="/contact"><span
								class="glyphicon glyphicon-envelope"> </span> <fmt:message
									key="menu_contato" /> </a></li>

						<li><a href="#" onclick="$('#language_modal').modal('show');">
								<span class="glyphicon glyphicon-globe"> </span> <fmt:message
									key="menu_linguagem" />
						</a></li>


					</ul></li>


				<c:if test="${user.nickname != null}">
					<li class="dropdown"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"><span class="btn btn-danger">
								<div id="avatar">
									<span class="user-info">${user.nickname}</span> <b
										class="caret"></b>
								</div>
						</span></a>

						<ul
							class="user-menu dropdown-menu dropdown-yellow dropdown-caret dropdown-close">

							<li><a href="/xml"><span
									class="glyphicon glyphicon-folder-open"> </span> <fmt:message
										key="menu_xml" /> </a></li>

							<li><a href="/api_key"><span
									class="glyphicon glyphicon-wrench"></span> <fmt:message
										key="menu_api_key" /> </a></li>


							<li class="divider"></li>

							<li><a href="${logoutURL}"><span
									class="glyphicon glyphicon-off"> </span> <fmt:message
										key="menu_logout" /> </a></li>

						</ul></li>
				</c:if>

				<c:if test="${user.nickname == null}">
					<li><a href="${loginURL}"><button type="button"
								class="btn btn-danger">
								<span class="glyphicon glyphicon-user"> </span>
								<fmt:message key="menu_login" />
							</button></a></li>
				</c:if>

				<li>&nbsp;&nbsp;</li>
			</ul>


		</div>
	</nav>

</div>
