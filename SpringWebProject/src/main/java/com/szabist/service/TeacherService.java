package com.szabist.service;

import java.util.List;

import com.szabist.model.Teacher;

public interface TeacherService {

	public void add(Teacher teacher);
	public List<Teacher> getTeachers();
	public void edit(Teacher teacher);
	public void delete(String id);
}
