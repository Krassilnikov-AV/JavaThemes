/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.Interface_AbstractClass;

import java.util.ArrayList;

/**
 * 1. Абстрактный класс - это класс, из которого нельзя создать экземпляр.
 * 2. Единственный способ использования - создание класса потомка.
 * <p>
 * 3. Абстракные классы применяются тогда, когда у родственных классов одна часть методов одинаковые,
 * а другая часть методов отличается. Те методы, которые совпадают - можно реализовать в базовом
 * абстрактном классе, а те, которые отличаются - реализовать в классах потомках.
 * <p>
 * Пример:
 * Фигура - абстрактная сущность, а круг или квадрат конкретная сущность. При рассчёте площади
 * круга и квадрата разные формулы, а цвет фигуры может быть одной и той же функцией.
 * И тогда метод получения цвета фигуры можно вынести в базовый абстрактный класс, а метод получения
 * площади можно вынести в класс потомок.
 * <p>
 * 4. Абстракные классы могут содержать абстрактные методы. Это такие методы, для которых есть только определение,
 * но нет наполнения. Это способ заставить реализовать эти методы в классах потомках.
 * <p>
 * <p>
 * При реализации сначало нужнон создавать интиерфейсы а потом абстракные классы.
 * По причине того, что абстрактый класс, сущность узкая и при создании начинает "связывать руки"
 * !!!!! Создавать абстрактный класс нужно в том случае, если действительно в нем есть необходимость
 */
public class MainClassAbstract {

	public static void main(String[] args) {
		ArrayList<ru.themes.Interface_AbstractClass.ShapeAbstract> shapes = new ArrayList<>();
		ru.themes.Interface_AbstractClass.ShapeAbstract shape = new ru.themes.Interface_AbstractClass.CircleAbstract(1);
		shapes.add(shape);
		shapes.add(new ru.themes.Interface_AbstractClass.RectangleAbstract(1,1));

		printShapes(shapes);
	}

	public static void printShapes(ArrayList<ru.themes.Interface_AbstractClass.ShapeAbstract> shapes) {
		for (ru.themes.Interface_AbstractClass.ShapeAbstract shape :
			shapes) {
			System.out.println("Name: " + shape.getName() + "\n Square: " +
				shape.getSquare() + "\n Color: " + shape.getColor());
		}
	}
}