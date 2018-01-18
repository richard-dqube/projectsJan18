package com.dqube.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dqube.entity.EmployeeEntity;
import com.dqube.ServiceLayer.EmployeeService;

@Controller
@Component
public class ControllerClass {
	
	@Autowired
	private	EmployeeService employeeService;
	
	//Home Page and for listing all Employees from the DB
	
	@RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
	public ModelAndView getHomePageAndListEmployees(ModelAndView model){
		
		List<EmployeeEntity> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("homePage");
		
		return model;
	}
	
	// Redirects to Employee Registration form
	
	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        EmployeeEntity employee = new EmployeeEntity();
        model.addObject("employee", employee);
        model.setViewName("employeeForm");
        return model;
    }
 
	
	// Add or Update Controller
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute EmployeeEntity employee) {
		
		if(employee.getId() == null){
			employeeService.addEmployee(employee);
		} else {
			//For Employee Updation 
		}
		
		return new ModelAndView("redirect:/");	
	}

	
	
}
