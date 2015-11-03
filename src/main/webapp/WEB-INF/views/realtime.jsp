<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body ng-controller="productController as prodCtrl">
	<div class="list-group">
		<div class="list-group-item" ng-repeat="product in prodCtrl.products">
			<h3>{{product.productName}}<em class="pull-right">{{product.price | currency}}</em> </h3>
			<div ng-controller="GalleryController as gallery" ng-show="product.images.length">
				<div class="img-wrap">
					<img ng-src="{{product.images(gallery.)}}">

				</div>
			</div>
		</div>
		
	</div>
</body>
</html>