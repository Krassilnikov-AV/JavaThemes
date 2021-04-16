/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.Collections.Map.HashMap_LinkedHashMap;

import java.util.*;

/**
 * реализация интерфейса Map
 * HashMap - порядок вставки не гарантирует
 * .
 * Важно помнить, что не синхронизирован!!!
 */
public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(5, "a");
		hashmap.put(4, "b");
		hashmap.put(3, "c");
		hashmap.put(2, "d");
		hashmap.put(1, "e");
		System.out.println(hashmap);  // результат {1=e, 2=d, 3=c, 4=b, 5=a} ... почему???
		/**
		 * порядок не гарантируется.
		 * в классе Integer hashCode возвращает Integer, отсюда Integer возвращает сам себя
		 * и HashMap возвращает отсортированный элемент, для того чтобы вывести порядок вставки,
		 * необходимо реализовать
		 * */

		Map<Integer, String> linkedMap = new LinkedHashMap<>();
		linkedMap.put(5, "a");
		linkedMap.put(4, "b");
		linkedMap.put(3, "c");
		linkedMap.put(2, "d");
		linkedMap.put(1, "e");
		System.out.println(linkedMap);  // {5=a, 4=b, 3=c, 2=d, 1=e} ... почему???

		/*
		 * порядок вставки совпал... почему???
		 * заглянем под капот и наблюдаемм следующий конструктор..

		 * ПОРЯДОК ПО ДОСТУПУ Access order - только в Map
		 *
		 * public LinkedHashMap(
		 * *int initialCapacity, // начальный размер,
		 * **float loadFactor, // *фактор загрузки - степень загрузки Map перед тем пока она будет расширена
		 * ***boolean accessOrder  // порядок вставки
		 *
		 *   * если знаем, необходимо ее задавать, умолчание = 16.
		 * Т.к. при увеличении таблицы необходимыо её перехэштровать,
		 * значения распределятся по новому. Поэтому чем больше элементов,
		 * тем трудозатратнее операция по времени. методы hashCod и equals распределяет по
		 * корзинам все назодящиеся элементы, там получается нормальное распределение, которе
		 * зависит от того сколько максимальных элементов можно запихнуть.
		 *
		 *  **т.е. если загрузили на 0,75, то она будет расширяться. можно задавать.
		 *  Если задать больше 1, тоне будет расширяться
		 *  можно настраивать будет выполнение операции.
		 *  *** если true - порядок доступа элемента (от меньшего к большему),
		 *  т.е., полулярные эл-ты вначале, чем меньше обращений тем дальше.
		 *
		 *
		 *
		 * */
		Map<Integer, String> linkedMap1 = new LinkedHashMap(5, 1, true);
		linkedMap1.put(5, "a");
		linkedMap1.put(4, "b");
		linkedMap1.put(3, "c");
		linkedMap1.put(2, "d");
		linkedMap1.put(1, "e");
		linkedMap1.get(3);//.put(5, "a");
		linkedMap1.get(5);
		linkedMap1.get(1);
		System.out.println(linkedMap1);  // {4=b, 2=d, 3=c, 5=a, 1=e} ... почему???
		/*
		 * можно использовать как простейший LRU-контейнер
		 * (например LRU-Cache) удалять эл-ты меньше всех вызываемыхх
		 * демонстрация примера:
		 * */

		Map<Integer, String> simpleLRUCache = new SimpleLRUCache<>(2);  //кэш на 2
		simpleLRUCache.put(1,"a");
		simpleLRUCache.put(2,"b");
		simpleLRUCache.put(3,"c");
		simpleLRUCache.get(2);
		simpleLRUCache.put(9,"h");
		System.out.println(simpleLRUCache);  // {2=b, 9=h}

	}
}