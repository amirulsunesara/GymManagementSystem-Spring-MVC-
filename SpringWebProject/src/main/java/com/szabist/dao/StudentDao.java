package com.szabist.dao;

import java.util.List;

import com.szabist.model.Student;

public interface StudentDao {
	public void add(Student student);
	public List<Student> getStudents();
	public void edit(Student student);
	public void delete(String id);
	
}
