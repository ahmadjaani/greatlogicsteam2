package com.appdomain.mappers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
	
import org.springframework.jdbc.core.RowMapper;

import com.appdomain.pojo.Employee;

public class EmployeeRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee emp = new Employee();
		emp.setFirstName(rs.getString("firstName"));
		emp.setLastName(rs.getString("lastName"));
		emp.setMobileNumber(rs.getString("mobileNumber"));
		emp.setEmail(rs.getString("email"));
		
		Blob b = rs.getBlob("profilePic");//5 means5th column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
		File imageFile = new File("C:\\Users\\msantosh\\Desktop\\picSample.jpg");
		FileOutputStream fout;
		try {
			fout = new FileOutputStream(imageFile);
			fout.write(barr);  
			fout.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		emp.setProfilePicFile(imageFile);
		
		return emp;
	}
	
}
