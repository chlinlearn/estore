package com.briup.bean;
/**
*@Author: xuchunlin
*@CreateDate: 2019年8月13日 下午2:34:33
*@Description: 客户类--->注册、登录
*/

public class Customer {
	private Integer id;
	private String name;
	private String passwd;
	private String zip;//邮编
	private String telephone;
	private String email;
	
	public Customer() {
		
	}
	
	public Customer(String name, String passwd, String zip, String telephone, String email) {
		super();
		this.name = name;
		this.passwd = passwd;
		this.zip = zip;
		this.telephone = telephone;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", passwd=" + passwd + ", zip=" + zip + ", telephone="
				+ telephone + ", email=" + email + "]";
	}
	
	

}

