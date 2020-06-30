package com.ppoli.abas.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SecurityConfig {

	private static final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.formLogin();
//		
//	}
//	 
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		auth.inMemoryAuthentication()
//		.withUser("member")
//		.password("{noop}1234")
//		.roles("MEMBER");
//		
//		auth.inMemoryAuthentication()
//		.withUser("admin")
//		.password("{noop}1234")
//		.roles("ADMIN");
//	}
	
}
