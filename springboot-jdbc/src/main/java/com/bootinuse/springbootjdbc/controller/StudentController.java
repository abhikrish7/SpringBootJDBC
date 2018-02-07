package com.bootinuse.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bootinuse.springbootjdbc.bo.StudentBO;
import com.bootinuse.springbootjdbc.vo.StudentModel;

@Controller
public class StudentController {
	
	@Autowired
	StudentBO studentBO;
	
	@RequestMapping(value="welcome",method=RequestMethod.GET)
	public ModelAndView welcome() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="addStudent",method=RequestMethod.GET)
	public ModelAndView showStudent() {
		return new ModelAndView("addStudent", "student", new StudentModel());
	}
	
	@RequestMapping(value="addStudent",method=RequestMethod.POST)
	public void insertStudent(@ModelAttribute ("student") StudentModel student) {
		
		studentBO.addStudent(student);
		System.out.println("Success royy");
	}

}
