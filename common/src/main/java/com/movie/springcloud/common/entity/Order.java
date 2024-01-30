package com.movie.springcloud.common.entity;

import java.io.Serializable;

public class Order implements Serializable{

	private Integer id;
	private Integer movieId;
	private Double totalPrice;
	private Integer count;
	
	
	public Order() {
		super();
	}
	public Order(Integer id, Integer movieId, Double totalPrice, Integer count) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.totalPrice = totalPrice;
		this.count = count;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
}
