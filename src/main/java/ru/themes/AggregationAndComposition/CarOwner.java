/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.AggregationAndComposition;

/**
 * Класс CarOwner
 * Ассоциация – это когда один класс включает в себя другой класс в качестве одного из полей.
 * Вданном примере класс CarOwner включает поле  класса Car
 */
public class CarOwner {
	private String name;
	private int age;

	private Car car;

	public CarOwner(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public void drivingCar() {
		System.out.println(name + " управляет автомобилем " + car.getModel() + " \n ему " + age + " лет(года)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return name + age + car;
	}
}