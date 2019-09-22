package com.sameer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sameer.dao.StudentDao;
import com.sameer.model.Student;
import com.sameer.model.UserLogin;
import com.sameer.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentdao;
	
	@Transactional
	public void add(Student student) {
		studentdao.add(student);

	}

	@Transactional
	public void edit(Student student) {
		studentdao.edit(student);

	}

	@Transactional
	public void delete(int taskId) {
		studentdao.delete(taskId);

	}

	@Transactional
	public Student getStudent(int taskId) {
		
		return studentdao.getStudent(taskId);
	}

	@Transactional
	public List getAllStudent() {
		
		return studentdao.getAllStudent();
	}

	@Transactional
	public void addUser(UserLogin userLogin) {
		int a=1;
		userLogin.setId(Integer.toString(a));
		a++;
		userLogin.setPassword("pwd123");
		studentdao.addUser(userLogin);
		
	}

}
