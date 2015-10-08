package com.ts.aurora.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ts.aurora.model.Account;

@Controller
public class RegistrationController {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@RequestMapping(value = "/registration")
	public ModelAndView openRegistration() {
		return new ModelAndView("registration", "newAccount", new Account());
	}

	@RequestMapping(value = "/registerAccount", method = RequestMethod.POST)
	public String registerAccount(@ModelAttribute("newAccount") Account newAccount) {
		logger.info("Account has been registred: " + newAccount);
		return "successRegistration";
	}
}
