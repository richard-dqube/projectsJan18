package com.dqube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dqube.entity.PokeTable;
import com.dqube.serviceLayer.UserService;

@Controller
public class ControllerClass {
		
	@Autowired
	private UserService userService;
	
	@RequestMapping(value= {"/{user_id}"} , method=RequestMethod.GET)
	public ModelAndView goHome(@PathVariable("user_id") String user_id){
				
		System.out.println("user_id is = " + user_id);
		
		ModelAndView model = new ModelAndView();
		List<PokeTable> listUser = userService.listTopTen(user_id);
		model.addObject("listUser" , listUser);
		model.setViewName("homePage");
		
		return model;
	}
	
	@RequestMapping(value= {"/newUser"} , method=RequestMethod.GET)
	public ModelAndView newUser(ModelAndView model){
		
		PokeTable user = new PokeTable();
		model.addObject("user" , user);
		model.setViewName("userForm");
		
		return model;
	}
	
	@RequestMapping(value="/saveUser" , method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute PokeTable user){
		
		if(user.getId() == 0){
			userService.adduser(user);
		} else {
			// Updation Part
		}
		
		return new ModelAndView("redirect:/");
	}

}
