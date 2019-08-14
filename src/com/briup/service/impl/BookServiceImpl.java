package com.briup.service.impl;

import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Book;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.IBookDao;
import com.briup.exception.BookException;
import com.briup.service.IBookService;

/**
*@Author: xuchunlin
*@CreateDate: 2019年8月14日 下午2:14:17
*@Description: null
*/

public class BookServiceImpl implements IBookService{

	@Override
	public Book listBooksById(Integer id) throws BookException {
		SqlSession sqlSession = null;
		Book book = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			IBookDao dao = sqlSession.getMapper(IBookDao.class);
			book = dao.getBooksById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public List<Book> listBooks() throws BookException {
		SqlSession sqlSession = null;
		List<Book> books = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			IBookDao dao = sqlSession.getMapper(IBookDao.class);
			books = dao.getAllBooks();	
			for (Book book : books) {
				System.out.println(book.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

}

