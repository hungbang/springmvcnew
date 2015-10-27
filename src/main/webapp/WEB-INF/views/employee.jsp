<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
<style type="text/css">
	.floatRight{
	float:right;
	margin-right: 18px;
}

.has-error{
	color:red;
}
.formcontainer{
	background-color: #DAE8E8;
	padding: 20px;
}

.tablecontainer{
	padding-left: 20px;
}

body, #mainWrapper {
	height: 70%;
	background-color:rgb(245, 245, 245);
}

body, .form-control{
	font-size:12px!important;
}

.generic-container {
  width:80%;
  margin-left: 20px;
  margin-top: 20px;
  margin-bottom: 20px;
  padding: 20px;
  background-color: #EAE7E7;
  border: 1px solid #ddd;
  border-radius: 4px;
  box-shadow: 0 0 30px black;
}

.custom-width {
    width: 80px !important;
}
</style>
</head>
<body ng-app="myApp" class="ng-cloak">
	<div class="generic-container" ng-controller="AppController as ctrl">
		<div class="panel panel-default">
			  <div class="panel-heading">
					<h3 class="panel-title">Angular JS and Spring MVC</h3>
			  </div>
			  <div class="panel-body">
					<div class="formcontainer">
						<form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
							<input type="hidden" ng-model="ctrl.employee.id"/>
								<div class="row">
									<div class="form-group col-md-12">
										<label class="col-md-2 control-label" for="file">Name</label>
										<div class="col-md-7">
											<input type="text" ng-model="ctrl.employee.employeeName" name="ename" class="employeename form-control input-sm" placeholder="Enter your name:" required ng-minlength="3" >
										</div>
										<div class="has-error" ng-show="myForm.$dirty">
											<span ng-show="myForm.ename.$error.required">This is required field</span>
											<span ng-show="myForm.ename.$error.minlength">Minimum length required is 3</span>
											<span ng-show="myForm.ename.$invalid">This field is invalid</span>
										</div>
									</div>
								</div>
								
								<div class="row">
									<div class="form-group col-md-12">
										<label class="col-md-2 control-label" for="file">Address</label>
										<div class="col-md-7">
											<input type="text" ng-model="ctrl.employee.address" class="form-control input-sm" placeholder="Enter your address.[This field is validation free]"/>
										</div>
									</div>
								</div>
								
								<div class="row">
									<div class="form-group col-md-12">
										<label class="col-md-2 control-label" for="file">Email</label>
										<div class="col-md-7">
											<input type="text" ng-model="ctrl.employee.email" name="email" class="form-control input-sm" placeholder="Enter your Email." required>
										</div>
										<div class="has-error" ng-show="myForm.$dirty">
											<span ng-show="myForm.email.$error.required">This is required field.</span>
											<span ng-show="myForm.email.$invalid">This field is invalid</span>
										</div>
									</div>
								</div>
								
								<div class="row">
									<div class="form-acions floatRight">
										<input type="submit" value="{{!ctrl.employee.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid"/>
										<button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
									</div>
								</div>
						</form>
					</div>
			  </div>
		</div>

		<div class="panel panel-default">
			  <div class="panel-heading">
					<span class="lead">List of Employees </span>
			  </div>
			  <div class="tablecontainer">
			  		<table class="table table-hover">
			  			<thead>
			  				<tr>
			  					<th>ID</th>
			  					<th>Employee Name</th>
			  					<th>Email</th>
			  					<th>Address</th>
			  				</tr>
			  			</thead>
			  			<tbody>
			  				<tr ng-repeat="e in ctrl.employees track by $index">
			  					<td><span ng-bind="e.id"></span></td>
			  					<td> <span ng-bind="e.employeeName"></span> </td>
			  					<td> <span ng-bind="e.email"></span> </td>
			  					<td> <span ng-bind="e.address" ></span> </td>
			  					<td>
			  						<button type="button" ng-click="ctrl.edit(e.id)" class="btn btn-success custom-width">Edit</button>
			  						<button type="button" ng-click="ctrl.remove(e.id)" class="btn btn-danger custom-width">Remove</button>
			  					</td>
			  				</tr>
			  			</tbody>
			  		</table>
			  </div>
		</div>

	</div>
	 
	 
</body>
</html>