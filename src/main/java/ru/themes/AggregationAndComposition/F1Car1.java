/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.AggregationAndComposition;

/**
 * Класс F1Car1
 * типичный пример к
 */
public class F1Car1 extends Car {
//	private int p;
//	private Engine engine;


	public F1Car1(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
	}

	public F1Car1(String model, int maxSpeed, Engine engine, int yearOfManufacture) {
		super(model, maxSpeed, engine, yearOfManufacture);
	}

	@Override
	public void gas() {
		System.out.println("Вы нажали на педаль газа автомобиля \n" +
			"модель: " + getModel() + "\n максимальная скорость: " + getMaxSpeed() +
			"\n мощность двигателя: " + getEngine() + "\n год изготовления: " + getYearOfManufacture());
		System.out.println("you have pressed the gas pedal of a Cabriolet car");
		System.out.println("------------------------------------------");
	}

	public void pitStop() {
		System.out.println("ТОЛЬКО ДЛЯ ГОНОЧНЫХ АВТО!!! \n ONLY FOR RACING CARS!!!");
		System.out.println("техническая остановка машины во время гонки для выполнения " +
			"заправки топливом, смены шин и т.д.\n technical stop of the car during " +
			"the race to perform refueling, changing tires, etc.\n -----------------------------");

	}


}