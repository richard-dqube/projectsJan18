package com.dqube.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dqube.ServiceLayer.ThamizhThonduService;
import com.dqube.entity.RedeemEntity;
import com.dqube.entity.Current_Points;
import com.dqube.entity.MyPointsEntity;
import com.dqube.entity.PokeTableEntity;

@Controller
public class ControllerClass {
	
	@Autowired
	ThamizhThonduService thamizhThonduService;
	
	//Fetching List
	
	@ResponseBody
	@RequestMapping(value="/{user_id}" , method=RequestMethod.GET)
	public Object listOfList(@PathVariable("user_id") String user_id){
		
		Map<Object, Object> listFinal = new HashMap<>();

		List<RedeemEntity> listUser = new ArrayList<RedeemEntity>();
		listUser.addAll(thamizhThonduService.displayDescendingByPoints());
		
		List<Current_Points> listPoints = new ArrayList<Current_Points>();
		listPoints.addAll(thamizhThonduService.listTopTen());
		
		List<MyPointsEntity> listMyPoints = new ArrayList<MyPointsEntity>();
		listMyPoints.addAll(thamizhThonduService.cumulativePointsPerUser());
		
		List<PokeTableEntity> poke = new ArrayList<PokeTableEntity>();
		poke.addAll(thamizhThonduService.listPokes(user_id));
		
		listFinal.put("RedeemEntity", listUser);
		listFinal.put("CurrentPointsEntity", listPoints);
		listFinal.put("MyPointsEntity", listMyPoints);
		listFinal.put("PokeTableEntity", poke);

		return listFinal;
	}
	
	//Inserting List
	
	@ResponseBody
	@RequestMapping(value={"/insertList"}, method = RequestMethod.POST)
	public boolean insertList(@RequestBody List<Current_Points> listOfObjects){      /*List<EntityClass> listOfObjects*/
		
		try {
			
     thamizhThonduService.listInsert(listOfObjects);
     return true;
     
		}
		
		catch (Exception e){
			
		e.printStackTrace();
		return false;
		
		}
	}
	
}
