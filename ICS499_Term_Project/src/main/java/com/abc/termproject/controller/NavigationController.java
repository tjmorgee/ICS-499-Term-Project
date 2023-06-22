package com.abc.termproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class NavigationController {

	// This may not be necessary until if/when we want a custom login page (this includes the login.jsp)
//	@GetMapping("/login")
//	public String login() {
//		return "login";
//	}
	
	// Used to redirect user based on login credentials
	@GetMapping("/")
	public String redirect(HttpServletRequest request) {
		if (request.isUserInRole("ADMIN"))
			return "admin";
		return "customer";
	}
	
	// Used to access the admin page manually
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	// Used to access the customer page manually
	@GetMapping("/customer")
	public String customer() {
		return "customer";
	}
}
