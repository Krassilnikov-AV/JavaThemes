/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.Interface_AbstractClass;

/**
 * Все хорошо, только вот цвет имеет одинаковую часть можно оставить интеррфейс, но
 * получается дублирование в коде, то лучше это вынести в общую сущность, в абстракный класс
 */
public class Rectangle implements Shape{
	private double height;
	private double width;
	private String color;

	public Rectangle(double height, double width, String color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

	@Override
	public double getSquare() {
		return height*width;
	}

	@Override
	public String getColor() {
		return color;
	}
}