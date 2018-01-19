package com.dqube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	
	@RequestMapping(value={"/"} , method=RequestMethod.GET)
	public ModelAndView goHome(ModelAndView model){
		
		
		model.setViewName("homePage");
		
		return model;
	}

}
