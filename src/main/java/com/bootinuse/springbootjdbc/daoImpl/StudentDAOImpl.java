package com.bootinuse.springbootjdbc.daoImpl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import com.bootinuse.springbootjdbc.dao.StudentDAO;
import com.bootinuse.springbootjdbc.exception.MySQLIntegrityConstraintViolationException;
import com.bootinuse.springbootjdbc.vo.StudentModel;

@Repository
public class StudentDAOImpl extends JdbcDaoSupport implements StudentDAO{

	Logger logger =Logger.getLogger(StudentDAOImpl.class);
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertStudent(StudentModel studentModel) {

		logger.info("Inserting student into UserData table");
		try {
			
			String sql = "INSERT INTO studentdata VALUES (" + "?,?,?,?" + ")";
			getJdbcTemplate().update(sql,new Object[] {studentModel.getId(), 
					studentModel.getName(), studentModel.getAge(), studentModel.getResult()});
			logger.info("Successfully Inserted into Table");
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}

		
	}

}
