package com.szabist.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.szabist.model.Student;
import com.szabist.model.Teacher;
import com.szabist.service.TeacherService;

@Controller

public class TeacherController {

	@Autowired 
	private TeacherService teacherService;
	
	@RequestMapping("teacher")
	public ModelAndView showTeachers(Map<String,Object> map){
		List<Teacher> teacherList = teacherService.getTeachers();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("teacher");
		mav.addObject("teachers", teacherList);
		
		return mav;
	}
	
	@RequestMapping(value="/teacher.del/{id}", method= RequestMethod.GET)
	public String teacherDelete(@PathVariable("id") String id)
	{
		System.out.println(id);
		teacherService.delete(id);
		return "redirect:/teacher";
	}
	
	@RequestMapping(value="/teacher.edit/{id}/{firstName}/{subject}", method= RequestMethod.GET)
	public String teacherUpdate(@PathVariable("id") String id,@PathVariable("firstName") String firstName,@PathVariable("subject") String subject )
	{
//		Teacher teacher = new Teacher();
//		teacher.setTeacherId(id);
//		teacher.setFirstName(firstName);
//		teacher.setSubject(subject);
		return "redirect:/teacher.update";
		
	}
	
	@RequestMapping(value="/teacher.add", method= RequestMethod.POST)
	public String add(@ModelAttribute Teacher teacher){
	//	Teacher teacherResult = new Teacher();
				teacherService.add(teacher);
//				teacherResult = teacher;
//		
//		map.put("teacher", teacherResult);
//		return "test";
				return "redirect:/teacher";
	}

	
}
