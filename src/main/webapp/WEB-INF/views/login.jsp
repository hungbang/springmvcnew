<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="container">
	<div class="span4 offset4">
		<div class="padded" style="margin-top: 10px">
			<center>


				<img src="resources/img/school.png">

			</center>



			<center>
				<h1>
					<b><font color="red"><img src="resources/img/admin.png"> </font></b>
				</h1>
			</center>





			<center>
				<br>
				<strong>Howdy!</strong> Please, don't tell anyone your password
			</center>
			<div class="login box" style="margin-top: 10px;">
				<div class="box-header">
					<span class="title">Login</span>
				</div>
				<div class="box-content padded">
					<form action="login" method="post" accept-charset="utf-8"
						class="separate-sections" >
						<div style="display: none">
							<input type="hidden" name="login_type" value="center">
						</div>
						<center>
							<div style="height: 100px;">
								<div id="avatar" class="avatar ">

									<img src="resources/img/user1.png"/>
								</div>
							</div>
						</center>
						<div class="input-prepend">
							<span class="add-on" href="#"> <i
								class="glyphicon glyphicon-user"></i>
							</span> <input name="username"  type="text" placeholder="Email"
								autocomplete="off" class="validate[required,custom[email]]" />
						</div>
						<div class="input-prepend">
							<span class="add-on" href="#"> <i class="icon-key"></i>
							</span> <input name="password" path="password" type="password" placeholder="password"
								autocomplete="off" class="validate[required]"/>
						</div>
						<div class="row-fluid">
							<div class="span6">
								<a data-toggle="modal" href="#modal-simple"
									class="btn btn-blue btn-block"> Forgot Password ? </a>
							</div>
							<div class="span6">
								<input type="submit" class="btn btn-gray btn-block "
									value="login">
							</div>
						</div>
						<%-- <input name="roleId" value="${account.roleVO.roleId }"></input> --%>
					</form>
				</div>
			</div>
			<hr>
			<div style="clear: both; color: #aaa; padding: 20px;">

				<center>

					© 2016 <a href="#" target="_blank">Online Examination System v1</a>

				</center>

			</div>
		</div>
	</div>
</div>