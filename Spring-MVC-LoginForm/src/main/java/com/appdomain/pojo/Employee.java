package com.appdomain.pojo;

import java.io.File;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Employee {
	
	String firstName;
	
	String lastName;
	
	String mobileNumber;
	
	String email;
	
	String password;
	
	CommonsMultipartFile image;
	
	File profilePicFile;
	

	public File getProfilePicFile() {
		return profilePicFile;
	}

	public void setProfilePicFile(File profilePicFile) {
		this.profilePicFile = profilePicFile;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CommonsMultipartFile getImage() {
		return image;
	}

	public void setImage(CommonsMultipartFile image) {
		this.image = image;
	}
	


}
