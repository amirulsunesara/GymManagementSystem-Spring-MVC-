package com.szabist.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.szabist.model.Customer;
import com.szabist.model.Employee;
import com.szabist.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping("employee")
	public ModelAndView showEmployees(Map<String,Object> map)
	{
		List<Employee> employeelist = employeeservice.getemployee();
		System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("employee");
		mav.addObject("employees",employeelist);
		
		return mav;
	}
	
	@RequestMapping(value="/employee.del/{id}", method = RequestMethod.GET)
	public String employeedelete(@PathVariable("id") String id)
	{
		System.out.println(id);
		employeeservice.delete(id);
		
		return "redirect:/employee";
	}
	
	@RequestMapping(value="/employee.add",method = RequestMethod.POST)
	public String add(@ModelAttribute Employee employee)
	{
	//	System.out.println("Check 1 "+ trainer.getTrainer_style());
		employeeservice.add(employee);
		System.out.println("Check 2");
		return "redirect:/employee";
	}
	
	
	@ModelAttribute("Employee")
	 public Employee getEmployeeObject() {
	  return new Employee();
	 }

	@RequestMapping(value = "/employee.search", method = RequestMethod.POST)
	public ModelAndView showoneEmployee(@ModelAttribute("Employee") Employee employee)
	{
		

		Employee cr1 = employeeservice.getoneEmployee(employee.getId());
		//System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("employee");
		mav.addObject("oneemployee",cr1);
		
		return mav;
	}
	
	@RequestMapping(value = "/employee.edit", method = RequestMethod.POST)
	public String editEmployee(@ModelAttribute("Employee") Employee employee)
	{
		
//		System.out.println(customer.getId());
		System.out.println(employee.getFirstname());
		employeeservice.edit(employee);
		
		return "redirect:/employee";
	}
}
