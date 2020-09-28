package com.capgi;

public class EmployeeWageBuilder {

	private final static int IS_FULLTIME_EMPLOYEE = 1;
	private final static int IS_PARTTIME_EMPLOYEE = 2;

	private int noOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageBuilder() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int noOfDays, int maxHours) {
		companyEmpWageArray[noOfCompany] = new CompanyEmpWage(company, empRatePerHour, noOfDays, maxHours);
		noOfCompany++;
	}

	private void computeEmpWage() {
		for (int i = 0; i < noOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHours = 0, totalEmpHours = 0, totalWorkingDays = 0;

		while (totalEmpHours <= companyEmpWage.maxHours && totalWorkingDays < companyEmpWage.numOfDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case IS_PARTTIME_EMPLOYEE:
				empHours = 4;
				break;
			case IS_FULLTIME_EMPLOYEE:
				empHours = 8;
				break;
			default:
				empHours = 0;
			}

			totalEmpHours += empHours;
			System.out.println("Day: " + totalWorkingDays + " Emp Hr:  " + empHours);
		}
		return totalEmpHours * companyEmpWage.empRatePerHour;

	}

	public static void main(String[] args) {
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		empWageBuilder.addCompanyEmpWage("Amazon", 30, 5, 10);
		empWageBuilder.addCompanyEmpWage("Reliance jio", 10, 8, 20);
		empWageBuilder.computeEmpWage();
	}

}