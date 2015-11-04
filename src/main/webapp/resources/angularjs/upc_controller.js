/**
 * http://usejsdoc.org/
 */
'use strict';

 App.controller('UpcInformation', ['$scope','UpcInformationService', function($scope, UpcInformationService){
 	var self= this;
 	self.upc = {unitUpc: null, digit: '', sellAbleUnit: null, description: '', itemCode: '', needApproval: ''};
 	self.upcs = [];
 	self.upcs.push(self.upc);

 	self.submit = function(){
 		console.log("xxxxxxxxxxxx submit function");
 		console.log(self.upcs);
 	}

 	self.addRow = function(){
 		console.log("xxxxxxxxxxx addRow function");
 		
 	}
 	self.validate = function(){
 		console.log("validate before add");
 	}
 }]);