package com.movie.springcloud.order.remote;


import com.movie.springcloud.common.entity.Movie;
import com.movie.springcloud.order.fallback.MovieRemoteFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider-movie", fallback = MovieRemoteFallBack.class)
public interface MovieRemote {

	@RequestMapping("/movie/getMovie")
	public Movie getMovie();
	
}
