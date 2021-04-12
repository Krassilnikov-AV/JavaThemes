/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.AggregationAndComposition;

/**
 * Класс Car - класс родитель
 */
public class Car {
	private String model;
	private int maxSpeed;
	private int yearOfManufacture;

	private Engine engine;
// пример композиции
	public Car() {
		this.engine = new Engine(360);
	}

	public Car(String model, int maxSpeed, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	}

	public Car(String model, int maxSpeed, Engine engine, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.engine = engine;
		this.yearOfManufacture = yearOfManufacture;
	}

	public void gas() {
		//...газ
	}

	public void brake() {
		//...тормоз
	}

	String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	@Override
	public String toString() {
		return model + maxSpeed + engine + yearOfManufacture;
	}
}
