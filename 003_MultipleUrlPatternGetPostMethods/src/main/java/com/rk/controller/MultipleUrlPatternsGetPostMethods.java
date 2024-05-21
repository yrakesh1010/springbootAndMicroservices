package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rk")
public class MultipleUrlPatternsGetPostMethods {
   
	@GetMapping(value = {"/","/index","/home"})
	public ModelAndView welcomeMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Welcome to Boot Applicaion!!");
		mav.setViewName("index");
	    return mav;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public ModelAndView Msg(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Welcome again Boot Application!!!!");
		mav.setViewName("index");
		return mav;
	}
}
