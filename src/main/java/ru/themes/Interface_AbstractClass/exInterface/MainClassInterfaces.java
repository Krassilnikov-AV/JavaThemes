/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.Interface_AbstractClass.exInterface;

import ru.themes.Interface_AbstractClass.Shape;

import java.util.ArrayList;

/**
 * 1. Интерфейсы похожи на абстрактные классы, но определяются ключевым словом exInterface,
 * вместо abstract class.
 * <p>
 * 2. Одно из главных отличий интерфейса от абстрактного класса в том,
 * что в интерфейсе методы только определяются, но не может быть ни какой реализации.
 * <p>
 * 3. Второе главное отличие - при наследовании родительский класс может быть только один.
 * А родительских интерфейсов сколько угодно.
 * <p>
 * 4. Смысл интерфейсов в создании иерархии или набора классов, которые объединены общим смыслом
 * и набором методов, с различной реализацией.
 * <p>
 * При реализации сначало нужнон создавать интиерфейсы а потом абстракные классы.
 * По причине того, что абстрактый класс, сущность узкая и при создании начинает "связывать руки"
 * <p>
 * !!!!! Создавать абстрактный класс нужно в том случае, если действительно в нем есть необходимость
 */

/*
пример проектирования сверху, он тем хорошо, что определив метод printShapes,
 он не будет меняться в зависимости какие фигуры мы еще определим, можно добавить еще
 несколько фигур, но сам метод меняться не будет, Здорово!!!
 */
public class MainClassInterfaces {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		Shape shape = new ru.themes.Interface_AbstractClass.Circle(1, "Red");
		shapes.add(shape);
		shapes.add(new ru.themes.Interface_AbstractClass.Rectangle(1,1,"Blue"));

		printShapes(shapes);
	}

	public static void printShapes(ArrayList<ru.themes.Interface_AbstractClass.Shape> shapes) {
		for (ru.themes.Interface_AbstractClass.Shape shape :
			shapes) {
			System.out.println("Name: " + shape.getName() + "\n Square: " +
				shape.getSquare() + "\n Color: " + shape.getColor());
		}
	}
}