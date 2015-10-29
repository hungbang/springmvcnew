/**
 * http://usejsdoc.org/
 */
'use strict';
App.factory('ProductService', ['$http','$q', function($http, $q){
	return {
		fetchAllProduct: function(){
			$http.get("http://localhost:8080/cps/product/").then(
					function(res){
						return res.data;
					},function(err){
						return $q.reject(err);
					}
				);
		},
		
	};
}]);