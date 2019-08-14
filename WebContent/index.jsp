<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-首页</title>
</head>
<body>
	<!--顶部-->
	<%@include file="header.jsp" %>

	<div class="container3">
    	<div class="c3_b1">
        	<div class="c3_b1_left">
            	<dl>
            		<c:forEach var="category" items="${categories }">
	               		<dd>
	                    	<h1>${category.name }</h1>
	                    	<p style="width: 180px">
		                    	<c:forEach var="subCategory" items="${category.subCategories }">
		                        	<a href="categoryList?categoryId=${subCategory.id}&parentId=${category.id } ">${subCategory.name }</a>
		                        	<%-- <a href="list.jsp?categoryId=${subCategory.id}&parentId=${subCategory.parentId } ">${subCategory.name }</a> --%>
		                    	</c:forEach>
	                    	</p>
	                    </dd> 
                    </c:forEach>                   
                </dl>
            </div>
            <div class="c3_b1_center">
            	<!-- <div>
                	<a href="#"><img src="images/ad1.png"></a>
                </div> -->
                <!-- 图片伦伯 -->
                <div class="carousel" id="carousel">
                    <div class="btns">
                        <a href="javascript:;" class="leftBtn" id="leftBtn"></a>
                        <a href="javascript:;" class="rightBtn" id="rightBtn"></a>
                    </div>
                    <div class="m_unit" id="m_unit">
                        <ul>
                            <li><a href="#"><img src="images/round_img.png"/></a></li>
                            <li><a href="#"><img src="images/round_img.png"/></a></li>
                            <li><a href="#"><img src="images/round_img.png"/></a></li>
                            <li><a href="#"><img src="images/round_img.png"/></a></li>
                            <li><a href="#"><img src="images/round_img.png"/></a></li>
                        </ul>
                    </div>
                    <div class="circles" id="circles">
                        <ol>
                            <li class="cur"></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                        </ol>
                    </div>
                </div>
                <div class="c3_b1_c_bottom">
                    <ul>
                        <li>
                           <a href="viewBook.jsp"><img src="images/noimg.jpg" style="width: 150px; height: 151px"/></a>
                           <a href="viewBook.jsp">Java从入门到精通</a>
                        </li>
                       <li>
                           <a href="viewBook.jsp"><img src="images/p01.png"/></a>
                           <a href="viewBook.jsp">Java从入门到精通</a>
                        </li>
                        <li>
                           <a href="viewBook.jsp"><img src="images/p01.png"/></a>
                           <a href="viewBook.jsp">Java从入门到精通</a>
                        </li>
                    </ul>
            	</div>
            </div>
            <div class="c3_b1_right">
            	<h1>杰普快报<a href="#">更多</a></h1>
            	<ul>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                </ul>
            </div>
            <div style="clear:both"></div>
        </div>
        <div class="c3_b2">
        	<ul>
            	<li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.jsp">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.jsp">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
               <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li class="no_mr">
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                    <div class="c3_b2_txt">
                        <h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                    <div class="c3_b2_txt">
                        <h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li class="no_mr">
                    <div class="c3_b2_txt">
                        <h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                    <div class="c3_b2_txt">
                        <h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li class="no_mr">
                    <div class="c3_b2_txt">
                        <h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="viewBook.html">更多精彩，点击进入</a></p>
                    </div>
                </li>
            </ul>
        </div>
    <div class="c20"></div>
    
    <!--脚部-->
	<%@include file="footer.jsp" %>
</body>
</html>
