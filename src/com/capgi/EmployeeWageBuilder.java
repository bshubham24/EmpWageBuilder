package com.capgi;

public class EmployeeWageBuilder {
   public static void main(String[] args) {
	   
		int IS_FULLTIME_EMPLOYEE = 1;
		
		double CHECK = Math.floor(Math.random()*10)%2;
		
		if(CHECK== IS_FULLTIME_EMPLOYEE) {
			System.out.println("FULLTIME EMPLOYEE");
		}
		else {
			System.out.println("NOT A FULLTIME EMPLOYEE");
		}
	
   }
}
