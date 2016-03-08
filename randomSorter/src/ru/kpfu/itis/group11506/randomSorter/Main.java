/*
 * Homework;
 * StupidSorter;
 * Gazizova Elina 11-506;
*/
package ru.kpfu.itis.group11506.randomSorter;

public class Main {

	public static void main(String[] args) {

		// объявление исходного массива и переменной для подсчета количества
		// попыток;
		int[] array = { 1, 2, 4, 7, 3, 9, 8, 0, 6, 5 };
		int attemt = 0;

		// вывод исходного массива;
		System.out.print("start ");
		StupidSort.show(array);
		System.out.println();

		// засечение старта таймера;
		long start = System.nanoTime();

		// рандомная сортировка и подсчет попыток;
		while (!StupidSort.check(array)) {
			StupidSort.stupidSort(array);
			attemt = attemt + 1;
		}

		// засечение конца таймера и подсчет времени непосредственно работы
		// метода;
		long end = System.nanoTime();
		long traceTime = end - start;

		// вывод количества попыток, времени и полученного массива;
		System.out.println("attemt " + attemt);
		System.out.println("time in nanoseconds = " + traceTime);
		System.out.print("finish ");
		StupidSort.show(array);
	}

}
