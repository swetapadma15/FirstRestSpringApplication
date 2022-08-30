package org.com.firstSpringReactApplication.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.com.firstSpringReactApplication.model.Student;
import org.com.firstSpringReactApplication.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	private List<Student> students = new ArrayList();

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int roll) {
		for (Student student : students) {
			if (student.getRoll() == roll) {
				return student;
			}
		}
		return null;
	}

	@Override
	public String addStudent(Student student) {
		students.add(student);
		return student.getName();
	}

	@Override
	public Student updateStudent(Student student) {
		for (Student std : students) {
			if (std.getRoll() == student.getRoll()) {
				std.setName(student.getName());
				std.setAge(student.getAge());
				std.setBranch(student.getBranch());
				std.setBatch(student.getBatch());
				return std;
			}
		}
		return null;
	}

	@Override
	public int deleteStudent(int roll) {
		students.removeIf(student -> student.getRoll() == roll);
		return roll;
	}

}
