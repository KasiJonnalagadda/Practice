package com.kasi.studentsystem.service;

import java.util.List;

import com.kasi.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
