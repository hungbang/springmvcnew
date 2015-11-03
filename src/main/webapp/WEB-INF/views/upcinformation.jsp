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
	  <li class="active"><a data-toggle="tab" href="#mrt">MRT</a></li>
	  <li><a data-toggle="tab" href="#productUpc">Product & UPC</a></li>
	  <li><a data-toggle="tab" href="#authDistribution">Authorized & Distribution</a></li>
	  <li><a data-toggle="tab" href="#additionalInfo">Additional Information</a></li>
	</ul>

	<div class="tab-content">
	  <div id="mrt" class="tab-pane fade in active">
		     <div class="panel panel-default">
		     	<div class="panel-heading panel-style" data-toggle="collapse" data-target=".panel-body"><span class="glyphicon glyphicon-menu-down"></span> UPC Information</div>
		     	<div class="panel-body collapse in" id="idPanel">
		     		<div class="table-responsive">
		     			<table class="table table-hover">
		     				<thead>
		     					<tr>
		     						<th>Unit UPC</th>
		     						<th>Sellable Unit <span class="badge">5</span></th>
		     						<th>Description</th>
		     						<th>Item Code</th>
		     						<th>Needs Approval</th>
		     						<th></th>
		     					</tr>
		     				</thead>
		     				<tbody>
		     					<tr>
		     						<td>
		     							<div class="col-md-6">
		     								<input type="text" name="" id="input" class="form-control" value="" required="required" pattern="" title="" maxlength="13">
		     							</div>
		     							<div class="col-md-3">
		     								<input type="number" name="" id="input" class="form-control" value="" min="0" max="9" step="" required="required" title="">
		     							</div>
		     						</td>
		     						<td></td>
		     						<td></td>
		     						<td></td>
		     						<td></td>
		     						<td>
		     							<button type="button" class="btn btn-primary">Add</button>
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
