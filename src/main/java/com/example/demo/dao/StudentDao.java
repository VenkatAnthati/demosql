package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;

@Component
@Transactional
public class StudentDao implements IstudentDao {

	
	@PersistenceContext	
	private EntityManager entityManager;
	
	
	@Override
	public void saveStudent(Student student) {
		entityManager.merge(student);
		entityManager.flush();

	}

	/*
	 * @Modifying
	 * 
	 * @Query("delete from Student s where s.stdId=:id") public void
	 * deleteStudent(Integer id) {
	 * 
	 * }
	 */

}
