package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcomeMsg")
    public ModelAndView welcomeMsg() {
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("msg","Welcome to Spring Boot App!!!!!");
    	mav.setViewName("welcome");
    	return mav;
    }
}
