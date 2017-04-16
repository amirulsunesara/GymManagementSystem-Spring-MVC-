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

import com.szabist.model.Equipment;
import com.szabist.model.Supplements;
import com.szabist.service.EquipmentService;
import com.szabist.service.SupplementsService;

@Controller
public class SupplementsController {
	@Autowired
	private SupplementsService supplementsservice;
	
	@RequestMapping("supplements")
	public ModelAndView showSupplements(Map<String,Object> map)
	{
		List<Supplements> supplementslist = supplementsservice.getSupplements();
		System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("supplements");
		mav.addObject("supplements",supplementslist);
		
		return mav;
	}
	
	@RequestMapping(value="/supplements.del/{id}", method = RequestMethod.GET)
	public String supplementsdelete(@PathVariable("id") String id)
	{
	
		supplementsservice.delete(id);
		
		return "redirect:/supplements";
	}
	
	@RequestMapping(value="/supplements.add",method = RequestMethod.POST)
	public String add(@ModelAttribute Supplements supplements)
	{
	//	System.out.println("Check 1 "+ trainer.getTrainer_style());
		supplementsservice.add(supplements);
		System.out.println("Check 2");
		return "redirect:/supplements";
	}
	
	
	@ModelAttribute("Supplements")
	 public Supplements getSupplementsObject() {
	  return new Supplements();
	 }

	@RequestMapping(value = "/supplements.search", method = RequestMethod.POST)
	public ModelAndView showonesupplements(@ModelAttribute("Supplements") Supplements supplements)
	{
		

		Supplements cr1 = supplementsservice.getoneSupplements(supplements.getId());
		//System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("supplements");
		mav.addObject("onesupplements",cr1);
		
		return mav;
	}
	
	@RequestMapping(value = "/supplements.edit", method = RequestMethod.POST)
	public String editEquipment(@ModelAttribute("Supplements") Supplements supplements)
	{
		
//		System.out.println(customer.getId());
//		System.out.println(customer.getTrainer_style());
		supplementsservice.edit(supplements);
		
		return "redirect:/supplements";
	}
	
	
}
