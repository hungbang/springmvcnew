

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tiles-extra"%>



<div class="sidebar-background">
	<div class="primary-sidebar-background"></div>
</div>

<div class="primary-sidebar">



	<br />
	<div style="text-align: center;">
		<a href=""><img src="./resources/img/school.png"
			style="max-height: 100px; max-width: 100px;" /> </a>
	</div>
	<br />
	<ul class="nav nav-collapse collapse nav-collapse-primary">


		<li class="dark-nav"><span class="glow"></span> <a
			href="home.php" rel="tooltip" data-placement="right"
			data-original-title="Dashboard"> <i class="icon-desktop icon-1x"></i>
				<span>Dashboard </span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="category.php" rel="tooltip" data-placement="right"
			data-original-title="Category"> <i
				class="icon-folder-close icon-1x"></i> <span>Category </span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="sub_category.php" rel="tooltip" data-placement="right"
			data-original-title="Sub Category"> <i class="icon-tags icon-1x"></i>
				<span>Sub Category </span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="subject.php" rel="tooltip" data-placement="right"
			data-original-title="Subject"> <i class="icon-tag icon-1x"></i> <span>Subject
			</span>
		</a></li>
		<li class="dark-nav active"><span class="glow"></span> <a
			href="center.php" rel="tooltip" data-placement="right"
			data-original-title="Center"> <i class="icon-building icon-1x"></i>
				<span>Center </span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="student.php" rel="tooltip" data-placement="right"
			data-original-title="Student"> <i class="icon-male icon-1x"></i>
				<span>Student </span>
		</a></li>

		<li class="dark-nav"><span class="glow"></span> <a
			href="exam.php" rel="tooltip" data-placement="right"
			data-original-title="Exam"> <i class="icon-book icon-1x"></i> <span>Exam
			</span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="question_add_sort.php" rel="tooltip" data-placement="right"
			data-original-title="Question"> <i
				class="icon-question-sign icon-1x"></i> <span>Question </span>
		</a></li>

		<li class="dark-nav"><span class="glow"></span> <a
			class="accordion-toggle  " data-toggle="collapse"
			href="#settings_submenu_first" rel="tooltip" data-placement="right"
			data-original-title="Settings"> <i class="icon-cogs icon-1x"></i>
				<span>Settings <i class="icon-caret-down"></i></span>
		</a>

			<ul id="settings_submenu_first" class="collapse">
				<li class=""><a href="general_setting.php"> <i
						class="icon-wrench"></i>&nbsp;General Settings
				</a></li>
				<li class=""><a href="user.php"><i class="icon-user"></i>&nbsp;User</a>
				</li>
			</ul></li>
		<li><span class="glow"></span> <a href="notice.php" rel="tooltip"
			data-placement="right" data-original-title="Notice"> <i
				class="icon-list-ol icon-1x"></i> <span>Notice </span>
		</a></li>
		<li><span class="glow"></span> <a href="selectresult.php"
			rel="tooltip" data-placement="right"
			data-original-title="View Result"> <i class="icon-trophy icon-1x"></i>
				<span>View Result </span>
		</a></li>









	</ul>

</div>


<div class="main-content">
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="area-top clearfix">
				<div class="pull-left header">
					<h3 class="title">
						<i class="icon-edit"></i> Manage Center
					</h3>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid padded">
		<div class="box">
			<div class="box-header">
				<ul class="nav nav-tabs nav-tabs-left">
					<li class="active"><a href="#list" data-toggle="tab"><i
							class="icon-align-justify"></i>Center List</a></li>
					<li><a href="#add" data-toggle="tab"><i class="icon-plus"></i>Add
							Center</a></li>
				</ul>
			</div>
			<div class="box-content padded">
				<div class="tab-content">
					<div class="tab-pane box active" id="list">
						<table cellpadding="0" cellspacing="0" border="0"
							class="dTable responsive">
							<thead>
								<tr>
									<!-- <th><div></div></th> -->
									<th><div>Account Id</div></th>
									<th><div>User Name</div></th>
									<th><div>Password</div></th>
									<th><div>Role Id</div></th>
									<th><div>Status</div></th>
									<th><div>Options</div></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="accounts" items="${Toan}">
									<tr>



										<td>${accounts.accountId}</td>

										<td>${accounts.username}</td>
										<td>${accounts.password }</td>
										<td>${accounts.roleVO.roleId }</td>

										<td><a data-toggle="modal" href="#modal-status-deactive"
											onclick="modal_status_deactive('student_status.php?s_id=${accounts.accountId}')"
											class="btn btn-red btn-small"><i class="icon-eye-close"></i>
												Deactivate</a></td>

										<td align="center"><a data-toggle="modal"
											href="" onclick="modal_edit('/cps/accountAction/${accounts.accountId}')"
											class="btn btn-gray btn-small"><i class="icon-wrench"></i>
												Edit</a> 
												<a data-toggle="modal" href="#modal-delete"
											onclick="modal_delete('studentdelete.php?student_id=${accounts.accountId}')"
											class="btn btn-red btn-small"><i class="icon-trash"></i>
												Delete </a> <a data-toggle="modal" href="#question-modal-form"
											onclick="modal_view_student_profile('View_Student',${accounts.accountId})"
											class="btn btn-blue btn-small"><i class="icon-zoom-in"></i>
												View</a></td>
									</tr>
								</c:forEach>

							</tbody>
						</table>
					</div>

					<div class="tab-pane box" id="add" style="padding: 5px">
						<div class="box-content">
							<form action="" method="post" accept-charset="utf-8"
								class="form-horizontal validatable" target="_top">

								<div class="padded">
									<div class="control-group">
										<label class="control-label">Account Id</label>
										<div class="controls">
											<input type="text" class="validate[required]"
												name="accountId"  />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">User Name</label>
										<div class="controls">
											<input type="text" class="validate[required]" name="userName" />
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">Password</label>
										<div class="controls">
											<input type="password" class="validate[required]"
												name="password" />
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">Role Id</label>
										<div class="controls">
											<input type="text" class="validate[required]"
												name="roleId" />
										</div>
									</div>
									<div class="control-group">
										<label class="control-label"> Role Name</label>
										<div class="controls">
										
											<select name="theme_id" class="chzn-select">
												<c:forEach var="accounts" items="${Toan}">
												<option value="${Toan}">${accounts.roleVO.roleName }</option>
												</c:forEach>

											</select>
											
										</div>
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-gray">Add Center</button>
									<input type="hidden"
										value="{{!ctrl.employee.id ? 'Add' : 'Update'}}" name="submit">
								</div>
							</form>
						</div>
					</div>


				</div>
			</div>
		</div>
	</div>
	<div style="clear: both; color: #aaa; padding: 20px;">

		<center>

			&copy; 2016 <a href="#" target="_blank">Online Examination System
				v1</a>

		</center>

	</div>
</div>
</div>




</body>



<!-----------HIDDEN QUESTION MODAL FORM - COMMON IN ALL PAGES ------>
<div id="question-modal-form" class="modal hide fade">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">&times;</button>
		<div id="modal-tablesLabel_question"
			style="color: #fff; font-size: 16px;">&nbsp;</div>
	</div>
	<div class="modal-body" id="modal-body-question">ORANGE</div>
	<div class="modal-footer">
		<!-- <button class="btn btn-gray" onclick="custom_print('frame1')"><br />
<b>Warning</b>:  constant(): Couldn't find constant TI_PRINT in <b>/home/textujkj/public_html/oesv1/admin/center.php</b> on line <b>217</b><br />
</button> -->
		<button class="btn btn-default" data-dismiss="modal">Close</button>
	</div>
</div>






<!-----------HIDDEN MODAL DELETE CONFIRMATION - COMMON IN ALL PAGES ------>
<div id="modal-delete" class="modal hide fade" style="height: 140px;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">&times;</button>
		<h6 id="modal-tablesLabel">
			<i class="icon-info-sign"></i> Confirmation!
		</h6>
	</div>
	<div class="modal-delete-body" id="modal-body-delete">Are you
		sure, you want to delete this center ?</div>
	<div class="modal-footer">
		<a href="" id="delete_link" class="btn btn-red">Confirm</a>
		<button class="btn btn-default" data-dismiss="modal">Cancel</button>
	</div>
</div>
<!-----------HIDDEN MODAL ACTIVE STATUS CONFIRMATION - COMMON IN ALL PAGES ------>

<div id="modal-status-active" class="modal hide fade"
	style="height: 140px;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">&times;</button>
		<h6 id="modal-tablesLabel">
			<i class="icon-info-sign"></i>&nbsp; Confirmation!
		</h6>
	</div>
	<div class="modal-delete-body" id="modal-body-delete">Sure, you
		want to Activate ?</div>
	<div class="modal-footer">
		<a href="center_status.php?c_id=" id="active_link" class="btn btn-red">Confirm</a>
		<button class="btn btn-default" data-dismiss="modal">Cancel</button>
	</div>
</div>


<div id="modal-status-deactive" class="modal hide fade"
	style="height: 140px;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">&times;</button>
		<h6 id="modal-tablesLabel">
			<i class="icon-info-sign"></i>&nbsp; Confirmation!
		</h6>
	</div>
	<div class="modal-delete-body" id="modal-body-delete">Sure, you
		want to Dectivate ?</div>
	<div class="modal-footer">
		<a href="center_status.php?c_id=" id="deactive_link"
			class="btn btn-red">Confirm</a>
		<button class="btn btn-default" data-dismiss="modal">Cancel</button>
	</div>
</div>


<div id="modal-edit" class="modal hide fade"
	style="height: 140px;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">&times;</button>
		<h6 id="modal-tablesLabel">
			<i class="icon-info-sign"></i>&nbsp; Confirmation!
		</h6>
	</div>
	<div class="modal-delete-body" id="modal-body-delete">Sure, you
		want to Edit ?</div>
	<div class="modal-footer">
		<a href="center_status.php?c_id=" id="edit_link"
			class="btn btn-red">Confirm</a>
		<button class="btn btn-default" data-dismiss="modal">Cancel</button>
	</div>
</div>






<script>

function modal_edit(param){
	alert("=="+ param);
	$.ajax({
		url: param,
		type: 'POST',
		dataType: 'json',
		
	})
	.done(function(data) {
		console.log("data"+data);
		console.log("success");
	})
	.fail(function() {
		console.log("error");
	})
	.always(function(data) {
		console.log(data);
		console.log("complete");
	}); 
	
	
}
	function modal_status_active(param1) {
		document.getElementById('active_link').href = param1;
	}

	function modal_status_deactive(param1) {
		document.getElementById('deactive_link').href = param1;
	}

	function modal_delete(param1) {
		document.getElementById('delete_link').href = param1;
	}

	function modal_view_center_profile(param1, param2, param3) {
		document.getElementById('modal-body-question').innerHTML = '<iframe id="frame1" src="center_view.php?c_id='
				+ param2
				+ '" width="100%" height="400" frameborder="0"></iframe>';
		document.getElementById('modal-tablesLabel_question').innerHTML = param1
				.replace("_", " ");
	}
</script>





