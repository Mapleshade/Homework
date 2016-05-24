package ru.kpfu.itis.group11506.diff;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Diff {

	public void diff(String[] origin, String[] changed, boolean needOut, String outFile)
			throws FileNotFoundException, UnsupportedEncodingException {
		// количество строк в каждом файле
		int M = origin.length;
		int N = changed.length;
		PrintWriter writer = new PrintWriter(outFile + ".diff", "UTF-8");

		// opt[i][j] = длина наибольшей общей подпоследовательности x[i..M] и
		// y[j..N]
		int[][] opt = new int[M + 1][N + 1];

		// вычисляем длину наибольшей общей подпоследовательности
		for (int i = M - 1; i >= 0; i--) {
			for (int j = N - 1; j >= 0; j--) {
				if (origin[i].equals(changed[j]))
					opt[i][j] = opt[i + 1][j + 1] + 1;
				else
					opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);
			}
		}

		// обнуляем i и j, принтуем не совпадающие линии
		int i = 0, j = 0;
		while (i < M && j < N) {
			if (origin[i].equals(changed[j])) {
				i++;
				j++;
			} else if (opt[i + 1][j] >= opt[i][j + 1]) {
				if (needOut) {
					writer.println("< " + (i) + ": " + origin[i++]);
				} else {
					System.out.println("< " + origin[i++]);
				}
			} else {
				if (needOut) {
					writer.println("> " + (j) + ": " + changed[j++]);
				} else {
					System.out.println("> " + changed[j++]);
				}
			}
		}

		// принтуем оставшуюся часть строки если дргуая переполнена
		while (i < M || j < N) {
			if (i == M) {
				if (needOut) {
					writer.println("> " + (j) + ": " + changed[j++]);
				} else {
					System.out.println("> " + changed[j++]);
				}
			} else if (j == N) {
				if (needOut) {
					writer.println("< " + (i) + ": " + origin[i++]);
				} else {
					System.out.println("< " + origin[i++]);
				}
			}

		}
		writer.println("Original size: " + M);
		writer.close();
	}

}