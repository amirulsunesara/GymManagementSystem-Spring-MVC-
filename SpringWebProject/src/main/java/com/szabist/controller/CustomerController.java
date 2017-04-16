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
import com.szabist.model.Trainer;
import com.szabist.service.CustomerService;
import com.szabist.service.TrainerService;

@Controller
public class CustomerController {
	
//	 @RequestMapping(value="/404")
//	 public ModelAndView error404(){
//	  System.out.println("custom error handler");
//	  ModelAndView mav = new ModelAndView();
//	  mav.setViewName("error");
//	  
//	  return mav;
//	 }
	
	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("customer")
	public ModelAndView showCustomers(Map<String,Object> map)
	{
		List<Customer> customerlist = customerservice.getcustomer();
		System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("customer");
		mav.addObject("customers",customerlist);
		
		return mav;
	}
	
	@RequestMapping(value="/customer.del/{id}", method = RequestMethod.GET)
	public String customerdelete(@PathVariable("id") String id)
	{
		System.out.println(id);
		customerservice.delete(id);
		
		return "redirect:/customer";
	}
	
	@RequestMapping(value="/customer.add",method = RequestMethod.POST)
	public String add(@ModelAttribute Customer customer)
	{
	//	System.out.println("Check 1 "+ trainer.getTrainer_style());
		customerservice.add(customer);
		System.out.println("Check 2");
		return "redirect:/customer";
	}
	
	
	@ModelAttribute("Customer")
	 public Customer getCustomerObject() {
	  return new Customer();
	 }

	@RequestMapping(value = "/customer.search", method = RequestMethod.POST)
	public ModelAndView showoneCustomer(@ModelAttribute("Customer") Customer customer)
	{
		

		Customer cr1 = customerservice.getonecustomer(customer.getId());
		//System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("customer");
		mav.addObject("onecustomer",cr1);
		
		return mav;
	}
	
	@RequestMapping(value = "/customer.edit", method = RequestMethod.POST)
	public String editCustomer(@ModelAttribute("Customer") Customer customer)
	{
		
//		System.out.println(customer.getId());
//		System.out.println(customer.getTrainer_style());
		customerservice.edit(customer);
		
		return "redirect:/customer";
	}
	
}
