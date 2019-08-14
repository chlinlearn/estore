package com.briup.web.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.briup.bean.Book;
import com.briup.bean.Category;
import com.briup.exception.BookException;
import com.briup.exception.CategoryException;
import com.briup.service.impl.BookServiceImpl;
import com.briup.service.impl.CategoryServiceImpl;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
@WebListener
public class ApplicationListener implements ServletContextListener, ServletContextAttributeListener {

    public ApplicationListener() {
    }

    public void attributeAdded(ServletContextAttributeEvent scab)  { 
    }

    public void attributeRemoved(ServletContextAttributeEvent scab)  { 
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
    }

    public void attributeReplaced(ServletContextAttributeEvent scab)  { 
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext application = sce.getServletContext();
    	CategoryServiceImpl categoryService = new CategoryServiceImpl();
    	BookServiceImpl bookService = new BookServiceImpl();
    	List<Category> categories = null;
    	List<Book> books = null;
    	try {
    		System.out.println("初始化标签");
			categories = categoryService.listAll();
			books = bookService.listBooks();
			application.setAttribute("categories", categories);
			application.setAttribute("books", books);
		} catch (CategoryException e) {
			e.printStackTrace();
		} catch (BookException e) {
			e.printStackTrace();
		}
    }
	
}
