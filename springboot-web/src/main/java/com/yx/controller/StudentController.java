package com.yx.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.entity.Student;
import com.yx.service.IStudentService;
import com.yx.utils.RedisUtil;

@RestController
public class StudentController {
	private final Logger log = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private IStudentService studentService;
	@Autowired
	private RedisUtil redisUtil;

	@GetMapping("/queryAll")
	public List<Student> queryAllStudents() {
		PageHelper.startPage(2, 3);
		List<Student> students = studentService.queryStudents();
		PageInfo<Student> pageInfo = new PageInfo<Student>(students);
		log.info("info:{}", students);
		return pageInfo.getList();
	}

	@GetMapping("index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@GetMapping("/redis")
	public String testRedis() throws Exception {
		List<Student> list = studentService.queryStudents();
		Student student = list.get(0);
		redisUtil.set("name1", student.getStuName());
		redisUtil.set("name2", student);
		return redisUtil.get("name1") + "===>" + redisUtil.get("name2");
	}
}
