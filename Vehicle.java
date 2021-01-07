package com.qa.Garage;

public abstract class Vehicle {

	String manufacturer;
	String model;
	int modelYear;
	float litre;

	public Vehicle(String manufacturer, String model, int modelYear, double d) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.modelYear = modelYear;
		this.litre = (float) d;
	}

	public Vehicle() {
		super();
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public float getLitre() {
		return litre;
	}

	public void setLitre(float litre) {
		this.litre = litre;
	}

	@Override
	public String toString() {
		return "Vehicle [manufacturer=" + manufacturer + ", model=" + model + ", modelYear=" + modelYear + ", litre="
				+ litre + "]";
	}

}
