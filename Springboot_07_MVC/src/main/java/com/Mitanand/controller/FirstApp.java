package com.Mitanand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstApp {
	
	
	@GetMapping("/welcome")
	public ModelAndView displayMsg() {
		
//	We have a ModelAndView Named class, so we'll gonna use this one here
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("message", "Welcome to the World on Spring....");
		mv.setViewName("index");
		
		return mv;
//		To bind the URL use @RequestMapping or @GetMapping 
	}
	
	@RequestMapping("/shiv")
	public String Shiv(Model model) {
		model.addAttribute("message", "OM SHREE SHAMBH-SADASHIV");
		return "index";
	}
	
//	@GetMapping is Great than the @RequestMapping annotation

}
