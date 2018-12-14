package com.appdomain.dao.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.appdomain.dao.UserDao;
import com.appdomain.pojo.Employee;

public class UserDaoImpl implements UserDao {


	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}


	@Override
	public void insertUser(Employee emp) throws ClassNotFoundException, SQLException{

		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:REDDY13","HR","Surendra123");  

		PreparedStatement ps =con.prepareStatement("insert into GreatLogicEmployees values(?,?,?,?)");  

		ps.setString(1,emp.getFirstName());  
		ps.setString(2,emp.getLastName());  
		ps.setString(3,emp.getMobileNumber()); 
		ps.setString(4,emp.getEmail());  
		
		int i = ps.executeUpdate();  

		con.close();  

	}

}
