package com.capgi;

public class EmployeeWageBuilder {
   public static void main(String[] args) {
	   
		final int IS_FULLTIME_EMPLOYEE = 1;
	    final int IS_PARTTIME_EMPLOYEE = 2;
		int EMP_RATE_PER_HOUR = 20;
		int emp_Hrs=0;
		int emp_Wage=0;
	    int Check= (int)Math.floor(Math.random()*10)%3;
		switch(Check) {
		case IS_FULLTIME_EMPLOYEE :
			emp_Hrs = 8;
		    break;
		
		    case IS_PARTTIME_EMPLOYEE :
			emp_Hrs =4;
		    break;
		
		   default:
			emp_Hrs = 0;
		}
		emp_Wage = emp_Hrs*EMP_RATE_PER_HOUR;
		System.out.println(emp_Wage);
   }
   
}
