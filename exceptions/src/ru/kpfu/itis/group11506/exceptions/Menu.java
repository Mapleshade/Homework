package ru.kpfu.itis.group11506.exceptions;

public class Menu {

	public static final String[] MENU = new String[] { "Спагетти", "Пицца Маргарита", "Лазанья", "Пицца Четыре Сыра",
			"Картофель Фри", "Чизкейк Классический", "Тирамису", "Фруктовый чай", "Пломбир", "Капучино", "Кока-Кола",
			"Шаверма Мстителей", "Салат Довакина", "Гляссе", "Черный чай" };

	public void showMenu() {

		for (int i = 0; i < MENU.length; i++) {
			System.out.println("№" + (i + 1) + " " + MENU[i]);
		}
	}

	public static String getFood(int index) throws UserInputException {
		if (index <= 0 || index > MENU.length) {
			throw new UserInputException("неверный номер");
		} else {
			return MENU[index - 1];
		}

	}

	private static boolean checkYesNo(String answer) {
		return (answer.contains("да") || answer.contains("нет"));
	}

	public static boolean checkAnswer(String answer) throws UserInputException {

		if (!checkYesNo(answer)) {
			throw new UserInputException("Использованы неправильные символы");
		}

		if (answer.contains("да")) {
			return true;
		} else {
			return false;
		}

	}

	public static int[] saveAnswers(int[] arr, int nextAnswer) {
		int[] saves = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			saves[i] = arr[i];
		}
		saves[saves.length - 1] = nextAnswer;
		return saves;
	}

	public static void showsOrder(int[] arr, User user, String cash) throws UserInputException {
		System.out.println("Ваш заказ: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(getFood(arr[i]));
		}
		System.out.println("Ваши данные: ");
		System.out.println("Ваше имя: " + user.getName());
		System.out.println("Ваш адрес : " + user.getAdress());
		System.out.println("Ваш телефон : " + user.getPhoneNumber());

		if (cash.contains("наличными")) {
			System.out.println("Оплата на месте");
		} else {
			System.out.println("номер вашей карты: " + user.getCard());
		}
	}
}