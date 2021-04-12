/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.Interface_AbstractClass;

/**
 * Класс RectangleAbstract
 */
public class RectangleAbstract extends ru.themes.Interface_AbstractClass.ShapeAbstract {
	private double height;
	private double width;

	public RectangleAbstract(double height, double width) {
		super("Blue");
		this.height = height;
		this.width = width;
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

	@Override
	public double getSquare() {
		return height*width;
	}

}