<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>订单详情</title>
<link rel="stylesheet" href="../css/common.css"/>
<link rel="stylesheet" href="../css/style.css" />
<link rel="stylesheet" href="../css/icons.css" />
<link rel="stylesheet" href="../css/table.css" />
<link rel="stylesheet" type="text/css" href="../css/orderdetail.css">
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
        <a href="#"><img src="../images/logo.png"></a>
        <div class="h3_center">
            <div class="search_box">
                <input type="text"/>
                <span>搜索</span>
            </div>

        </div>

    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                订单详情
            </div>
        </div>
    </div>

    <!--内容-->
    <div class="container4">
        <div class="shop_detail">商品购物清单</div>
        <table>
            <!-- <thead>
                <tr>
                    <th>序号</th>
                    <th>订单编号</th>
                    <th>订单金额</th>
                    <th>订单状态</th>
                    <th>付款方式</th>
                    <th>操作</th>
                </tr>
            </thead> -->
            <tbody>
                <tr>
                    <td>1</td>
                    <td>corejava</td>
                    <td>价格：<span>35</span></td>
                    <td>数量：<span>35</span></td>
                    <td>小计：<span>35*35</span></td>
                    
                </tr>
				<tr>
                    <td>2</td>
                    <td>第二本书</td>
                    <td>价格：<span>35</span></td>
                    <td>数量：<span>35</span></td>
                    <td>小计：<span>35*35</span></td>
                </tr>
                <tr>
                    <td colspan="5" class="count">合计：<span>35</span></td>
                </tr>
            </tbody>
        </table>

    </div>
    <!--脚部-->
    <%@include file="../footer.jsp" %>

</body>
</html>