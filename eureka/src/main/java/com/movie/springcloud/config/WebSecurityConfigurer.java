package com.movie.springcloud.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//1: 加载了WebSecurityConfiguration配置类, 配置安全认证策略
//2: 加载了AuthenticationConfiguration配置类, 配置了认证信息
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	//关闭新版security的csrf校验
        http.csrf().disable();
        super.configure(http);
    }
}