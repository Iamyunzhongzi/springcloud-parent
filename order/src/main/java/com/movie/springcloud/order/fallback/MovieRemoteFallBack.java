package com.movie.springcloud.order.fallback;


import com.movie.springcloud.common.entity.Movie;
import com.movie.springcloud.order.remote.MovieRemote;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class MovieRemoteFallBack implements MovieRemote,FallbackFactory<MovieRemote> {

	public Movie getMovie() {
		System.out.println("服务器繁忙,请稍后再试");
		return new Movie();
	}

	public MovieRemote create(Throwable cause) {
		return new MovieRemoteFallBack();
	}
}
