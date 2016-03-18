package ru.kpfu.itis.group11506.difference;

import java.util.Comparator;

public class Shell {
	
	//сортировка дат алгоритмом Шелла;
	public static <T> T[] sort(T[] array, Comparator<T> c) {
		
		//объявление переменных;
		boolean even = array.length % 2 == 0;
		int distance = even ? array.length / 2 : (array.length - 1) / 2;
		
		//сравнение и пеестановка элементов на заданной дистанции;
		while (distance >= 1) {
			for (int i = 0; even ? (i <= array.length - 1 - distance) : (i < array.length - 1 - distance); i++) {
				int j = i;
				while (j >= 0 && c.compare(array[j], (array[j + distance])) == -1) {
					T tmp = array[j];
					array[j] = array[j + distance];
					array[j + distance] = tmp;
					j--;
				}
			}
			//уменьшение дистанции;
			distance /= 2;
		}
		//возвращение отсортированного массива;
		return array;
	}
}
