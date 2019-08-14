<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>订单列表</title>
<link rel="stylesheet" href="../css/common.css"/>
<link rel="stylesheet" href="../css/style.css" />
<link rel="stylesheet" href="../css/icons.css" />
<link rel="stylesheet" href="../css/table.css" />
<link rel="stylesheet" type="text/css" href="../css/orderlist.css">
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
                订单列表
            </div>
        </div>
    </div>

    <!--内容-->
    <div class="container4">
        <table>
            <thead>
                <tr>
                    <th>序号</th>
                    <th>订单编号</th>
                    <th>订单金额</th>
                    <th>订单时间</th>
                    <th>收货人</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td align="center">1</td>
                    <td>2000-2901</td>
                    <td>234</td>
                    <td>未付款</td>
                    <td>tom</td>
                    <td><input type="button" value="删除" onclick="javascript:window.location='admin/orderlist.jsp';"><input type="button" value="明细" onclick="javascript:window.location='admin/orderlist.jsp';">  </td>
                </tr>
                <tr>
                    <td align="center">1</td>
                    <td>2000-2902</td>
                    <td>234</td>
                    <td>未付款</td>
                    <td>tom</td>
                    <td><input type="button" value="删除" onclick="javascript:window.location='admin/orderlist.jsp';"><input type="button" value="明细" onclick="javascript:window.location='admin/orderlist.jsp';">  </td>
                </tr>
                <tr>
                    <td align="center">1</td>
                    <td>2000-2903</td>
                    <td>234</td>
                    <td>未付款</td>
                    <td>tom</td>
                    <td><input type="button" value="删除" onclick="javascript:window.location='admin/orderlist.jsp';"><input type="button" value="明细" onclick="javascript:window.location='admin/orderlist.jsp';">  </td>
                </tr>
                <tr>
                    <td align="center">1</td>
                    <td>2000-2904</td>
                    <td>234</td>
                    <td>未付款</td>
                    <td>tom</td>
                    <td><input type="button" value="删除" onclick="javascript:window.location='admin/orderlist.jsp';"><input type="button" value="明细" onclick="javascript:window.location='admin/orderlist.jsp';">  </td>
                </tr>
                <tr>
                    <td align="center">1</td>
                    <td>2000-2905</td>
                    <td>234</td>
                    <td>未付款</td>
                    <td>tom</td>
                    <td><input type="button" value="删除" onclick="javascript:window.location='admin/orderlist.jsp';"><input type="button" value="明细" onclick="javascript:window.location='admin/orderlist.jsp';">  </td>
                </tr>
                <tr>
                    <td align="center">1</td>
                    <td>2000-2906</td>
                    <td>234</td>
                    <td>未付款</td>
                    <td>tom</td>
                    <td><input type="button" value="删除" onclick="javascript:window.location='orderlist.html';"><input type="button" value="明细" onclick="javascript:window.location='orderdetail.html';">  </td>
                </tr>
            </tbody>
        </table>

    </div>
    <!--脚部-->
	<%@include file="../footer.jsp" %>

</body>
</html>
