package com.capgi;

public class EmployeeWageBuilder {

	private final static int IS_FULLTIME_EMPLOYEE = 1;
	private final static int IS_PARTTIME_EMPLOYEE = 2;
	private final String company;
	private final int EMP_RATE_PER_HOUR;
	private final int NO_OF_DAYS;
	private final int EMP_MAX_HOURS;
	private int total_wage;

	public EmployeeWageBuilder(String company, int EMP_RATE_PER_HOUR, int NO_OF_DAYS, int EMP_MAX_HOURS) {
		this.company = company;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NO_OF_DAYS = NO_OF_DAYS;
		this.EMP_MAX_HOURS = EMP_MAX_HOURS;
	}

	public void ComputeEmpWage() {
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

		total_wage = total_hrs * EMP_RATE_PER_HOUR;

	}

	public String toString() {
		return ("Total wage for " + company + " : " + total_wage);
	}

	public static void main(String[] args) {
		EmployeeWageBuilder Amazon = new EmployeeWageBuilder("Amazon", 20, 3, 12);
		EmployeeWageBuilder RelianceJio = new EmployeeWageBuilder("Reliance jio", 10, 2, 8);
		Amazon.ComputeEmpWage();
		System.out.println(Amazon);
		RelianceJio.ComputeEmpWage();
		System.out.println(RelianceJio);

	}

}
