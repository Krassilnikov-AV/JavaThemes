/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.AggregationAndComposition;

/**
 * Класс Truck
 */
public class Truck extends Car {

	public Truck(String model, int maxSpeed, Engine engine, int yearOfManufacture) {
		super(model, maxSpeed, engine, yearOfManufacture);
	}

	@Override
	public void gas() {
		System.out.println("Вы нажали на педаль газа автомобиля грузового типа \n" +
			"модель: " + getModel() + "\n максимальная скорость: " + getMaxSpeed() +
			"\n мощность двигателя: " + getEngine() + "\n год изготовления: " + getYearOfManufacture());
		System.out.println("you have pressed the gas pedal of a Truck car");
		System.out.println("------------------------------------------");

	}
}