package com.ts.aurora.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ts.aurora.model.User;

@Controller
public class RegistrationController {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@RequestMapping(value = "/registration")
	public ModelAndView openRegistration() {
		return new ModelAndView("registration", "newUser", new User());
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerAccount(@ModelAttribute("newAccount") User newUser) {
		logger.info("Account has been registred: " + newUser);
		return "successRegistration";
	}
}
