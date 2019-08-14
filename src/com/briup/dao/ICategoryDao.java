package com.briup.dao;
/**
*@Author: xuchunlin
*@CreateDate: 2019年8月14日 上午9:38:21
*@Description: null
*/

import java.util.List;

import com.briup.bean.Category;

public interface ICategoryDao {
	//查找所有标签
	List<Category> findSubCategoriesById() throws Exception;
	
	List<Category> findSupCategories() throws Exception;

}

