package com.briup.exception;
/**
*@Author: xuchunlin
*@CreateDate: 2019年8月13日 下午2:45:36
*@Description: null
*/

public class CustomerException extends Exception{
	private static final long serialVersionUID = 1L;

	public CustomerException() {
		super();
	}

	public CustomerException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerException(String message) {
		super(message);
	}

	public CustomerException(Throwable cause) {
		super(cause);
	}
	

}

