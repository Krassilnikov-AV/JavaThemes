/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.AggregationAndComposition;

/**
 * Ассоциация – это когда один класс включает в себя другой класс в качестве одного из полей.
 * Ассоциация описывается словом «имеет».
 * Автомобиль имеет двигатель. Вполне естественно,
 * что он не будет являться наследником двигателя (хотя такая архитектура тоже возможна в некоторых ситуациях).
 * <p>
 * Выделяют два частных случая ассоциации: композицию и агрегацию.
 * <p>
 * Композиция – это когда двигатель не существует отдельно от автомобиля. Он создается при создании автомобиля и
 * полностью управляется автомобилем.
 * В данном примере, экземпляр двигателя car будут создаваться в конструкторе автомобиля - это и будет являться
 * композицией.
 * В данном примере так же, экземпляры двигателей engineFerrari engineZil не будут создаваться в конструкторе
 * автомобиля - это будет агрегация.
 * Так же класс владельца авто можно рассмотреть как агрегацию
 * Это и есть пример агрегации.
 * При композиции связь между объектами жёсткая, т.е. время жизненного цикла, вхожящего объекта совпадает с временем
 * жизни родительского объекта
 * <p>
 * В примере применено наследование. вызываемого объекта класса потомка будет зависит от класса родителя (пример вызова
 * экземпляра класса Truck)
 * Особенности наследования:
 * - вызов экземпляров класса наследника через класс родитель;
 * - можно переопределять методы класса родителя или не переопределять;
 * - создавать свои методы класса, расширяя функционал класса родителя
 */
public class MainClass {

	public static void main(String[] args) {
		// создание экземпляров класса двигатель, для разных авто,
		// которые устанавляваются в автомобиль (типичный пример композиции)
		Engine engineFerrari = new Engine(800);

		Engine engineZil = new Engine(350);
		Car truck = new Truck("Зил", 110, engineZil, 1981);
		truck.gas();
/**
 * Создание и вызов методом объекта класса F1Car1
 * */
		Car car = new Car();
		System.out.println("Мощность автомобиля составляет: " + car.getEngine()
			+ "л/с \n ----------------------------------------------------------");
		F1Car1 formula1Car = new F1Car1("Ferrari", 320, engineFerrari, 1975);

		formula1Car.gas();
		formula1Car.pitStop();    // если создадим экземпляр класса Car, то данный метод не вызовется!
		formula1Car.brake();
/**
 * Создание экземпляра класса автовладельца и вызов метода управления автомобилем, который уже имеется
 * */
		CarOwner carOwner = new CarOwner("Александр", 35, truck);
		carOwner.drivingCar();
	}
}