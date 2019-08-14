package com.briup.bean;

import java.util.List;

/**
*@Author: xuchunlin
*@CreateDate: 2019年8月14日 上午9:32:39
*@Description: 分类标签
*/

public class Category {
	private Integer id;
	private String name;
	private String description;
	private Integer parentId;
	private List<Category> subCategories;//子标签
	
	
	public Category() {
		super();
	}


	public Category(Integer id, String name, String description, Integer parentId, List<Category> subCategories) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.parentId = parentId;
		this.subCategories = subCategories;
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Category> getSubCategories() {
		return subCategories;
	}


	public void setSubCategories(List<Category> subCategory) {
		this.subCategories = subCategory;
	}


	public Integer getParentId() {
		return parentId;
	}


	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", parentId=" + parentId
				+ ", subCategories=" + subCategories + "]";
	}

}

