package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Category;
import com.briup.exception.CategoryException;
import com.briup.service.impl.CategoryServiceImpl;

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/categories")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryServiceImpl serviceImpl = new CategoryServiceImpl();
		List<Category> categories = null;
		try {
			categories = serviceImpl.listAll();
			for (Category category : categories) {
				System.out.println(category.toString());
			}
		} catch (CategoryException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
