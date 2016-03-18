/*
 * Домашнее задание 18.03.16;
 * 
 * №1 разница в возрасте между самым старшим и младшим студентами;
 * №2 максимальная разница в баллах;
 * №3 максимальная разница в длинах имен;
 * 
 * Газизова Элина 11-506;
 */
package ru.kpfu.itis.group11506.difference;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	static Random random = new Random();

	public static void main(String[] args) {
		
		//объявление переменных;
		List<Student> students = new ArrayList<>();
		int month;
		int year;
		Student student;
		
		//создание случайной группы студентов;
		for (int i = 0; i < 15 + random.nextInt(16); i++) {
			year = (random.nextInt() % 2 == 0 ? 18 : 19) + 1996;
			month = random.nextInt(13);
			student = new Student(
					new Date(year, month,
							(month % 2 == 1 && month <= 7) || (month % 2 == 0 && month >= 8) ? 1 + random.nextInt(31)
									: month == 2 ? 1 + random.nextInt(year % 4 == 0 ? 29 : 28)
											: 1 + random.nextInt(30)),
					random.nextInt(51), generateName(10 + random.nextInt(16)));
			students.add(student);
			//вывод данных студента;
			System.out.println(student.toString());
		}
		
		//создание самой группы;
		Group group = new Group(students);
		
		//выполнение заданий;
		System.out.println();
		//разница в возрвсте;
		System.out.println("Max age difference: " + group.getMaxAgeDifference());
		//разница в баллах;
		System.out.println("Max points difference: " + group.getMaxPointsDifference());
		//разница в длинах имен;
		System.out.println("Max name length difference: " + group.getMaxNameLengthDifference());
	}
	
	//генератор "имен";
	private static String generateName(int length) {
		char[] chars = new char[length];
		while (length > 0) {
			chars[length - 1] = (char) ('A' + random.nextInt('z' - 'A'));
			length--;
		}
		return new String(chars);
	}
}
