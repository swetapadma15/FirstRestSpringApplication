package org.com.firstSpringReactApplication.service;

import java.util.List;

import org.com.firstSpringReactApplication.model.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student getStudent(int roll);
	String addStudent(Student student);
	Student updateStudent(Student student);
	int deleteStudent(int roll);
	
}
