package com.briup.service;
/**
*@Author: xuchunlin
*@CreateDate: 2019年8月14日 下午2:12:54
*@Description: null
*/

import java.util.List;

import com.briup.bean.Book;
import com.briup.exception.BookException;

public interface IBookService {
	Book listBooksById(Integer id) throws BookException;
	
	List<Book> listBooks() throws BookException;
}

