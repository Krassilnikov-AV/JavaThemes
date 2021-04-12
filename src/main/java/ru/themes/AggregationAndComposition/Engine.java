/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.AggregationAndComposition;

/**
 * Класс Engine
 */
public class Engine {

	private int power;

	public Engine(int power) {
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return String.valueOf(power);
	}
}