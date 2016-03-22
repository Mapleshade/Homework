package ru.kpfu.itis.group11506.exceptions;

import java.util.Scanner;

public class UserFactory {

	public static final int MAX_TRY = 10;

	public static User createUser() throws UserInputException {

		System.out.println("введите имя");
		String inputName = inputUsersInformation(1);

		System.out.println("введите фамилию");
		String inputSurname = inputUsersInformation(1);

		System.out.println("введите адрес");
		String inputAdress = inputUsersInformation(2);

		System.out.println("введите номер телефона");
		String inputNumber = inputUsersInformation(3);

		User user = new User(inputName + " " + inputSurname, inputAdress, inputNumber);
		return user;

	}

	private static String inputUsersInformation(int information) throws UserInputException {
		Scanner scanner = new Scanner(System.in);
		boolean hasInputData = false;
		String inputData = null;
		for (int tryIndex = 0; tryIndex < MAX_TRY && !hasInputData; tryIndex++) {
			try {
				if (information == 1) {
					inputData = enterUserName(scanner);
					hasInputData = true;
				}
				if (information == 2) {
					inputData = enterUserAdress(scanner);
					hasInputData = true;
				}
				if (information == 3) {
					inputData = enterPhoneNumber(scanner);
					hasInputData = true;
				}

			} catch (UserInputException exception) {
				System.err.println("Неправильный ввод данных: " + exception);
			}
		}

		if (inputData == null) {
			throw new UserInputException("превышено количество попыток набора");
		} else {
			return inputData;
		}
	}

	private static boolean checkAdress(String adress) {

		return (adress.contains("г") || adress.contains("п") || adress.contains("с."))
				&& (adress.contains("ул") || adress.contains("улица"))
				&& (adress.contains("д") || adress.contains("дом"));
	}

	// проверка на наличие в строке только букв
	private static Boolean checkStringOnlyLetters(String str) {
		char[] lines = str.toCharArray();
		for (char c : lines) {
			if (!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= 'А' && c <= 'Я' || c >= 'а' && c <= 'я')) {
				return false;
			}
		}
		return true;
	}

	// проверка на наличие в строке только цифр, true если в строке есть не
	// только цифры;
	private static boolean checkStringOnlyNumbers(String str) {
		char[] lines = str.toCharArray();
		for (int i = 0; i < lines.length; i++) {
			if (lines[i] < '0' || lines[i] > '9') {
				return true;
			}
		}
		return false;
	}

	private static String enterPhoneNumber(Scanner scanner) throws UserInputException {

		String userInput = scanner.next();

		if (checkStringOnlyNumbers(userInput)) {
			throw new UserInputException("Неправильные символы телефонного номера");
		}

		int inputSize = userInput.length();
		if (inputSize != 11 && inputSize != 7) {
			throw new UserInputException("Неправильная длина телефонного номера");
		}
		return userInput;
	}

	private static String enterUserName(Scanner scanner) throws UserInputException {
		String userInput = scanner.next();

		if (!checkStringOnlyLetters(userInput)) {
			throw new UserInputException("Использованы неправильные символы");
		}

		int inputSize = userInput.length();
		if (inputSize < 2) {
			throw new UserInputException("Имя должно быть не короче двух букв");
		}
		return userInput;
	}

	private static String enterUserAdress(Scanner scanner) throws UserInputException {
		String userInput = scanner.nextLine();
		if (!checkAdress(userInput)) {
			throw new UserInputException("Неправильный адрес (обязательно укажите г/с/п, улицу, а также дом)");
		}
		return userInput;
	}
}
