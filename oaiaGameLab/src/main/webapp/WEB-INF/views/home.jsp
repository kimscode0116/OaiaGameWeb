<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>메인페이지입니다</h1>
	<P>${m1}</P>
	<a href="signup"><p>회원가입</p></a>

	<a href="login"><p>로그인</p></a>

	<a href="myList"><p>리스트</p></a>

	<a href="createDB"><p>테이블최초생성(추후삭제)</p></a>


	<!-- 	<a href="myList"><p>리스트</p></a> 자기 카테고리를 추가하고 싶다면 여기 복사해서 추가  -->


</body>
</html>
