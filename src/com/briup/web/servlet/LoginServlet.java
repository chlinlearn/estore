package com.briup.web.servlet;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.briup.bean.Customer;
import com.briup.exception.CustomerException;
import com.briup.service.impl.CustomerServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({"/login"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		System.out.println("name="+name+",passwd="+passwd);
		
		CustomerServiceImpl serviceImpl = new CustomerServiceImpl();
		Customer customer = null;
		try {
			customer = serviceImpl.login(name,passwd);
			System.out.println("登录成功");
			//添加cookie并设置存活时长
			Cookie c1 = new Cookie("isLogin", "true");
			c1.setMaxAge(10*60);//10分钟,切记一定要在返回前设置
			response.addCookie(c1);
			session.setAttribute("customer", customer);
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		} catch (CustomerException e) {
			//内部跳转回登录页面
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("/login.jsp").forward(request,response);
			System.out.println(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
