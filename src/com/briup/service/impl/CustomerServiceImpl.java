package com.briup.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Customer;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.ICustomerDao;
import com.briup.exception.CustomerException;
import com.briup.service.ICustomerService;

/**
*@Author: xuchunlin
*@CreateDate: 2019年8月13日 下午2:47:40
*@Description: null
*/

public class CustomerServiceImpl implements ICustomerService{
	private SqlSession sqlSession = null;
	private ICustomerDao dao = null;

	@Override
	public void register(Customer customer) throws CustomerException {
		try {
			//获取sqlSession
			if (sqlSession==null) {
				sqlSession = MyBatisSqlSessionFactory.openSession();
			}
			dao = sqlSession.getMapper(ICustomerDao.class);
			//判断用户名是否存在
			Customer c = null;
			if ("".equals(customer.getPasswd())
					||"".equals(customer.getName())) {
				throw new CustomerException("用户名或密码为空");
			}
			c = dao.findCustomerByName(customer.getName());
			if (c!=null) {
				throw new CustomerException("该用户名已存在");
			}
			dao.addCustomer(customer);
			sqlSession.commit();
		} catch (Exception e) {
			//事务控制，同时成功同时失败
			sqlSession.rollback();
			if (e instanceof CustomerException) {
				throw new CustomerException(e.getMessage());
			}else {
				e.printStackTrace();
			}
		}finally {
			if (sqlSession!=null) {
				sqlSession.close();
			}
		}
		
	}

	@Override
	public Customer login(String name,String passwd) throws CustomerException {
		Customer customer = null;
		try {
			if (sqlSession==null) {
				sqlSession = MyBatisSqlSessionFactory.openSession();
			}
			if ("".equals(name)) {
				throw new CustomerException("用户名不能为空");
			}
			if ("".equals(passwd)) {
				throw new CustomerException("密码不能为空");
			}
			dao = sqlSession.getMapper(ICustomerDao.class);
			customer = dao.findCustomerByName(name);
			if (customer==null) {
				throw new CustomerException("用户名不存在");
			}
			if (!customer.getPasswd().equals(passwd)) {
				throw new CustomerException("密码错误");
			}
		} catch (Exception e) {
			if (e instanceof CustomerException) {
				throw (CustomerException)e;
			}else {
				e.printStackTrace();
			}
		}		
		return customer;
	}

}

