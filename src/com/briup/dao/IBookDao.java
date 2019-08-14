package com.briup.dao;
/**
*@Author: xuchunlin
*@CreateDate: 2019年8月14日 下午2:08:04
*@Description: null
*/

import java.util.List;

import com.briup.bean.Book;

public interface IBookDao {
	Book getBooksById(Integer id) throws Exception;
	
	List<Book> getAllBooks() throws Exception;
}

