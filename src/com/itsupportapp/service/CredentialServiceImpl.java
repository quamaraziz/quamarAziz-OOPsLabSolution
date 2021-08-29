package com.itsupportapp.service;

import com.itsupportapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String generatePassword(int passwordLength) {
		final String alphaNumeric ="abcdefghijklmnopqrstwxyz"+
							"ABCDEFGHIJKLMNOPQRSTWXYZ"+
							"0123456789"+"~!@#$%^";
		StringBuilder obj = new StringBuilder(passwordLength);
		
		for(int i=0; i < passwordLength; i++) {
			int index = (int)(alphaNumeric.length()*Math.random());
			
			obj.append(alphaNumeric.charAt(index));
		}
		return obj.toString();
	}

	@Override
	public String generateEmailAddress(String dept, Employee employee) {
		
		String emailAddress = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + dept + ".abc.com" ;
		return emailAddress;
	}

	@Override
	public void showCredentials(String email, String password,Employee employee) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email --> "+email);
		System.out.println("Password --> "+password);

	}

}
