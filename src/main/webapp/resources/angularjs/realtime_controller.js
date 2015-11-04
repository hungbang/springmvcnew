/**
 * http://usejsdoc.org/
 */
'use strict';

 //controller real time
 App.controller('ProductController', ['$scope', 'ProductService', function($scope, ProductService){
 	var self = this;
 	self.product = {id: null, product_name: '', price: '', description: ''};
 	self.products = [];

 	self.fetchAllProduct = function(){
 		ProductService.fetchProduct().then(
 				function(data){
 					self.products = data;
 				},function(err){
 					console.log("Error when fetching a Product.");
 				}
 			);
 	};

 }]);