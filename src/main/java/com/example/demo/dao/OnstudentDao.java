package com.example.demo.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface OnstudentDao extends CrudRepository<Student, Long>{

	
	@Modifying
	@Query("delete from Student s where s.stdId=:id")
	void deleteStudent(Integer id);
}
