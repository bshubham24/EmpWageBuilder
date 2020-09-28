package com.capgi;

public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int numOfDays;
	public final int maxHours;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfDays, int maxHours) {

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfDays = numOfDays;
		this.maxHours = maxHours;

	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for Company : " + company + " : " + totalEmpWage;
	}
}
