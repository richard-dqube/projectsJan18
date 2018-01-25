package com.dqube.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

 import com.dqube.entity.Current_Points; 
 import com.dqube.serviceLayer.UserService;

 // Controller class

@Controller
public class ControllerClass {
	
	// Autowired with Service Layer
	
	@Autowired
	private UserService userService;
	
	// JSON Response Controller method
	
	@ResponseBody 
	@RequestMapping(value= {"/"} , method=RequestMethod.GET)
	public List<Current_Points> getJSON(){

		List<Current_Points> listPoints = new ArrayList<Current_Points>();
		listPoints.addAll(userService.listTopTen());
		
		return listPoints;
	}
	
	// New user controller method
	
	@RequestMapping(value= {"/newUser"} , method=RequestMethod.GET)
	public ModelAndView newUser(ModelAndView model){
		
		Current_Points user = new Current_Points();
		model.addObject("user" , user);
		model.setViewName("userForm");
		
		return model;
	}
	
	//save user controller method
	
	@RequestMapping(value="/saveUser" , method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Current_Points user){
		
		if(user.getId() == 0){
			userService.adduser(user);
		} else {
			// Updation Part
		}
		
		return new ModelAndView("redirect:/");
	}

}
