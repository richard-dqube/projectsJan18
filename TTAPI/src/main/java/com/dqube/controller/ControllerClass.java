package com.dqube.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dqube.ServiceLayer.ThamizhThonduService;
import com.dqube.entity.Current_Points;
import com.dqube.entity.MyPointsEntity;
import com.dqube.entity.RedeemEntity;

@Controller
public class ControllerClass {
	
	@Autowired
	ThamizhThonduService thamizhThonduService;
	
	@RequestMapping(value= {"/"}, method=RequestMethod.GET)
	public ModelAndView getHome() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("homePage");
		
		return model;
	}
	
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value="/check" , method=RequestMethod.GET)
	public <E> List<E> listOfList(){
		
		List<E> listFinal = new ArrayList<E>();

		List<RedeemEntity> listUser = new ArrayList<RedeemEntity>();
		listUser.addAll(thamizhThonduService.displayDescendingByPoints());
		
		
		List<Current_Points> listPoints = new ArrayList<Current_Points>();
		listPoints.addAll(thamizhThonduService.listTopTen());
		
		List<MyPointsEntity> listMyPoints = new ArrayList<MyPointsEntity>();
		listMyPoints.addAll(thamizhThonduService.cumulativePointsPerUser());
		
		
		listFinal.add((E) listUser);
		listFinal.add((E) listPoints);
		listFinal.add((E) listMyPoints);

		return listFinal;
	}
	
}
