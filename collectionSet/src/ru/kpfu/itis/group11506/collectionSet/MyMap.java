package ru.kpfu.itis.group11506.collectionSet;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> implements Map<K, V> {

	private Node<K, V>[] map;
	private int defaultSize = 100;
	private int size;

	public MyMap() {
		size = defaultSize;
	}

	public MyMap(int size) {
		this.size = size;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.size(); i++) {
			map[i] = null;
		}
	}

	@Override
	public boolean containsKey(Object key) {
		for (Node<K, V> mapa : map) {
			if (indexFor(mapa.hashCode(), size) == indexFor(key.hashCode(), size)) {
				if ((mapa).getKey() == key) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		for (int i = 0; i < size; i++) {
			if (map[i] != null) {
				for (Node<K, V> mapa : map) {
					if ((mapa).getValue() == value) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		return null;
	}

	@Override
	public V get(Object key) {
		for (Node<K, V> mapa : map) {
			if (indexFor(mapa.hashCode(), size) == indexFor(key.hashCode(), size)) {
				if ((mapa).getKey() == key) {
					return mapa.getValue();
				}
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Set<K> keySet() {
		return null;
	}

	public int indexFor(int hash, int mapSize) {
		return hash = hash % mapSize;
	}

	@Override
	public V put(K key, V value) {
		if (key == null) {
			map[0] = new Node<>(null, value);
			return map[0].getValue();
		}

		int hash = key.hashCode();
		int i = indexFor(hash, size);
		for (Node<K, V> e = map[i]; e != null; e = e.getNextNode()) {
			Object k;
			if (e.hashCode() == hash && ((k = e.getKey()) == key || key.equals(k))) {
				V oldValue = e.getValue();
				e.setValue(value);
				return oldValue;
			}
		}
		map[i] = new Node<K, V>(key, value);
		return null;

	}

	@Override
	public void putAll(Map<? extends K, ? extends V> arg0) {

	}

	@Override
	public V remove(Object key) {
		V value = null;
		if (this.containsKey(key)) {
			for (Node<K, V> mapa : map) {
				if (mapa.getKey() == key) {
					value = mapa.getValue();
					mapa.setValue(null);
					size -= 1;
				}
			}
		}
		return value;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Collection<V> values() {
		return null;
	}

}
