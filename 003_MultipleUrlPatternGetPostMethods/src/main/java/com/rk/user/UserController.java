package com.rk.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/index")	
	public String userMsg(Model mod) {
		mod.addAttribute("msg", "Hi All");
		return "index";
	}
}
