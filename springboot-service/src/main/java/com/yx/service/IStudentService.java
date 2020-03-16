package com.yx.service;

import java.util.List;

import com.yx.entity.Student;

public interface IStudentService {
	void addStudent(Student student);

	List<Student> queryStudents();
}
