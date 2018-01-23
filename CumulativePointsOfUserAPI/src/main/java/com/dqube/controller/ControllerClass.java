package com.dqube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dqube.entity.MyPointsEntity;
import com.dqube.serviceLayer.UserService;


@Controller
public class ControllerClass {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value= {"/"} , method=RequestMethod.GET)
	public ModelAndView goHome(ModelAndView model){
		
		List<MyPointsEntity> listUser = userService.cumulativePointsPerUser();
		model.addObject("listUser" , listUser);
		model.setViewName("homePage");
		
		return model;
	}
	
	@RequestMapping(value= {"/newUser"} , method=RequestMethod.GET)
	public ModelAndView newUser(ModelAndView model){
		
		MyPointsEntity user = new MyPointsEntity();
		model.addObject("user" , user);
		model.setViewName("dummyForm");
		
		return model;
	}
	
	@RequestMapping(value="/saveUser" , method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute MyPointsEntity user){
		
		if(user.getId() == 0){
			userService.adduser(user);
		} else {
			// Updation Part
		}
		
		return new ModelAndView("redirect:/");
	}

}
