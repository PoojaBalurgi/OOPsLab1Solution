package com.labfirst.driver;

import java.util.Scanner;

import com.labfirst.module.Employee;
import com.labfirst.services.CredentialService;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String FirstName, LastName, dept = null;
		int Department;
		System.out.println("Enter your first name: ");
		FirstName=sc.next();
		
		System.out.println("Enter your first name: ");
		LastName= sc.next();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical\n 2. Admin\n 3. Human Resource\n 4. Legal");
		Department=sc.nextInt();
		
		switch(Department) 
		{
			case 1:
				dept="tech";
				break;
			case 2:
				dept="admin";
				break;
			case 3:
				dept="hr";
				break;
			case 4:
				dept="legal";
				break;
			default:
				System.out.println("Invalid Choice");
				System.exit(0);
		}
		
		Employee emp=new Employee(FirstName, LastName);
		emp.setDepartment(dept);
		
		CredentialService ser= new CredentialService();
		ser.generateEmailAddress(emp.getFirstName(),emp.getLastName(), emp.getDepartment());
		ser.generatePassword();
		
		ser.showCredentials(emp.getFirstName());
		
		
	}
}
