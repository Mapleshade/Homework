package ru.kpfu.itis.group11506.diff;

import java.io.*;

public class StringToArr {

	public String readFile(String FilePath) {
		String code = "";
		char[] buffer = null;

		File f = new File(FilePath);
		try (FileReader reader = new FileReader(f)) {
			buffer = new char[(int) f.length()];
			// считаем файл полностью
			reader.read(buffer);
			System.out.println(new String(buffer));
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
		return new String(buffer);
	}

	/**
	 * преобразование исходного текста в массив строк;
	 *
	 * @param text
	 * @return
	 */
	public String[] fromStringToArr(String text) {

		// преобраование текста в массив чаров;
		char[] sourceText = text.toCharArray();
		// объявление переменной для вычисления размера нужного нам массива;
		int size = 0;
		// строка для сохранения отдельных строчек иходного текста;
		String save = null;

		// подсчет количества строк в исходном тексте через подсчет количества
		// переходов на следующую строку;
		for (int i = 0; i < sourceText.length; i++) {
			if (sourceText[i] == '\n') {
				size++;
			}
		}

		if (sourceText[sourceText.length - 1] != '\n') {
			size++;
		}

		// объявление нового и нужного нам массива строк с заданной
		// размерностью;
		String[] textArr = new String[size];

		// две переменные для извлечения строк и заполнения массива textArr, j
		// для извлечения и k для заполнения;
		int j = 0, k = 0;

		// пробегаем по всему тексту;
		for (int i = 0; i < sourceText.length; i++) {

			// если встечаем переход на следующую строку, то извлекаем всю
			// строку до этого момента;
			if (sourceText[i] == '\n') {

				save = text.substring(j, i - 1);

				// увеличиваем j (так как с индексом i сейчас символ перехода,
				// то следующая строка начнется со следующего, то есть с i + 1);
				j = i + 1;

				if (save != null) {
					// записываем сохраненную строку в массив;
					textArr[k] = save;
					// делаем шаг в массиве;ы
					k++;
				}
			}
		}
		if (sourceText[sourceText.length - 1] != '\n') {
			save = text.substring(j, sourceText.length - 1);
			textArr[textArr.length - 1] = save;
		}
		// возвращаем нужный массив строк;
		return textArr;
	}
}
