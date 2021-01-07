package com.qa.Garage;

public class Runner {

	public static void main(String[] args) {

		Garage garage = new Garage();

		garage.add(new Car("Audi", "A5", 2012, 3.0, 5));

		garage.add(new Motorcycle("Kawasaki", "ER-6F", 2009, 0.65, 135, "fairing"));

		garage.add(new Lorry("Mercedes", "Actros", 2010, 1.3, "Bosch Dover"));

		garage.calcBill("ER-6F");

		// garage.empty();

		System.out.println(garage);

	}

}
