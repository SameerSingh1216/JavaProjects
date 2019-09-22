package com.sameer.dao;

import java.util.List;

import com.sameer.model.Student;
import com.sameer.model.UserLogin;

public interface StudentDao {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int taskId);
	public Student getStudent(int taskId);
	public List getAllStudent();	
	
	public void addUser(UserLogin userLogin);

}
