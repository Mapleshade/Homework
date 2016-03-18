package ru.kpfu.itis.group11506.difference;

public class Date implements Comparable<Date> {
	
	//объявление переменных;
	private int year;
	private int month;
	private int day;

	private static boolean yearEnabled;
	private static boolean monthEnabled;
	private static boolean dayEnabled;

	static {
		yearEnabled = true;
		monthEnabled = true;
		dayEnabled = true;
	}

	private Date() {
		this(0, 0, 0);
	}
	
	//конструктор;
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public static void setYearEnabled(boolean yearEnabled) {
		Date.yearEnabled = yearEnabled;
		if (isAllDisabled())
			dayEnabled = true;
	}

	public static void setMonthEnabled(boolean monthEnabled) {
		Date.monthEnabled = monthEnabled;
		if (isAllDisabled())
			dayEnabled = true;
	}

	public static void setDayEnabled(boolean dayEnabled) {
		Date.dayEnabled = dayEnabled;
		if (isAllDisabled())
			dayEnabled = true;
	}

	public static boolean isAllDisabled() {
		return !yearEnabled && !monthEnabled && !dayEnabled;
	}
	
	//сумма дат;
	public Date summary(Date anotherDate) {
		
		//объявление переменной;
		Date result = new Date();
		
		//ее заполнение;
		result.year = this.year + anotherDate.year;
		result.month = this.month + anotherDate.month;
		
		//если месяцкв получилось более 12, то добавляем год и вычитаем месяцы;
		if (result.month > 12) {
			result.year++;
			result.month -= 12;
		}
		
		//сложение дней;
		result.day = this.day + anotherDate.day;
		result.month++;
		
		//если в месяце 30 дней;
		if ((result.month % 2 == 1 && result.month <= 7) || (result.month % 2 == 0 && result.month >= 8)) {
			if (result.day > 31) {
				result.day -= 31;
				if (result.month > 12) {
					result.year++;
					result.month -= 12;
				}
			}
			//если февраль, то дополнительная проверка года на високосность;
		} else if (result.month == 2) {
			result.day -= result.year % 4 == 0 ? 29 : 28;
			result.month++;
			//оставшиеся месяцы;
		} else {
			result.day -= 30;
			result.month++;
		}
		//возвращение суммы дат;
		return result;
	}
	
	//вычитание дат;
	public Date subtract(Date anotherDate) {
		
		//объявление переменной;
		Date result = new Date();
		
		//ее заполнение;
		result.year = anotherDate.year - year;
		result.month = anotherDate.month - month;
		
		//если разница месяцев не больше нуля, то вычитаем год, вычисляем месяц;
		if (result.month <= 0) {
			result.year--;
			result.month = 12 - result.month;
		}
		
		//вычисляем дни;
		result.day = anotherDate.day - day;
		
		//если разница не больше нуля, то вычитаем месяц;
		if (result.day <= 0) {
			result.month--;
			//если месяц не больше нуля, то отнимаем гол и вычисляем мксяц;
			if (result.month <= 0) {
				result.year--;
				result.month = 12 - result.month;
			}
			result.day = (result.month % 2 == 1 && result.month <= 7) || (result.month % 2 == 0 && result.month >= 8)
					? 31 + result.day
					: result.month == 2 ? (result.year % 4 == 0 ? 29 : 28) + result.day : 30 + result.day;
		}
		//возвращаем полученную разницу;
		return result;
	}
	
	//превращение в строку;
	@Override
	public String toString() {
		return day + "." + month + "." + year;
	}
	
	//сравнение;
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Date))
			return false;
		Date date = (Date) o;
		boolean result;
		if (dayEnabled) {
			result = day == date.day;
			if (monthEnabled) {
				result = result && month == date.month;
				if (yearEnabled) {
					result = result && year == date.year;
				}
			}
		} else if (monthEnabled) {
			result = month == date.month;
			if (yearEnabled) {
				result = result && year == date.year;
			}
		} else {
			result = year == date.year;
		}
		return result;
	}

	@Override
	public int hashCode() {
		int result = year;
		result = 31 * result + month;
		result = 31 * result + day;
		return result;
	}

	@Override
	public int compareTo(Date o) {
		if (yearEnabled)
			if (year != o.year)
				return year < o.year ? -1 : 1;
		if (monthEnabled)
			if (month != o.month)
				return month < o.month ? -1 : 1;
		if (dayEnabled)
			if (day != o.day)
				return day < o.day ? -1 : 1;
		return 0;
	}
}
