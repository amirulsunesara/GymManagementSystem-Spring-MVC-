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

import com.szabist.model.Trainer;
import com.szabist.service.TrainerService;

import javassist.bytecode.SignatureAttribute.ObjectType;

@Controller
public class TrainerController {

	@Autowired
	private TrainerService trainerservice;
	
	@RequestMapping("trainer")
	public ModelAndView showTrainers(Map<String,Object> map)
	{
		List<Trainer> trainerlist = trainerservice.getTrainer();
		//System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("trainer");
		mav.addObject("trainers",trainerlist);
		
		return mav;
	}
	
	@RequestMapping(value="/trainer.del/{id}", method = RequestMethod.GET)
	public String trainerdelete(@PathVariable("id") String id)
	{
		System.out.println(id);
		trainerservice.delete(id);
		
		return "redirect:/trainer";
	}
	
	@RequestMapping(value="/trainer.add",method = RequestMethod.POST)
	public String add(@ModelAttribute Trainer trainer)
	{
		System.out.println("Check 1 "+ trainer.getTrainer_style());
		trainerservice.add(trainer);
		System.out.println("Check 2");
		return "redirect:/trainer";
	}
	
	
	@ModelAttribute("Trainer")
	 public Trainer getTrainerObject() {
	  return new Trainer();
	 }

	@RequestMapping(value = "/trainer.search", method = RequestMethod.POST)
	public ModelAndView showoneTrainer(@ModelAttribute("Trainer") Trainer train)
	{
		

		Trainer tr1 = trainerservice.getoneTrainer(train.getId());
		//System.out.println("");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("trainer");
		mav.addObject("onetrainer",tr1);
		
		return mav;
	}
	
	@RequestMapping(value = "/trainer.edit", method = RequestMethod.POST)
	public String editTrainer(@ModelAttribute("Trainer") Trainer train)
	{
		
		System.out.println(train.getId());
		System.out.println(train.getTrainer_style());
		trainerservice.edit(train);
		
		return "redirect:/trainer";
	}
}
