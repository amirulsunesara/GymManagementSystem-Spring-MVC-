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
import com.szabist.model.Equipment;
import com.szabist.model.Trainer;
import com.szabist.service.EquipmentService;
import com.szabist.service.TrainerService;

@Controller
public class EquipmentController {
	
	@Autowired
	private EquipmentService equipmentservice;
	
	@RequestMapping("equipment")
	public ModelAndView showEquipments(Map<String,Object> map)
	{
		List<Equipment> equipmentlist = equipmentservice.getEquipment();
		System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("equipment");
		mav.addObject("equipments",equipmentlist);
		
		return mav;
	}
	
	@RequestMapping(value="/equipment.del/{id}", method = RequestMethod.GET)
	public String equipmentdelete(@PathVariable("id") String id)
	{
	
		equipmentservice.delete(id);
		
		return "redirect:/equipment";
	}
	
	@RequestMapping(value="/equipment.add",method = RequestMethod.POST)
	public String add(@ModelAttribute Equipment equipment)
	{
	//	System.out.println("Check 1 "+ trainer.getTrainer_style());
		equipmentservice.add(equipment);
		System.out.println("Check 2");
		return "redirect:/equipment";
	}
	
	
	@ModelAttribute("Equipment")
	 public Equipment getEquipmentObject() {
	  return new Equipment();
	 }

	@RequestMapping(value = "/equipment.search", method = RequestMethod.POST)
	public ModelAndView showoneequipment(@ModelAttribute("Equipment") Equipment equipment)
	{
		

		Equipment cr1 = equipmentservice.getoneequipment(equipment.getId());
		//System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("equipment");
		mav.addObject("oneequipment",cr1);
		
		return mav;
	}
	
	@RequestMapping(value = "/equipment.edit", method = RequestMethod.POST)
	public String editEquipment(@ModelAttribute("Equipment") Equipment equipment)
	{
		
//		System.out.println(customer.getId());
//		System.out.println(customer.getTrainer_style());
		equipmentservice.edit(equipment);
		
		return "redirect:/equipment";
	}
	
}
