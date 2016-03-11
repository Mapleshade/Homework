package ru.kpfu.itis.group11506.birthday;

import java.util.function.Consumer;

public class Shell {

	private Date[] array;

	public Date[] getArray() {
		return array;
	}

	public void setArray(Date[] array) {
		this.array = array;
	}

	public Shell(Date[] array) {
		this.array = array;
	}

	public void sort() {
		boolean even = array.length % 2 == 0;
		int distance = even ? array.length / 2 : (array.length - 1) / 2;
		while (distance >= 1) {
			for (int i = 0; even ? (i <= array.length - distance) : (i < array.length - distance); i++) {
				int j = i;
				while (j >= 0 && array[j].compareTo(array[j + distance]) == -1) {
					Date tmp = array[j];
					array[j] = array[j + distance];
					array[j + distance] = tmp;
					j--;
				}
			}
			distance /= 2;
		}
	}

	public void forEach(Consumer<Date> action) {
		for (Date f : array) {
			action.accept(f);
		}
	}
}
