package com.qa.Garage;

public class Motorcycle extends Vehicle {

	int topSpeed;
	String bodyType;

	public Motorcycle(String manufacturer, String model, int modelYear, double d, int topSpeed, String bodyType) {
		super(manufacturer, model, modelYear, d);
		this.topSpeed = topSpeed;
		this.bodyType = bodyType;
	}

	@Override
	public String toString() {
		return "Motorcycle [topSpeed=" + topSpeed + ", bodyType=" + bodyType + ", manufacturer=" + manufacturer
				+ ", model=" + model + ", modelYear=" + modelYear + ", litre=" + litre + "]";
	}

}
