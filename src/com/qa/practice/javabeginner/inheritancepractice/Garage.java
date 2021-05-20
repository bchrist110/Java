package com.qa.practice.javabeginner.inheritancepractice;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> vehiclesInGarage;
	
	public Garage() {
		this.vehiclesInGarage = new ArrayList<>();
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehiclesInGarage.add(vehicle);
	}
	
	public void readVehiclesInGarage() {
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			System.out.println(this.vehiclesInGarage.get(i));
		}
	}
	
	public void removeVehicle(Vehicle vehicle) {
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i).equals(vehicle)) {
				this.vehiclesInGarage.remove(i);
			}
		}
	}
	
	public void findTotalValue() {
		int total = 0;
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			total += this.vehiclesInGarage.get(i).getValue();
		}
		System.out.println(total);
	}
	
	public void valueOfAllCars() {
		int total = 0;
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i) instanceof CarType) {
				total += this.vehiclesInGarage.get(i).getValue();
			}
		}
		System.out.println(total);
	}
	
	public void valueOfAllMotorcycles() {
		int total = 0;
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i) instanceof Motorcycle) {
				total += this.vehiclesInGarage.get(i).getValue();
			}
		}
		System.out.println(total);
	}
	
	public void valueOfAllScooters() {
		int total = 0;
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i) instanceof Scooter) {
				total += this.vehiclesInGarage.get(i).getValue();
			}
		}
		System.out.println(total);
	}
	
	public void averageValueOfAllVehicles() {
		int total = 0;
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			total += this.vehiclesInGarage.get(i).getValue();
		}
		System.out.println(total/vehiclesInGarage.size());
	}
	
	public void averageValueOfAllCars() {
		int total = 0;
		int totalCars = 0;
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i) instanceof CarType) {
				total += this.vehiclesInGarage.get(i).getValue();
				totalCars++;
			}
		}
		System.out.println(total/totalCars);
	}
	
	public void averageValueOfAllMotorcycles() {
		int total = 0;
		int totalCars = 0;
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i) instanceof Motorcycle) {
				total += this.vehiclesInGarage.get(i).getValue();
				totalCars++;
			}
		}
		System.out.println(total/totalCars);
	}
	
	public void averageValueOfAllScooters() {
		int total = 0;
		int totalCars = 0;
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i) instanceof Scooter) {
				total += this.vehiclesInGarage.get(i).getValue();
				totalCars++;
			}
		}
		System.out.println(total/totalCars);
	}
	
	public int fixVehicle(Vehicle vehicle) {
		//declaring that fixing a vehicle costs 1/4 of the vehicle cost
		int costOfRepair = vehicle.getValue()/4;
		return costOfRepair;
	}
	
	public void EmptyGarage() {
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			this.vehiclesInGarage.remove(i);
		}
	}
	
	public void removeAllCars() {
		this.vehiclesInGarage.clear();
	}
	
	public void removeAllMotorcycles() {
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i) instanceof Motorcycle) {
				this.vehiclesInGarage.remove(i);
			}
		}
	}
	
	public void removeAllScooters() {
		for (int i=0; i<this.vehiclesInGarage.size(); i++) {
			if (this.vehiclesInGarage.get(i) instanceof Scooter) {
				this.vehiclesInGarage.remove(i);
			}
		}
	}
	
	public void removeByID(int id) {
		this.vehiclesInGarage.remove(id);
	}
}
