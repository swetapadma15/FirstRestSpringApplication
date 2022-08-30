package org.com.firstSpringReactApplication.controller;

import java.util.List;

import org.com.firstSpringReactApplication.model.Student;
import org.com.firstSpringReactApplication.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentServiceImpl studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam int roll) {
		return studentService.getStudent(roll);
	}
	
	@PostMapping(value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping(value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/student")
	public int deleteStudent(@RequestParam int roll) {
		return studentService.deleteStudent(roll);
	}
}
