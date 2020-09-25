package com.capgi;

public class EmployeeWageBuilder {

	public final static int IS_FULLTIME_EMPLOYEE = 1;
	public final static int IS_PARTTIME_EMPLOYEE = 2;
	public final static int EMP_RATE_PER_HOUR = 20;
	public final static int NO_OF_DAYS = 2;
	int total_wage = 0;
	static int EMP_MAX_HOURS = 10;

	public static int ComputeEmpWage() {

		int emp_Hrs = 0;

		int total_hrs = 0;
		int total_days = 0;
		while (total_days < NO_OF_DAYS && total_hrs < EMP_MAX_HOURS) {
			total_days++;
			int CHECK = (int) Math.floor(Math.random() * 10) % 3;
			switch (CHECK) {
			case IS_FULLTIME_EMPLOYEE:
				emp_Hrs = 8;
				break;

			case IS_PARTTIME_EMPLOYEE:
				emp_Hrs = 4;
				break;

			default:
				emp_Hrs = 0;
			}
			total_hrs += emp_Hrs;
		}
		System.out.println("Total days: " + total_days + " Total hours: " + total_hrs);

		int total_wage = total_hrs * EMP_RATE_PER_HOUR;

		System.out.println("Total wage: " + total_wage);
		return total_wage;

	}

	public static void main(String[] args) {
		ComputeEmpWage();
	}

}
