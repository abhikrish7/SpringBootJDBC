package com.bootinuse.springbootjdbc.bo;

import org.springframework.stereotype.Service;

import com.bootinuse.springbootjdbc.vo.StudentModel;

@Service
public interface StudentBO {
	
	public void addStudent(StudentModel studentModel);

}
