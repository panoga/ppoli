package com.ppoli.abas.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(HttpServletRequest req) {

//		session
//		req.getSession().setattr
	}
}
