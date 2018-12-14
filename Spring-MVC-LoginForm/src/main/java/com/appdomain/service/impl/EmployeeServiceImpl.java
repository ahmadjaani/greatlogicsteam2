package com.appdomain.service.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.appdomain.pojo.Employee;
import com.appdomain.service.EmployeeService;

@Service("employeeService")
@SuppressWarnings("unchecked")
public class EmployeeServiceImpl implements EmployeeService{

	public Employee getEmployeeByEmail(String email){

		DriverManagerDataSource dataSource = new DriverManagerDataSource("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:REDDY13","HR","Surendra123");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		System.out.println("jdbcTemplate:::::"+jdbcTemplate);

		String fetchEmpQuery = "Select Firstname from SpringEmployees WHERE Email = (?)";
		
	
		List<Employee> employees  = jdbcTemplate.query("Select * from SpringEmployees WHERE Email = (?)",new Object[] { email},new BeanPropertyRowMapper(Employee.class));

		if(!CollectionUtils.isEmpty(employees)){
			return employees.get(0);
		}

		return null;
	}

	@Override
	public Employee getEmployeeByMobileNumber(String mobileNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
