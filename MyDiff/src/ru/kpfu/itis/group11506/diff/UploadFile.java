package ru.kpfu.itis.group11506.diff;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UploadFile {

	/**
	 * изъятие из строки diffфайла номера строки, в которой произошло изменение;
	 * 
	 * @param diffFile
	 * @param begin
	 * @return
	 */
	private int getIndexOfString(String[] diffFile, int begin) {
		//проверка, остались ли еще строки с изменениями;
		if (begin > (diffFile.length - 1) / 2) {
			return -1;
		}
		// переменная, куда запишем индекс строки с изменениями;
		int index = 0;

		// преобразовываем строку diffфайла в массив чаров;
		char[] oneStringOfDiffFile = diffFile[begin].toCharArray();

		// переменная для нахождения конца индекса строки;
		int j = 0;

		// индекс строки с изменение находится между определенными символами на
		// опреденной позиции в строке;
		if (oneStringOfDiffFile[0] == '<' && oneStringOfDiffFile[1] == ' ') {
			// находим конец индекса;
			while (oneStringOfDiffFile[j] != ':') {
				j++;
			}
			// пытаемся сохранить индекс;
			try {
				String number = diffFile[begin].substring(2, j);
				index = new Integer(number);
			} catch (NumberFormatException e) {
				System.err.println("Неверный формат строки!1");
			}
		}
		// возвращаем индекс;
		return index;
	}

	/**
	 * Обновление файла
	 * 
	 * @param diffFile
	 * @param needUploadFile
	 * @throws UnsupportedEncodingException
	 * @throws FileNotFoundException
	 */
	public void uploadFile(String[] diffFile, String[] needUploadFile, String pathToFile)
			throws FileNotFoundException, UnsupportedEncodingException {

		// сначала добываем размер файла, он записан в последней строчке diff
		// файла;
		// переводим последнюю строку в массив чаров;
		char[] lastStringOfDiffFile = diffFile[diffFile.length - 1].toCharArray();

		// заготавливаем переменную для записи размера;
		int size = 4;

		// пробегаем по массиву в поиске опозновательного символа двоеточия с
		// пробелом, после которых росположено количество строк в коде;
		//int i = 1;
		//while (!(lastStringOfDiffFile[i - 1] == '>' && lastStringOfDiffFile[i] == ' ')) {
		//	i++;
		//}
		//int j =0;
		//while (lastStringOfDiffFile[j] != ':') {
		//	j++;
		//}
		// пытаемся извлечь это число;
		//try {
		//	String number = diffFile[diffFile.length - 1].substring(i + 1,j);
		//	size = new Integer(number);
		//} catch (NumberFormatException e) {
		//	System.err.println("Неверный формат строки!");
		//}

		// создаем новый массив строк, куда перезапишем файл;
		// String[] newFile = new String[size];

		// переменная для определения номера строки в diffфайле;
		int diffNumber = 0;

		// объявление переменной, куда записывается номер строки, в которой
		// произошло изменение, из diffФайла;
		int indexOfDiff = getIndexOfString(diffFile, diffNumber);

		// номер строки diffфайла;
		int index = 0;

		PrintWriter writer = new PrintWriter(pathToFile, "UTF-8");
		// копируем файл, до тех пор, пока не встретим строку с индексом,
		// совпадающим с indexOfDiff (то есть строку, где произошло изменение);
		for (int indexOfString = 0; indexOfString < size; indexOfString++) {

			// если индексы не совпали, то копируем строку;
			if (indexOfString != indexOfDiff) {
				writer.println(needUploadFile[indexOfString]);
			} else {
				// если совпали, то копируем строку из diffфайла, вычисляем
				// новый индекс строки, в которой произошло изменение и делаем
				// шаг на новую строку в diffфайле;
				writer.println(diffFile[index]);
				indexOfDiff = getIndexOfString(diffFile, ++diffNumber);
				index++;
			}
		}
		writer.close();
	}
}
