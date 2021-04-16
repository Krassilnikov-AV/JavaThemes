/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.Collections.Map.WeakHashMap;

import javax.xml.crypto.Data;
import java.util.*;

/**
 * WeakHshMap
 * - слабые ключи;
 * - элемент удаляется, когда ключ большене используется (сборщик мусора)
 * - реализация временного хранилища (кеша) ассоциировнных данных
 * <p>
 * Применение:
 * - временное хранилище
 **/
public class ExWeakHshMap {


	public static void main(String[] args) {
		Map<Data, String> map = new WeakHashMap<>();

		Data data = new Data();
		map.put(data, "information");

		data = null;
		System.gc();

		for (int i = 1; i < 10000; i++) {
			if (map.isEmpty()) {
				System.out.println("Empty!");
				break;
			}
		}
	}
}