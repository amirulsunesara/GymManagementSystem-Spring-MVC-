package com.szabist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.szabist.dao.TeacherDao;
import com.szabist.model.Teacher;

@Repository
public class TeacherDaoImpl implements TeacherDao {

	
	@PersistenceContext
	 private EntityManager entityManager;
	
	@Override
	public void add(Teacher teacher) {
		entityManager.persist(teacher);
		
	}

	@Override
	public List<Teacher> getTeachers() {
		return entityManager.createNamedQuery("Teacher.getTeachers", Teacher.class).getResultList();
	}

	@Override
	public void edit(Teacher teacher) {
		String teacherId = teacher.getTeacherId();
		String firstName = teacher.getFirstName();
		String subject = teacher.getSubject();
		Query query = (Query) entityManager.createQuery("UPDATE Teacher set firstName = :firstName, subject=:subject WHERE teacherId = :teacherId");
		query.setParameter("firstName", firstName);
		query.setParameter("subject", subject);
		query.setParameter("teacherId", teacherId);
		query.executeUpdate();
		
	}

	@Override
	public void delete(String id) {
		Teacher t = entityManager.find(Teacher.class, id);
		entityManager.remove(entityManager.merge(t));
		
	}

}
