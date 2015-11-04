<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tiles-extra"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/bootstrap/3.3.5/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.3.min.js"/> "></script>
<script src="<c:url value="/resources/bootstrap/3.3.5/js/bootstrap.min.js" />"></script>
<!-- <script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script> -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.7/angular-route.js"></script> -->
<!--DataTables CSS -->
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/DataTables-1.10.9/media/css/jquery.dataTables.css"/>">
<!-- jQuery -->
<%-- <script type="text/javascript" charset="utf8" src="<c:url value="/resources/DataTables-1.10.9/media/js/jquery.js"/>"></script>
 --%><!-- DataTables -->
<script type="text/javascript" charset="utf8" src="<c:url value="/resources/DataTables-1.10.9/media/js/jquery.dataTables.js"/>"></script>

<title>
    <tiles:insertAttribute name="tiles" ignore="true"></tiles:insertAttribute>
</title>
</head>
<body>
    <div id="base-content" class="container">
        <div id="base-header" class="row">
            <tiles:insertAttribute name="header" />
        </div>

        <div id="base-menu" class="row">
            <tiles:insertAttribute name="menu"/>
        </div>

        <div id="body" class="row">
            <tiles:insertAttribute name="body"/>
        </div>

        <div id="footer" class="row">
            <tiles:insertAttribute name="footer"/>
        </div>
    </div>
    <script type="text/javascript" charset="utf8" src="<c:url value="/resources/angularjs/app.js"/>"></script>
    <script type="text/javascript" charset="utf8" src="<c:url value="/resources/angularjs/employee_service.js"/>"></script>
	<script type="text/javascript" charset="utf8" src="<c:url value="/resources/angularjs/app_controller.js"/>"></script>
	<script type="text/javascript" charset="utf8" src="<c:url value="/resources/angularjs/product_controller.js"/>"></script>
	<script type="text/javascript" charset="utf8" src="<c:url value="/resources/angularjs/upc_controller.js"/>"></script>
	<script type="text/javascript" charset="utf8" src="<c:url value="/resources/angularjs/realtime_controller.js"/>"></script>
	<script type="text/javascript" charset="utf8" src="<c:url value="/resources/angularjs/upc_service.js"/>"></script>
    <script type="text/javascript" charset="utf8" src="<c:url value="/resources/js/app-script.js"/>"></script>
</body>
</html>
