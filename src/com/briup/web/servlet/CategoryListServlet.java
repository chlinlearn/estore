package com.briup.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Book;
import com.briup.bean.Category;
import com.briup.exception.BookException;
import com.briup.service.impl.BookServiceImpl;

import oracle.net.aso.b;

/**
 * Servlet implementation class CategoryListServlet
 */
@WebServlet("/categoryList")
public class CategoryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer categoryId = Integer.valueOf(request.getParameter("categoryId"));
		Integer parentId = Integer.valueOf(request.getParameter("parentId"));
		//获取应用上下文
		ServletContext application = request.getServletContext();
		
		//从应用上下文的属性中获取集合对象
		List<Category> categories = (List<Category>)application.getAttribute("categories");
		List<Book> books = (List<Book>)application.getAttribute("books");
		//存放符合该子标签的书 
		List<Book> bookList = new ArrayList<Book>();
		for (Book book : books) {
			if(book!=null&&book.getCategoryId()==categoryId) {
				bookList.add(book);
			}
		}
		System.out.println("书集合:"+bookList.toString());
		request.setAttribute("bookList", bookList);
		for (Category category : categories) {
			//判断是否与父标签的id相等
			if (category!=null&&category.getId()==parentId) {
				request.setAttribute("supCategoryName", category.getName());
				for (Category subCategory : category.getSubCategories()) {
					//判断是否与子标签的id相等
					if (subCategory!=null&&subCategory.getId()==categoryId) {
						request.setAttribute("subCategoryName", subCategory.getName());
					}
				}
			}
		}
		request.getRequestDispatcher("/list.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
