package com.ts.aurora.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ts.aurora.model.User;

/**
 * Handles requests for the application page.
 */
@Controller
public class MainPagesController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainPagesController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView main() {
		logger.info("User model has been created");
		return new ModelAndView("login", "user", new User());
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}

	@RequestMapping(value = "/hello")
	public String helloPage() {
		return "hello";
	}

	@RequestMapping(value = "/successRegistration")
	public String successRegistration() {
		return "successRegistration";
	}

}