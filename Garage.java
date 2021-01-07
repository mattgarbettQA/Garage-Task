package com.qa.Garage;

import java.util.ArrayList;

public class Garage {
	int carValue = 3000;
	int bikeValue = 1000;
	int lorryValue = 10000;

	ArrayList<Vehicle> garage = new ArrayList<>();

	public void add(Vehicle v) {
		garage.add(v);
		System.out.println(garage);
	}

	public void remove(Vehicle v) {
		garage.remove(v);
	}

	public void output() {
		for (Vehicle v : garage) {
			System.out.println(v);
		}
	}

	public void empty() {
		garage.clear();
	}

	public void calcBill(String model) {
		for (Vehicle v : garage) {
			if (v instanceof Car & v.getModel().contains(model)) {
				System.out.println("Vehicle is a Car and the value of a car is £" + carValue);
			}
			if (v instanceof Motorcycle & v.getModel().contains(model)) {
				System.out.println("Vehicle is a Motorcyle and the value of a Motorcycle is £" + bikeValue);
			}
			if (v instanceof Lorry & v.getModel().contains(model)) {
				System.out.println("Vehilce is a Lorry and the value of a Lorry is £" + lorryValue);
			}
		}
	}

	@Override
	public String toString() {
		return "Garage [garage" + garage + "}";
	}

}
