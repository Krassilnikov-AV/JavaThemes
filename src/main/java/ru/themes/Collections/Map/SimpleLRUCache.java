/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.themes.Collections.Map;

import java.util.*;

/**
 * в данном примере ни когда не будет коллизии
 * потому что в супер классе capacity + 1, т.е. если зададим 10, то
 * в супер классе задастся 11. как только добавится 11-ый эл-т,
 * то каждый раз будет вызываться метод removeEldestEntry
 */
public class SimpleLRUCache<K, V> extends LinkedHashMap<K, V> {
	private final int capacity;

	public SimpleLRUCache(int capacity) {
		//
		//1.1f -чтоб не росла
		super(capacity + 1, 1.1f, true);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return this.size() > capacity;
	}
}