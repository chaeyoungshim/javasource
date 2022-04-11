<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//장바구니에 담기(세션 이용)
	//session.setAttribute("product", request.getParameter("product")); //이렇게 하면 기존에 있던 값은 사라지고 새 값만 저장
	
	//사용자 선택 값 가져오기
	String product = request.getParameter("product");
	
	//장바구니 세션이 있는지 확인한 후 추가하기
	ArrayList<String> productList = (ArrayList<String>)session.getAttribute("productList");
	
	if(productList == null) { //장바구니에 처음 담는거라면
		productList = new ArrayList<String>(); 
		productList.add(product);
		session.setAttribute("productList", productList);
	}else {
		productList.add(product);
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>제품 추가</h3>
<p><a href="cart_basket.jsp">장바구니 보기</a></p>
</body>
</html>