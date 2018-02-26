package com.bootinuse.springbootjdbc.boImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootinuse.springbootjdbc.bo.StudentBO;
import com.bootinuse.springbootjdbc.dao.StudentDAO;
import com.bootinuse.springbootjdbc.vo.StudentModel;

@Service
public class StudentBOImpl implements StudentBO{

	@Autowired
	StudentDAO studentDAO;
	Logger logger =Logger.getLogger(StudentBOImpl.class);
	@Override
	public void addStudent(StudentModel studentModel) {
		
		logger.info("Started Adding the Student to UserData table");
		studentDAO.insertStudent(studentModel);		
	}

}
