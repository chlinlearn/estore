package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Customer;
import com.briup.exception.CustomerException;
import com.briup.service.impl.CustomerServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerServiceImpl serviceImpl = new CustomerServiceImpl();		
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		String zip = request.getParameter("zip");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		System.out.println("["+"name=" + name + ", passwd=" + passwd + ", zip=" + zip + ", telephone="
				+ telephone + ", email=" + email + "]");
		Customer customer = new Customer(name,passwd,zip,telephone,email);
		try {
			serviceImpl.register(customer);
			System.out.println("注册成功");
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		} catch (CustomerException e) {
			//内部跳转回注册页面
			request.getRequestDispatcher(request.getContextPath()+"/register.jsp");
			System.out.println(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
