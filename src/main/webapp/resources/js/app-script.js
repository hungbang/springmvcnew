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
});