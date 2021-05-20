package com.qa.practice.javabeginner.inheritance;

public class Employee extends Person {
	private double annualSalary;
	private double weeklySalary;
	
	public Employee() {
		this.annualSalary = 0;
		this.weeklySalary = 0;
	}
	
	public Employee(double annualSalary, double weeklySalary) {
		this.annualSalary = annualSalary;
		this.weeklySalary = weeklySalary;
	}
	
	public double getAnnualSalary() {
		return this.annualSalary;
	}
	
	public double getWeeklySalary() {
		return this.weeklySalary;
	}
	
	public double calculateWeeklySalary() {
		return this.annualSalary / 52;
	}
}
