package com.movie.springcloud.movie.controller;


import com.movie.springcloud.common.entity.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping("/getMovie")
	public Movie getMovie() {
		Movie m = new Movie(1, "哪吒", 39D, "好看");
		return m;
	}
}
