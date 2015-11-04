<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<style type="text/css">
	.margintop-bottom{
		margin-top: 40px;
		margin-bottom: 40px;
	}
	fieldset {
	    border: 1px solid #DDD;
	    padding: 0 1.4em 1.4em 1.4em;
	    margin: 0 0 1.5em 0;
	}

	legend {
	    font-size: 1em;
	    width: 9%;
	    border-bottom: none;
	    cursor: pointer;
	    
	}
	.panel-style{
		cursor: pointer;
		
	}
</style>
<form action="" method="POST" role="form">
	<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 margintop-bottom">
	<ul class="nav nav-tabs nav-justified">
	  <li class="active"><a id="mrtTab" data-toggle="tab" href="#mrt">MRT</a></li>
	  <li><a id="prodAndUpcTab" data-toggle="tab" href="#productUpc">Product & UPC</a></li>
	  <li><a id="authAndDistTab" data-toggle="tab" href="#authDistribution">Authorized & Distribution</a></li>
	  <li><a id="additionalTab" data-toggle="tab" href="#additionalInfo">Additional Information</a></li>
	</ul>

	<div class="tab-content" ng-app="myApp">
	  <div id="mrt" class="tab-pane fade in active">
		     <div class="panel panel-default">
		     	<div class="panel-heading panel-style" data-toggle="collapse" data-target=".panel-body"><span class="glyphicon glyphicon-menu-down"></span> UPC Information</div>
		     	<div class="panel-body collapse in" id="idPanel">
		     		<div class="table-responsive">
		     			<table class="table table-hover" ng-controller="UpcInformation as upcCtrl">
		     				<thead>
		     					<tr class="row">
		     						<th class="col-md-2 text-center">Unit UPC</th>
		     						<th class="col-md-2 text-center">Sellable Unit <span class="badge">5</span></th>
		     						<th class="col-md-2 text-center">Description</th>
		     						<th class="col-md-2 text-center">Item Code</th>
		     						<th class="col-md-2 text-center">Needs Approval</th>
		     						<th class="col-md-2 text-center"></th>
		     					</tr>
		     				</thead>
		     				<tbody>
		     					<tr class="row" ng-repeat="upc in upcCtrl.upcs">
		     						<td class="col-md-3">
		     							<div class="row">
		     								   <div class="col-md-8">
		     								   		<input type="text" name="unitUPC" id="input" class="form-control input-sm" value="{{upc.unitUpc}}" required="required" pattern="" ng-maxlength="5" ng-model="upc.unitUpc">
		     								   </div>
													
		     								   <div class="col-md-3">
		     								   		<input type="text" name="digit" id="input" class="form-control input-sm" value="" min="0" max="9" step="" required="required" maxlength="1" ng-model="upc.digit">
		     								   </div>
		     							    
		     							</div>
		     						</td>
		     						<td class="col-md-2 text-center"><input type="text" name="" id="input" class="form-control input-sm" value="" min="0" max="9" step="" required="required" title="" maxlength="5" ng-model="upc.sellAbleUnit"></td>
		     						<td class="col-md-2 text-center">{{upc.description}}</td>
		     						<td class="col-md-2 text-center">{{upc.itemCode}}</td>
		     						<td class="col-md-2 text-center">{{upc.needApproval}}</td>
		     						<td class="col-md-1 text-center">
		     							<button type="button" class="btn btn-primary" ng-click="upcCtrl.addRow()">Add</button>
		     						</td>
		     					</tr>
		     				</tbody>
		     			</table>
		     		</div>
		     	</div>
		     </div>
	  </div>
	  <div id="productUpc" class="tab-pane fade">
		    <h3>Menu 1</h3>
		    <p>Some content in menu 1.</p>
	  </div>
	  <div id="authDistribution" class="tab-pane fade">
		    <h3>Menu 2</h3>
		    <p>Some content in menu 2.</p>
	  </div>
	  <div id="additionalInfo" class="tab-pane fade">
		    <h3>Menu 2</h3>
		    <p>Some content in menu 2.</p>
	  </div>
	</div>
</div>
</form>
