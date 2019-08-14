package com.briup.dao;

import com.briup.bean.Customer;

/**
*@Author: xuchunlin
*@CreateDate: 2019年8月13日 下午2:38:17
*@Description: 映射接口
*/

public interface ICustomerDao {
	//用户注册
	void addCustomer(Customer customer) throws Exception;
	
	//根据用户名查找
	Customer findCustomerByName(String name) throws Exception;

}

