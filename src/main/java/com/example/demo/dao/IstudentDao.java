package com.example.demo.dao;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public interface IstudentDao {

	void saveStudent(Student student);
}
