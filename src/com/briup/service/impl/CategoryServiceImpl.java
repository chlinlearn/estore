package com.briup.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Category;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.ICategoryDao;
import com.briup.exception.CategoryException;
import com.briup.service.ICategoryService;

/**
*@Author: xuchunlin
*@CreateDate: 2019年8月14日 上午9:59:41
*@Description: null
*/

public class CategoryServiceImpl implements ICategoryService{

	@Override
	public List<Category> listAll() throws CategoryException{
		SqlSession sqlSession = null;
		List<Category> categories = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			ICategoryDao dao = sqlSession.getMapper(ICategoryDao.class);
			categories = dao.findSupCategories();
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		}
		return categories;
	}

}

