/**
 * http://usejsdoc.org/
 */
$(document).ready(function(){
  $(".panel-body").on("hide.bs.collapse", function(){
    $(".panel-heading").html('<span class="glyphicon glyphicon-menu-down"></span> UPC Information');
  });
  $(".panel-body").on("show.bs.collapse", function(){
    $(".panel-heading").html('<span class="glyphicon glyphicon-menu-up"></span> UPC Information');
  });
  
  $("nav nav-tabs #mrtTab").on("hide.bs.tab", function(event){
	 console.log("mrtTab hide");
  });
  $("nav nav-tabs #prodAndUpcTab").on("hide.bs.tab", function(event){
		 console.log("mrtTab hide");
	  });
  $("nav nav-tabs #authAndDistTab").on("hide.bs.tab", function(event){
		 console.log("mrtTab hide");
	  });
  $("nav nav-tabs #additionalTab").on("hide.bs.tab", function(event){
		 console.log("mrtTab hide");
	  });
  
  $("nav nav-tabs #mrtTab").on("show.bs.tab", function(event){
		 console.log("mrtTab hide");
	  });
	  $("nav nav-tabs #prodAndUpcTab").on("show.bs.tab", function(event){
			 console.log("mrtTab hide");
		  });
	  $("nav nav-tabs #authAndDistTab").on("show.bs.tab", function(event){
			 console.log("mrtTab hide");
		  });
	  $("nav nav-tabs #additionalTab").on("show.bs.tab", function(event){
			 console.log("mrtTab hide");
		  });
});