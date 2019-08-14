package com.briup.service;
/**
*@Author: xuchunlin
*@CreateDate: 2019年8月14日 上午9:59:29
*@Description: null
*/

import java.util.List;

import com.briup.bean.Category;
import com.briup.exception.CategoryException;

public interface ICategoryService {
	List<Category> listAll() throws CategoryException;
}

