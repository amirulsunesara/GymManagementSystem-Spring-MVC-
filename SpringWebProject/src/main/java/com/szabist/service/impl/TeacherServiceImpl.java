package com.szabist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szabist.dao.TeacherDao;
import com.szabist.model.Teacher;
import com.szabist.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	
	@Autowired
	private TeacherDao dao;
	@Transactional
	public void add(Teacher teacher) {
		dao.add(teacher);
		
	}

	@Override
	public List<Teacher> getTeachers() {
		return dao.getTeachers();
	}

	@Transactional
	public void edit(Teacher teacher) {
		dao.edit(teacher);
		
	}

	@Transactional
	public void delete(String id) {
		dao.delete(id);
		
	}

}
