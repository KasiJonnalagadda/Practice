package com.kasi.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kasi.studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
}
