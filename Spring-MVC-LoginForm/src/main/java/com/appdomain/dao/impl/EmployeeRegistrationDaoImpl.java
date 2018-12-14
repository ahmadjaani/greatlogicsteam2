package com.appdomain.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.appdomain.dao.EmployeeRegistrationDao;
import com.appdomain.dto.UserDTO;

@Repository
public class EmployeeRegistrationDaoImpl implements EmployeeRegistrationDao {

/*	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSource;*/
	
/*	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}*/

	
	

	@Override
	public void insertEmployeeInToDB(UserDTO userData) {
		
		System.out.println("in EmployeeRegistrationDaoImpl(): insertEmployeeInToDB() jdbcTemplate: ");
		DriverManagerDataSource dataSource = new DriverManagerDataSource("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:Reddy13","HR","Surendra123");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		System.out.println("jdbcTemplate:::::"+jdbcTemplate);
		
		/**
		 * Specify the statement
		 */
		String query = "INSERT INTO SpringEmployees (firstName, lastName, mobileNumber,Email,password,profilepic) VALUES (?,?,?,?,?,?)";
		/**
		 * Specify the values 
		 */
		jdbcTemplate.update(query,  userData.getFirstName(),
				userData.getLastName(), userData.getMobileNumber(), userData.getContactEmail(),userData.getPassword(),userData.getImage().getBytes()
				);
	}

}
