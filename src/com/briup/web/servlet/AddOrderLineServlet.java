package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Book;
import com.briup.bean.Customer;
import com.briup.exception.BookException;
import com.briup.service.impl.BookServiceImpl;

/**
 * 添加订单到购物车
 */
@WebServlet("/addOrderLine")
public class AddOrderLineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer bookId = Integer.valueOf(request.getParameter("bookId"));
		BookServiceImpl bookServiceImpl = new BookServiceImpl();
		HttpSession session = request.getSession();
		try {
			Book book = bookServiceImpl.listBooksById(bookId);
			Customer customer = (Customer)session.getAttribute("customer");
			
		} catch (BookException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
