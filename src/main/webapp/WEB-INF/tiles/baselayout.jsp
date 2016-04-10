<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tiles-extra"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Mạng xã hội học tập , cung cấp giải pháp cho nghiên cứu và học tập của học sinh | Trắc nghiệm online là hệ thống cho phép bạn tạo và chia sẻ các bài tập trắc nghiệm 1 cách nhanh nhất, hệ thống tổng hợp nhiều đi thi đại học chọn lọc | QuizTest H2T.Com | " />
<meta name="keywords"
	content="trắc nghiệm trực tuyến, mạng xã hội, học tập, đề thi đại học, kiểm tra trắc nghiệm, kiểm tra trắc nghiệm toán học, kiểm tra trắc nghiệm hóa học, kiểm tra trắc nghiệm sinh học, làm tốt trắc nghiệm , trắc nghiệm trên mobile, " />
<meta name="new_keywords"
	content="trắc nghiệm trực tuyến, đề thi đại học, kiểm tra trắc nghiệm, kiểm tra trắc nghiệm toán học, kiểm tra trắc nghiệm hóa học, kiểm tra trắc nghiệm sinh học, làm tốt trắc nghiệm,trắc nghiệm trên mobile, " />
<link rel="icon" href="" type="image/x-icon">
<link rel="shortcut icon" href="" type="image/x-icon">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:100,200,300,400,600,700&amp;subset=latin,vietnamese'
	rel='stylesheet' type='text/css' />
<title><tiles:insertAttribute name="tiles" ignore="true"></tiles:insertAttribute>
</title>
<tiles:insertAttribute name="stylecss" />
<tiles:insertAttribute name="scripts" />
</head>
<body>
	<div id="main_body">
	
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="body" />
	</div>
</body>
</html>