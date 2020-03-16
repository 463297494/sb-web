package com.yx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yx.entity.Student;
import com.yx.mapper.dao.StudentMapper;
import com.yx.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentMapper studentDao;

	@Override
	public void addStudent(Student student) {
		studentDao.insert(student);
	}

	@Override
	public List<Student> queryStudents() {
		return studentDao.select();
	}
}
