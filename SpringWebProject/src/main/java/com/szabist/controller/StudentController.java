package com.szabist.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.szabist.model.Student;
import com.szabist.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("student")
	public String setupForm(Map<String,Object> map){
		Student student = new Student();
		map.put("student", student);
		return "student";
	}
	
	@RequestMapping(value="/student.do", method= RequestMethod.POST)
	public String doAction(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String,Object> map ){
		Student studentResult = new Student();
		switch(action.toLowerCase()){
		
		case "add":
				studentService.add(student);
				studentResult = student;
				break;
		
		}
		map.put("student", studentResult);
		return "test";
	}
	
	@RequestMapping(value="/test", method= RequestMethod.GET)
	public String getStudents(){
		List<Student> studentList = studentService.getStudents();
		
		
		System.out.println("helloaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ studentList.get(0));
		
		return "test";
	}

//	@RequestMapping(value="/student.list", method= RequestMethod.GET)
	@RequestMapping("list")
	public ModelAndView showStudents(Map<String,Object> map){
		List<Student> studentList = studentService.getStudents();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		mav.addObject("students", studentList);
		
		return mav;
	}
	@RequestMapping(value="/student.del", method= RequestMethod.POST)
	public void studentDelete(@RequestParam Map<String,String> requestParameters)
	{
		String id = requestParameters.get("id");
		studentService.delete(id);
	}
	
	@RequestMapping(value="/student.edit", method= RequestMethod.POST)
	public void studentUpdate(@ModelAttribute Student student,@RequestParam Map<String,Object> map )
	{
		System.out.println("Controller");
		Student s = new Student();
		s.setStudentId((String) map.get("id"));
		s.setFirstName((String) map.get("firstName"));
		studentService.edit(s);
	}
	
}
