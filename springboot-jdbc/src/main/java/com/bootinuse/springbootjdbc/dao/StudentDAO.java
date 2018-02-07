package com.bootinuse.springbootjdbc.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bootinuse.springbootjdbc.vo.StudentModel;

@Service
public interface StudentDAO {
	
	public void insertStudent(StudentModel studentModel);

}
