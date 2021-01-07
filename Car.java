package com.qa.Garage;

public class Car extends Vehicle {

	int doorNum;

	public Car(String manufacturer, String model, int modelYear, double d, int doorNum) {
		super(manufacturer, model, modelYear, d);
		this.doorNum = doorNum;
	}

	@Override
	public String toString() {
		return "Car [doorNum=" + doorNum + ", manufacturer=" + manufacturer + ", model=" + model + ", modelYear="
				+ modelYear + ", litre=" + litre + "]";
	}

}
