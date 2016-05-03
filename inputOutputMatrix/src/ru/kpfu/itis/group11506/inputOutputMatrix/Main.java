package ru.kpfu.itis.group11506.inputOutputMatrix;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		String example1 = readFile();
		int[][] example = fromStringToIntArray(example1);
		for (int j = 0; j < example.length; j++) {
			for (int k = 0; k < example[j].length; k++) {
				System.out.print(example[j][k] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] fromStringToIntArray(String code) {

		char[] numbersChar = code.toCharArray();
		int size = 0;
		String number = null;
		int count = 0;
		for (int i = 0; i < numbersChar.length; i++) {
			if (numbersChar[i] == ' ') {
				count++;
			}
		}
		size = (int) Math.ceil(Math.sqrt(count));
		int[][] numbersInt = new int[size][size];

		int n = 0, k = 0, j = 0;
		for (int i = 0; i < numbersChar.length; i++) {
			if (numbersChar[i] == ' ') {
				number = code.substring(j, i);
				j = i + 1;
				try {
					Integer i1 = new Integer(number);
					if (n < size && k < size) {
						numbersInt[n][k] = i1;
						k++;
					}
					if (k == size) {
						n++;
						k = 0;
					}
				} catch (NumberFormatException e) {
					System.err.println("Неверный формат строки!");
				}
			}
		}
		return numbersInt;
	}

	public static String readFile() {
		byte[] buffer = new byte[5000];
		String code = null;
		try (InputStream fis = new BufferedInputStream(
				new FileInputStream(new File("C:/Users/Элина/Desktop/in.bin")))) {
			fis.read(buffer);
			code = new String(buffer);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return code;
	}

}
