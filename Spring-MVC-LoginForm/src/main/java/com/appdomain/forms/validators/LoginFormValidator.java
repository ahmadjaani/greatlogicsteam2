package com.appdomain.forms.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.appdomain.forms.LoginForm;

@Component
public class LoginFormValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return LoginFormValidator.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {

		LoginForm loginForm = (LoginForm) obj;
		
		if(loginForm.getEmailID() == null || loginForm.getEmailID().length()<=1){
			errors.rejectValue("emailID", "enter proper email");
		}
		
	}

}
