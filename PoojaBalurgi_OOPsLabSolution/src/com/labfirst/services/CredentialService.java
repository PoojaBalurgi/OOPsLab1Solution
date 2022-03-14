package com.labfirst.services;
import java.util.Scanner;
import java.util.Random;

public class CredentialService {
	String email;
	char[] password=new char[8];
	
	Scanner sc= new Scanner(System.in);
	
	public void generatePassword(){
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~!@#$%^&*<.>/?";
		Random random=new Random();
		for(int i=0; i<8; i++)
		{
			password[i]=characters.charAt(random.nextInt(characters.length()));
			password[i]=characters.charAt(random.nextInt(characters.length()));
		}
	}
	
	public void generateEmailAddress(String fn, String ln, String Dep){
		email = fn+ln+"@"+Dep+".mycompany.com";
	}
	
	public void showCredentials(String nm){
		System.out.println("Dear "+nm+" your generated credentials are as follows");
		System.out.println("Email        --->  "+email);
		System.out.println("Password     --->  "+password);
		
	} 
}
