package com.briup.bean;
/**
*@Author: xuchunlin
*@CreateDate: 2019年8月14日 上午11:18:59
*@Description: null
*/

import java.util.Date;

public class Book {
	private Integer id;
	private String name;
	private Double price;
	private String author;
	private String publisher;
	private Date pubDate;
	private String description;
	private String img;
	private Integer categoryId;
	
	
	public Book() {
		super();
	}
	public Book(Integer id, String name, Double price, String author, String publisher, Date pubDate,
			String description, String img, Integer categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.pubDate = pubDate;
		this.description = description;
		this.img = img;
		this.categoryId = categoryId;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", publisher="
				+ publisher + ", pubDate=" + pubDate + ", description=" + description + ", img=" + img + ", categoryId="
				+ categoryId + "]";
	} 
	
	
}

