package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.OnstudentDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentDao studentdao;
	
	
	@Autowired
	private OnstudentDao stddao;

	@GetMapping("/testok")
	public String getString() {
		return "Test OK";
	}

	@PostMapping(value = "/saveStudent", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public void saveStudent(@RequestBody Student student) {
		studentdao.saveStudent(student);
	}
	
	@PostMapping(value = "/deleteStd/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public void deleteStudent(@PathVariable Integer id) {
		stddao.deleteStudent(id);
	}

}
