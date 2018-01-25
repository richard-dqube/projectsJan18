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

import com.dqube.entity.MyPointsEntity;
import com.dqube.serviceLayer.UserService;


@Controller
public class ControllerClass {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value= {"/"} , method=RequestMethod.GET)
	public List<MyPointsEntity> goHome(){
		
		List<MyPointsEntity> listUser = new ArrayList<MyPointsEntity>();
		listUser.addAll(userService.cumulativePointsPerUser());
		
		return listUser;
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
