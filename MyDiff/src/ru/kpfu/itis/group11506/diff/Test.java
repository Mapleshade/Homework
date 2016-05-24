package ru.kpfu.itis.group11506.diff;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Test {
	// Аргументы командной строки.
	// java Main PATH1/in.bin PATH2/inin.bin -out outFileName
	// -create - создание патча
	// -apply применить патч
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		// создаем необходимые переменные;
		StringToArr stringToArr = new StringToArr();
		Diff diff = new Diff();
		UploadFile uploadFile = new UploadFile();

		// имя diffфайла по умолчанию;
		String outFile = "out";

		// пути к файлам по умолчанию;
		String origin = "C:/Users/Элина/Desktop/text1.txt";
		String changed = "C:/Users/Элина/Desktop/text2.txt";

		// необходимость создания diffфайла(по умолчанию не надо);
		boolean out = true;

		// если аргументы заданы с командной строки;
		if (args.length != 0) {

			try {

				// записываем новые пути;
				origin = args[0];
				changed = args[1];

				// еслу нужно, меняем имя diffфайла;
				if (args.length > 3) {
					outFile = args[3];
				}

				// создание патча;
				if (args.length > 2 && args[2].equals("-create")) {

					// необходимо создать патч;
					out = true;

					// вызывание соответсвующих методов;
					diff.diff(stringToArr.fromStringToArr(stringToArr.readFile(origin)),
							stringToArr.fromStringToArr(stringToArr.readFile(changed)), out, outFile);
				}

				// применение патча;
				if (args.length > 2 && args[2].equals("-apply")) {
					String[] myDiff = stringToArr.fromStringToArr(stringToArr.readFile(args[0]));
					uploadFile.uploadFile(myDiff, stringToArr.fromStringToArr(stringToArr.readFile(args[1])), args[1]);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// если нет аргументов командной строки, то по умолчанию считываются два
		// файла, создается патч и обновляется второй файл;
		try {
			diff.diff(stringToArr.fromStringToArr(stringToArr.readFile(origin)),
					stringToArr.fromStringToArr(stringToArr.readFile(changed)), out, outFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String[] myDiff = stringToArr
				.fromStringToArr(stringToArr.readFile("C:/Users/Элина/Desktop/Java/2 семестр/MyDiff/out.diff"));
		uploadFile.uploadFile(myDiff, stringToArr.fromStringToArr(stringToArr.readFile(changed)), changed);
	}
}
