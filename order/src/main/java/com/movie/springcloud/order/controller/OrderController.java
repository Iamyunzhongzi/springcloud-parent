package com.movie.springcloud.order.controller;


import com.movie.springcloud.common.entity.Movie;
import com.movie.springcloud.common.entity.Order;
import com.movie.springcloud.order.remote.MovieRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Priority;
import javax.annotation.Resource;
import java.lang.reflect.ReflectPermission;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private MovieRemote movieRemote;

	@RequestMapping("/add")
	@Async
	public Order add() {

//		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
//		threadPoolExecutor.execute(new Runnable() {
//			public void run() {
//				System.out.println("123456");
//			}
//		});


		Movie movie = movieRemote.getMovie();
		System.out.println("movie id="+movie.getId());
		System.out.println("movie price="+movie.getPrice());
		Order order = new Order(1, 1, movie.getPrice(), 2);
		return order;
	}
}
