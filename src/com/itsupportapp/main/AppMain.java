package com.itsupportapp.main;

import java.util.Scanner;

import com.itsupportapp.model.Employee;
import com.itsupportapp.service.CredentialService;
import com.itsupportapp.service.CredentialServiceImpl;

public class AppMain {

	public static void main(String[] args) {
		
		String email;
		String password;
		String dept = null;
		
		Employee employee = new Employee("Quamar","Aziz");
		CredentialService credentialService = new CredentialServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		boolean button = true;
		
		while(button) {
			System.out.printf("Please enter the department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal\n");
			int input = sc.nextInt();
			if(input>0 && input<5) {
				switch(input) {
				case 1:
					dept = "tech";
					break;
				case 2:
					dept = "admin";
					break;
				case 3:
					dept = "hr";
					break;
				case 4:
					dept = "legal";
					break;
				}
				
				email = credentialService.generateEmailAddress(dept, employee);
				password = credentialService.generatePassword(8);
				credentialService.showCredentials(email, password, employee);
				button = false;
			}
			else
				System.out.printf("You have  entered an invalid input, Please enter a valid input.\n==============================\n");
			continue;
							
		}		
		
		sc.close();
		
		
	}

}
