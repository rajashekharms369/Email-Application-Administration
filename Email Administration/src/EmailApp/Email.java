package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private int defaultPasswordLength;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
//	Constructor to recieve the first name and last name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Created: "+this.firstname+" "+this.lastname);
		
//		Call a method asking for the department - return the department
		this.department = setDepartment();
		if(this.department == "") {
			System.out.println("Department is not set.");
		}
		else {
			System.out.println("Department is set "+this.department);
		}
		
//		Call a method that returns  a random password.
		this.password = randomPassword(8);
		System.out.println("Your password is: "+this.password);
		
//		Combine elements to generate email
		String email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+".abcdcompany.com";
	}

//	firstname.lastname@department.company.com
	
	
	
	
	
	
	
	
//	Ask for the department
	public String setDepartment() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 for sales.");
		System.out.println("Select 2 for Dev.");
		System.out.println("Select 3 for Accounting.");
		
		int d = sc.nextInt();
		if(d==1) {
			return "Sales";
		}
		else if(d==2) {
			return "Development";
		}
		else if(d==3) {
			return "Accounting";
		}
		else {
			return "";
		}
	}
	
//	Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
		char[] passcode = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			passcode[i] = passwordSet.charAt(rand);
		}
		return new String(passcode);
	}
	
	
//	Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
//	Set the alternate email.
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
//	Change the password.
	public void changePassword(String password) {
		this.password = password;
	}
	
//	Get methods
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
}
