package com.nagarro.RestTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.RestTemplate.model.LoginForm;
import com.nagarro.RestTemplate.service.LoginService;

/**
 * Login Controller Class to implement Login
 * @author maibu
 *
 */
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	//Login Form
	@RequestMapping("/")
	public String showForm(Model model) {
		return "login";
	}
	
	//valid login credentials and redirect 
	@RequestMapping(path = "/processLogin", method = RequestMethod.POST)
	public String validate(@ModelAttribute("loginForm") LoginForm loginForm, Model model){
		 
		if(this.loginService.validateUser(loginForm)) {
			
			return "booklist";
		}
		else {
			return "login";
		}
	}
	
	//On logout redirect to login form
	@RequestMapping(path = "/logout", method = RequestMethod.POST)
	public String logout(Model model) {
		return "login";
	}
	
	
	
}
