package com.appdomain.service.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.appdomain.mappers.EmployeeRowMapper;
import com.appdomain.pojo.Employee;
import com.appdomain.service.EmployeeService;


public class EmployeeServiceImplUsingJDBCDaoSupport extends JdbcDaoSupport implements EmployeeService{

	@Override
	public Employee getEmployeeByEmail(String email) {
		/**
		 * Specify the statement
		 */
		String fetchEmpQuery = "Select * from SpringEmployees WHERE Email = (?)";
		/**
		 * Specify the values 
		 */
		
		List<Employee> employees  = getJdbcTemplate().query(fetchEmpQuery,new Object[] { email},new EmployeeRowMapper());

		if(!CollectionUtils.isEmpty(employees)){
			return employees.get(0);
		}

		return null;
	}
	
	@Override
	public Employee getEmployeeByMobileNumber(String mobileNumber) {
		/**
		 * Specify the statement
		 */
		String fetchEmpQuery = "Select * from SpringEmployees WHERE mobileNumber = (?)";
		/**
		 * Specify the values 
		 */
		
		List<Employee> employees  = getJdbcTemplate().query(fetchEmpQuery,new Object[] { mobileNumber},new EmployeeRowMapper());

		if(!CollectionUtils.isEmpty(employees)){
			return employees.get(0);
		}

		return null;
	}

}
