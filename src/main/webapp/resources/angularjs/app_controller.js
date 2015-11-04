/**
 * http://usejsdoc.org/
 */
 'use strict';
 App.controller('AppController', ['$scope','EmployeeService', function($scope, EmployeeService){
 	var self = this;
 	self.employee = {id:null, employee_name: '', address: '', email: ''};
 	self.employees = [];

 	self.fetchAllEmployee = function(){
 		EmployeeService.fetchAllEmployee().then(
 			function(res){
 				self.employees = res;
 			},function(err){
 				console.error('Error when fetch employee');
 			}
 		);
 	};

 	self.createEmp = function(employee){
 		EmployeeService.createEmployee(employee).then(
 			self.fetchAllEmployee
 			,function(err){
 				console.error("Error when create Employee");
 			}
 		);
 	};	
 	self.updateEmp = function(employee, id){
 		EmployeeService.updateEmployee(employee, id).then(
 				self.fetchAllEmployee,
 	 			function(err){
 	 				console.error('Error when update Employee');
 	 			}
 		);
 	};
 	self.deleteEmp = function(id){
 		EmployeeService.deleteEmployee(id).then(
 				self.fetchAllEmployee,
 	 			function(err){
 	 				console.error('Error when delete employee');
 	 			}
 		);
 	};

 	self.fetchAllEmployee();

 	self.submit = function() {
 		if(self.employee.id == null){
 			console.log("Saving employee ", self.employee);
 			self.createEmp(self.employee);
 		}else{
 			self.updateEmp(self.employee, self.employee.id);
 			console.log("Updated employee with id ",self.employee.id);
 		}
 		self.reset();
 	};

 	self.edit = function(id){
 		console.log("Id to be edited ", id);
 		for(var i = 0; i < self.employees.length; i++){
 			if(self.employees[i].id == id){
 				self.employee = angular.copy(self.employees[i]);
 				break;
 			}
 		}
 	};

 	self.remove = function(id){
 		console.log("Id to be deleted ", id);
 		for(var i = 0; i < self.employees.length; i++){
 			if(self.employees[i].id == id){
 				self.reset();
 				break;
 			}
 		}
 		self.deleteEmp(id);
 	};

 	self.reset = function(){
 		self.employee = {id:null, employee_name: '', address: '', email: ''};
 		$scope.myForm.$setPristine();
 	};
 }]);


 
 
