package com.qa.Garage;

public class Lorry extends Vehicle {

	String CBradioMake;

	public Lorry(String manufacturer, String model, int modelYear, double d, String CBradioMake) {
		super(manufacturer, model, modelYear, d);
		this.CBradioMake = CBradioMake;
	}

	@Override
	public String toString() {
		return "Lorry [CBradioMake=" + CBradioMake + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", modelYear=" + modelYear + ", litre=" + litre + "]";
	}

}
