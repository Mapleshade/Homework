package ru.kpfu.itis.group11506.inputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		String example = readFile();
		writeFile(example);
	}
	
	public static void writeFile(String code) {
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("C:/Users/Элина/Desktop/out.bin")))) {
			bos.write(code.getBytes());
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	public static String transformation(String code) {
		char[] numbers = code.toCharArray();
		String number = null;
		String save = null;
		int j = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == ' ') {
				number = code.substring(j, i);
				j = i + 1;
				// System.out.print(number);
				try {
					Integer i1 = new Integer(number);
					System.out.println(i1);
					if (i1 % 2 == 1) {
						if (save == null) {
							save = i1 + " ";
						} else {
							save = save + i1 + " ";
						}
					}
				} catch (NumberFormatException e) {
					System.err.println("Неверный формат строки!");
				}

			}
		}
		System.out.println(save);
		return save;
	}

	public static String readFile() {
		byte[] buffer = new byte[5000];
		String code1 = null;
		try (InputStream fis = new BufferedInputStream(
				new FileInputStream(new File("C:/Users/Элина/Desktop/in.bin")))) {
			fis.read(buffer);
			String code = new String(buffer);
			code1 = transformation(code);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return code1;
	}
}
