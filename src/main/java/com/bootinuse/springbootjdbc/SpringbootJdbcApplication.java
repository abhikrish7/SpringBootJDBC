package com.bootinuse.springbootjdbc;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.bootinuse.springbootjdbc.bo.StudentBO;
import com.bootinuse.springbootjdbc.vo.StudentModel;

@SpringBootApplication
@ComponentScan("com.bootinuse.springbootjdbc")
public class SpringbootJdbcApplication {

	
	/*@Autowired
	StudentBO studentBO;
	
	@Autowired
	StudentModel studentModel;*/
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootJdbcApplication.class, args);
		
		/*ApplicationContext context = SpringApplication.run(SpringbootJdbcApplication.class, args);
		StudentBO studentBO = context.getBean(StudentBO.class);
		StudentModel studentModel =context.getBean(StudentModel.class);
		
		studentModel.setId("Aug13");
		studentModel.setName("Abhi");
		studentModel.setAge("25");
		studentModel.setResult("Pass");
		
		studentBO.addStudent(studentModel);*/
	}
	
}
