/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.AggregationAndComposition;

/**
 * Класс Sedan
 * В данном случае при наследовании класса Car
 * Что касается поведения, любая машина может газовать и тормозить.
 * Это поведение мы определяем в методах gas() и brake().
 */
public class Sedan extends Car{

	public Sedan(String model, int maxSpeed, Engine engine, int yearOfManufacture) {
		super(model, maxSpeed, engine, yearOfManufacture);
	}

	@Override
	public void gas() {
		System.out.println("Вы нажали на педаль газа автомобиля типа седан");
		System.out.println("you have pressed the gas pedal of a sedan car");
		System.out.println("------------------------------------------");
	}
}