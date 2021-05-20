package com.qa.practice.javabeginner.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	private List<Employee> employeesUnderManager;
	
	public Manager() {
		this.employeesUnderManager = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		this.employeesUnderManager.add(employee);
	}
	
	public void readEmployees() {
		for (int i=0; i<this.employeesUnderManager.size(); i++) {
			System.out.println(this.employeesUnderManager.get(i));
		}
	}
	
	public void removeEmployee(Employee employee) {
		for (int i=0; i<this.employeesUnderManager.size(); i++) {
			if (this.employeesUnderManager.get(i).equals(employee)) {
				this.employeesUnderManager.remove(i);
			}
		}
	}
	
}
