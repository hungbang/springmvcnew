<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tiles-extra"%>
<div class="navbar navbar-top navbar-inverse">

	<div class="navbar-inner">

		<div class="container-fluid">

			<a class="brand" href="home.php">

			Online Examination System v1
			</a>

			<!-- the new toggle buttons -->

			<ul class="nav pull-right">

				<li class="toggle-primary-sidebar hidden-desktop" data-toggle="collapse" data-target=".nav-collapse-primary"><button type="button" class="btn btn-navbar"><i class="icon-th-list"></i></button></li>

				<li class="hidden-desktop" data-toggle="collapse" data-target=".nav-collapse-top"><button type="button" class="btn btn-navbar"><i class="icon-align-justify"></i></button></li>

			</ul>

			<div class="nav-collapse nav-collapse-top collapse">

            	<ul class="nav pull-right">

					<li class="dropdown">

					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Account <b class="caret"></b></a>					

						<ul class="dropdown-menu">

							<li class="with-image">

								<div class="avatar">

									

									<div class="it_circle">

									 <i class="icon-user icon-5x" style="color:#34495E;"></i>

									 </div>

								</div>

								<span>&nbsp;Demo Admin</span>

							</li>

							<li class="divider"></li>

							

								<li><a href="user.php">

								<i class="icon-user"></i><span>Profile</span></a></li>

								<li><a href="change_password.php">

								<i class="icon-lock"></i><span>Change Password</span></a></li>

								<li><a href="logout.php">

								<i class="icon-off"></i><span>Logout</span></a></li>

						</ul>

                	

					</li>

				</ul>			

                <ul class="nav pull-right">

					<li class="dropdown">

					<a href="#" ><i class="icon-user"></i>Admin Panel </a>

					</li>

				</ul>

				

			</div>

		</div>

	</div>
</div>