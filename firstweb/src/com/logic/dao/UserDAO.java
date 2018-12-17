package com.logic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.logic.model.User;

public class UserDAO {
	private static Connection con;

	static {
		con = DbUtil.getConnection();
	}

	public static int save(User user) {
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into emp2 values(?,?,?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setInt(3, user.getId());
			ps.setString(4, user.getPassword());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

	public static boolean validate(String email, String pwd) {
		boolean bool = false;
		try {
		PreparedStatement st = con.prepareStatement("select *from emp2");
//		st.setString(1, email);
//		st.setString(2, pwd);
		ResultSet rs = st.executeQuery();
//		System.out.println("after resultset");
		while(rs.next()) {
//			System.out.println("inside whileloop");
			if(email.equals(rs.getString(2)) &&  pwd.equals(rs.getString(4))) {
				bool = true;
				System.out.println("email and password matching");
			}
			else
				System.out.println("not matching");
		}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return bool;
	}
	
	public static int update(int id) {
		return 0;
	}

	public static int delete(int id) {
		return 0;
	}

	public static List<User> getAll() {
		return null;
	}

	public static User getById() {
		return null;
	}
}