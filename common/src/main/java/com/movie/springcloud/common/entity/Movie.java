package com.movie.springcloud.common.entity;

import java.io.Serializable;

public class Movie implements Serializable{
	
	private Integer id;
	private String title;
	private Double price;
	private String content;
	
	
	public Movie() {
		super();
	}
	public Movie(Integer id, String title, Double price, String content) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.content = content;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
