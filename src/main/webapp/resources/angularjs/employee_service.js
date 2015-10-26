/**
 * http://usejsdoc.org/
 */
'use strict';
App.factory('EmployeeService', ['$http','$q', function($http, $q){
	return {
		fetchAllEmployee: function(){
			return $http.get('http://localhost:8080/cps/employee/').then(
				function(res){
					return res.data;
				},
				function(err){
					console.log("Error when fetch employee");
					return $q.reject(err);
				}
				);
		},

		createEmployee: function(user){
			return $http.post('http://localhost:8080/cps/employee/', employee).then(
				function(res){
					return res.data;
				},
				function(err){
					console.log("Error when create one employee");
					return $q.reject(err);
				}
			);	
		},

		updateEmployee: function(employee, id){
			return $http.put('http://localhost:8080/cps/employee/'+id, employee).then(
				function(res){
					return res.data;
				},function(err){
					console.log('Error when Update Employee');
					return $q.reject(err);
				}
			);
		},		

		deleteEmployee: function(id){
			return $http.delete('http://localhost:8080/cps/employee/'+id).then(
				function(res){
					return res.data;
				},function(err){
					console.log('Error when delete a employee');
					return $q.reject(err);
				}
			);
		}
	};
}]);