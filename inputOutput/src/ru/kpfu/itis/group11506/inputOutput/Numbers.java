package ru.kpfu.itis.group11506.inputOutput;

public class Numbers {

	public static void main(String[] args) {

		int[] numbers = new int[100];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
			System.out.print(numbers[i] + " ");
		}
		

	}
}
