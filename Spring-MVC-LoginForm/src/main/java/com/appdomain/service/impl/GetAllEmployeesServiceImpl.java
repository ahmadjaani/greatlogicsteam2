package com.appdomain.service.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.appdomain.dto.SpringEmployeeDTO;
import com.appdomain.service.GetAllEmployeesServiceInterface;


public class GetAllEmployeesServiceImpl extends JdbcDaoSupport implements GetAllEmployeesServiceInterface {

	@Override
	public List<SpringEmployeeDTO> getAllEmployeesFromDB() {

		List<SpringEmployeeDTO> springEmployeesDTOList = getJdbcTemplate().query("Select * from SpringEmployees",new BeanPropertyRowMapper(SpringEmployeeDTO.class));
		
		return springEmployeesDTOList;
	}

}
