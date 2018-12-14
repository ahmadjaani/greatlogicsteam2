package com.appdomain.dao.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.appdomain.dao.UserDao;
import com.appdomain.pojo.Employee;

public class UserDaoImpl2 implements UserDao {

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}



	@Override
	public void insertUser(Employee emp) throws ClassNotFoundException, SQLException {

	}

}
