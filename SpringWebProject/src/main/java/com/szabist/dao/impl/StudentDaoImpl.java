package com.szabist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.szabist.dao.StudentDao;
import com.szabist.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	 // An EntityManager will be automatically injected from EntityManagerFactory setup on spring-dao.xml
	 @PersistenceContext
	 private EntityManager entityManager;
	  
	@Override
	public void add(Student student) {
		entityManager.persist(student);
	}

	@Override
	public List<Student> getStudents() {
		return entityManager.createNamedQuery("Student.getStudents", Student.class).getResultList();
		
	}

	@Override
	public void edit(Student student) {
		System.out.println("DAO");
		String studentId=student.getStudentId();
		String firstName = student.getFirstName();
		System.out.println(studentId);
		Student s = entityManager.find(Student.class, studentId);
		//Student s =entityManager.find(Student.class, studentId);
		//entityManager.merge(s);
		Query query = (Query) entityManager.createQuery("UPDATE Student set firstName = :firstName WHERE studentId = :studentId");
		query.setParameter("firstName", firstName);
		query.setParameter("studentId", studentId);
		query.executeUpdate();
		//entityManager.getTransaction().begin();
		//s.setFirstName(firstName);
		//entityManager.getTransaction().commit();
		
	}

	@Override
	public void delete(String id) {
		Student s = entityManager.find(Student.class, id);
		entityManager.remove(entityManager.merge(s));
		
	}
	
}
