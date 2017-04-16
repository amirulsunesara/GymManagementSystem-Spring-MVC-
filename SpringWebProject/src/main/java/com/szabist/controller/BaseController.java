package com.szabist.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.szabist.model.Trainer;

@Controller
public class BaseController {
	@RequestMapping("index")
	public ModelAndView showpages(Map<String,Object> map)
	{
		ModelAndView mav= new ModelAndView(); 
		mav.setViewName("pages");
		
		
		return mav;
	}
	

	 @RequestMapping(value="/404")
	 public ModelAndView error404(){
	  System.out.println("custom error handler");
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("error");
	  
	  return mav;
	 }
	 @RequestMapping(value="/pages.customer",method = RequestMethod.GET)
		public ModelAndView customer(Map<String,Object> map)
		{
			ModelAndView mav= new ModelAndView(); 
			mav.setViewName("customer");
			
			
			return mav;
		}
	 @RequestMapping("pages.equipment")
		public ModelAndView equipment(Map<String,Object> map)
		{
			ModelAndView mav= new ModelAndView(); 
			mav.setViewName("equipment");
			
			
			return mav;
		}
	 @RequestMapping("pages.employee")
		public ModelAndView employee(Map<String,Object> map)
		{
			ModelAndView mav= new ModelAndView(); 
			mav.setViewName("employee");
			
			
			return mav;
		}
	 @RequestMapping("pages.supplements")
		public ModelAndView supplements(Map<String,Object> map)
		{
			ModelAndView mav= new ModelAndView(); 
			mav.setViewName("supplements");
			
			
			return mav;
		}
	 @RequestMapping("pages.trainer")
		public ModelAndView trainer(Map<String,Object> map)
		{
			ModelAndView mav= new ModelAndView(); 
			mav.setViewName("trainer");
			
			
			return mav;
		}
	 
	 
}
