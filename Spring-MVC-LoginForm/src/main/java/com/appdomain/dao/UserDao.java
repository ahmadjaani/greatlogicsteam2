package com.appdomain.dao;

import java.sql.SQLException;
import java.util.List;

import com.appdomain.pojo.Employee;

public interface UserDao {
	
	public List<Employee> getAllEmployees() ;

	public void insertUser(Employee emp) throws ClassNotFoundException, SQLException;
}
