package ru.kpfu.itis.group11506.randomSorter;

public class StupidSort {

	// алгоритм сортировки;
	public static int[] stupidSort(int[] array) {

		// проход по всем элементам массива;
		for (int i = 0; i < array.length; i++) {

			// объявление переменных для выбора случайного элемента массива и
			// сохранения другого элемента;
			int random = (int) (Math.random() * array.length);
			int save = array[i];
			// перестановка местами элементов;
			array[i] = array[random];
			array[random] = save;
		}

		// возврат массива;
		return array;
	}

	// алгоритм проверки;
	public static boolean check(int[] array) {

		// объявление переменных для проверки и подсчета;
		boolean check = false;
		int count = 0;

		// проход по всем элементам массива;
		for (int i = 0; i < array.length - 1; i++) {

			// проверка на то, чтобы последующий элемент был больше текущего и
			// подсчет в случае такового;
			if (array[i + 1] > array[i]) {
				count = count + 1;
			}

		}

		// если счетчик совпадает с количеством элементов, то возвращаем true;
		if (count == array.length - 1) {
			check = true;
		}

		// возвращаем результат проверки;
		return check;

	}

	// алгоритм вывода;
	public static void show(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}