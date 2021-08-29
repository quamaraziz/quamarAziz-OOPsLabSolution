package com.itsupportapp.service;

import com.itsupportapp.model.Employee;

public interface CredentialService {
	
	public String generatePassword(int passwordLength);
	public String generateEmailAddress(String dept, Employee employee);
	public void showCredentials(String email, String password,Employee employee);
}
