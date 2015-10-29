/**
 * http://usejsdoc.org/
 */
'use strict';
(function(){
	var app = angular.module('gemStore',[]);

	app.controller('productController', ['$scope','ProductService', function($scope, ProductService){
		this.product = {id: null, product_name: '', price: '', description: '', images: []};
		this.products = [];	

		this.fetchAllProduct = function(){
			ProductService.fetchAllProduct().then(
					function(data){
						this.products = data;
					},function(err){
						console.error('Error when fetch all Product.');
					}
				);
		};
	}]);

	app.controller('GalleryController', function(){
		this.current = 0;
		this.setCurrent = function(current){
			this.current = current | 0;
		}

	});
})();