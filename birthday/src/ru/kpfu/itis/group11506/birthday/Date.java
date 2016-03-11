package ru.kpfu.itis.group11506.birthday;

public class Date implements Comparable<Date> {

	private int year;
	private int month;
	private int day;
	private String name;

	private static boolean yearEnabled;
	private static boolean monthEnabled;
	private static boolean dayEnabled;

	static {
		yearEnabled = true;
		monthEnabled = true;
		dayEnabled = true;
	}

	public Date(Group name, int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.name = name.toString();
	}

	public void setYearEnabled(boolean yearEnabled) {
		Date.yearEnabled = yearEnabled;
		if (isAllDisabled())
			dayEnabled = true;
	}

	public void setMonthEnabled(boolean monthEnabled) {
		Date.monthEnabled = monthEnabled;
		if (isAllDisabled())
			dayEnabled = true;
	}

	public void setDayEnabled(boolean dayEnabled) {
		Date.dayEnabled = dayEnabled;
		if (isAllDisabled())
			dayEnabled = true;
	}

	public boolean isAllDisabled() {
		return !yearEnabled && !monthEnabled && !dayEnabled;
	}

	@Override
	public String toString() {
		return name + " " + day + "." + month + "." + year;
	}

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
	
	public String getName() {
		return name;
	}
}