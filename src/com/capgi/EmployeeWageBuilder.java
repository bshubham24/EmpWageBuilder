package com.capgi;

public class EmployeeWageBuilder {
   public static void main(String[] args) {
	   
		int IS_FULLTIME_EMPLOYEE = 1;
		

   
	    int IS_PARTTIME_EMPLOYEE = 2;
		int EMP_RATE_PER_HOUR = 20;
		int emp_Hrs=0;
		int emp_Wage=0;
		double Check= Math.floor(Math.random()*10)%3;
		if(Check== IS_FULLTIME_EMPLOYEE) {
			emp_Hrs = 8;
		}
		else if(Check== IS_PARTTIME_EMPLOYEE) {
			emp_Hrs =4;
		}
		else {
			emp_Hrs = 0;
		}
		emp_Wage = emp_Hrs*EMP_RATE_PER_HOUR;
		System.out.println(emp_Wage);
		
	}
   
}
