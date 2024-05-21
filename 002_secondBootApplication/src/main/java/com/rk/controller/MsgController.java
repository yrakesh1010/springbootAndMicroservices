package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@RequestMapping("/welcomeMsg")
	public ModelAndView welcomeMsg(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Welcome to Boot Application!!!!");
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/wishMsg")
	public ModelAndView wishMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Good Morning!!!!!");
		mav.setViewName("index");
		return mav;
	}
}
