package com.bootinuse.springbootjdbc.exception;

public class MySQLIntegrityConstraintViolationException extends Exception{
	
	String lscheckexception=null;
	public MySQLIntegrityConstraintViolationException(String s){
		
		lscheckexception=s;
	}
	
	public String toString() {
		return lscheckexception;
		
	}

}
