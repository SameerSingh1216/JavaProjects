package com.sameer.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;

import com.sameer.model.Student;
import com.sameer.model.UserLogin;
import com.sameer.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String,Object> map) {
		Student student = new Student();
		map.put("student",student);
		map.put("studentList", studentService.getAllStudent());
		return "Student";
	}	
	
	@RequestMapping(value="/user.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student, BindingResult result,  @RequestParam String action, Map<String, Object> map) {
		Student studentResult = new Student();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			studentService.add(student);
			studentResult = student;
			return "addSuccess";
		case "edit":
			studentService.edit(student);
			studentResult = student;
			return "editSuccess";
		case "delete":
			studentService.delete(student.getTaskId());
			studentResult = new Student();
			return "deleteSuccess";
		case "search":
			Student searchedStudent = studentService.getStudent(student.getTaskId());
			studentResult = new Student();
			studentResult = searchedStudent!=null ? searchedStudent : new Student();
			map.put("student", studentResult);
			map.put("studentList", studentService.getStudent(student.getTaskId()));
			return "searchSuccess";
		}
		map.put("student", studentResult);
		map.put("studentList", studentService.getAllStudent());
		return "addSuccess" ;
	}
	
	@RequestMapping(value="/userlogin.do", method = RequestMethod.GET)
    public String doActionUser(@ModelAttribute UserLogin userLogin, BindingResult result, SessionStatus status, Map<String,Object> map) {
			UserLogin userlogin = new UserLogin();
		
		map.put("userlogin", userlogin);
		studentService.addUser(userlogin);
		status.setComplete();
         return "UserLogin";
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {

		ModelAndView model = new ModelAndView("error/exception_error");
		return model;

	}
	
}
