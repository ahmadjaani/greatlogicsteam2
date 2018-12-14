package com.appdomain.forms.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.appdomain.forms.UserRegistrationForm;

@Component
public class UserRegistrationFormValidator implements Validator {

	
	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		
		UserRegistrationForm userRegistrationForm = (UserRegistrationForm) obj;
		
		
		if(userRegistrationForm.getFirstName() == null || userRegistrationForm.getFirstName().length()<=0){
			errors.rejectValue("firstName", "error.firstname.shouldnotempty", "Dear user please enter some value");
		}
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "userRegistrationFormForm.lastName.invalid");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactEmail", "userRegistrationFormForm.emailID.invalid");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobileNumber", "userRegistrationFormForm.mobileNumber.invalid");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "userRegistrationFormForm.password.invalid");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "userRegistrationFormForm.confirmPassword.invalid");
/*		if(!userRegistrationForm.getPassword().equals(userRegistrationForm.getConfirmPassword())){
			errors.rejectValue("userRegistrationFormForm.passwords.mismatch","passwords did not match");
		}*/
	
	
	}

}
