package com.sameer.dao.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

import com.sameer.dao.StudentDao;
import com.sameer.model.Student;
import com.sameer.model.UserLogin;

@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private SessionFactory session;
	
	java.util.TimeZone tz = java.util.TimeZone.getTimeZone("GMT+1");
	java.util.Calendar c = java.util.Calendar.getInstance(tz);
	String dateTime= c.getTime().toString();
	
	@Override
	public void add(Student student) {
		student.setDate(dateTime);
		session.getCurrentSession().save(student);
	}
	@Override
	public void edit(Student student) {
		student.setDate(dateTime);
		session.getCurrentSession().update(student);
	}
	@Override
	public void delete(int taskId) {
		session.getCurrentSession().delete(getStudent(taskId));
		}
	@Override
	public Student getStudent(int taskId) {
		//student.setDate(dateTime);
		return (Student)session.getCurrentSession().get(Student.class,taskId);
	}
	@Override
	public List getAllStudent() {
		return session.getCurrentSession().createQuery("from Student").list();	}
	
	@Override
	public void addUser(UserLogin userLogin) {
		session.getCurrentSession().save(userLogin);
		
	}

}
