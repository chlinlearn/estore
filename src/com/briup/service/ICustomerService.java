package com.briup.service;

import com.briup.bean.Customer;
import com.briup.exception.CustomerException;

/**
*@Author: xuchunlin
*@CreateDate: 2019年8月13日 下午2:43:51
*@Description: null
*/

public interface ICustomerService {
	//注册
	void register(Customer customer) throws CustomerException;
	
	//登录
	Customer login(String name,String passwd) throws CustomerException;
}

