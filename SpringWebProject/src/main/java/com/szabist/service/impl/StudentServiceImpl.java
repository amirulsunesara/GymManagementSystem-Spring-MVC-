package com.szabist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szabist.dao.StudentDao;
import com.szabist.model.Student;
import com.szabist.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void add(Student student) {
		studentDao.add(student);
		
	}

	@Override
	public List<Student> getStudents() {
		return studentDao.getStudents();
		
	}

	@Transactional
	public void edit(Student student) {
		studentDao.edit(student);
		
	}

	@Transactional
	public void delete(String id) {
		studentDao.delete(id);
		
	}

}
