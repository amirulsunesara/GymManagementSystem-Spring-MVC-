package com.szabist.service;

import java.util.List;

import com.szabist.model.Student;

public interface StudentService {

	public void add(Student student);
	public List<Student> getStudents();
	public void edit(Student student);
	public void delete(String id);
	
}
