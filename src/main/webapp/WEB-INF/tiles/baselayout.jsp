<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tiles-extra"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/bootstrap/3.3.5/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<script src="<c:url value="/resources/bootstrap/3.3.5/js/bootstrap.min.js" />"></script>
<title>
	<tiles:insertAttribute name="tiles" ignore="true"></tiles:insertAttribute>
</title>
</head>
<body>
	<div id="base-content" class="container row">
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
</body>
</html>
