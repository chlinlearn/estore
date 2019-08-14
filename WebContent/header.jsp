<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>briup电子商务-首页</title>
	<link rel="stylesheet" href="css/common.css"/>
	<link rel="stylesheet" href="css/style.css" />
	<link rel="stylesheet" href="css/icons.css" />
	<link rel="stylesheet" href="css/table.css" />
	<link rel="stylesheet" type="text/css" href="css/turn.css">
</head>
<body>
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
            <ul class="top_bars">
				<c:if test="${customer.name==null }">
					<li><a href="login.jsp">亲,请先登录<span class="jt_down"></span></a>|</li>
				</c:if>
            	<c:if test="${customer.name!=null }">
            		<li><a>欢迎您!${customer.name }</a> |</li>
            		<li><a href="#">退出<span class="jt_down"></span></a>|</li>
            	</c:if>
                <li><a href="#">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<a href="#"><img src="images/logo.png"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
            <p>
            	<c:forEach var="category" items="${categories }">
            		<a href="#">${category.name }</a>|
            	</c:forEach>
            </p>
        </div>
        <div class="h3_right">
        	<div class="myyy">
            	个人信息
                <span class="sj_down"></span>
             </div>
            <div class="tsc">
            	<a href="admin/shopCart.jsp">去购物车结算</a>
                <span class="sj_right"></span>
            </div>
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
            <ul>
            	<c:forEach var="category" items="${categories }">
            		<li><a href="#">${category.name }</a></li>
            	</c:forEach>
            </ul>
        </div>
    </div>
</body>
</html>