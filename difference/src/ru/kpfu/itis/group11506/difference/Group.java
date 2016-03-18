package ru.kpfu.itis.group11506.difference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Group {
	
	//объявление списка;
	private List<Student> students;
	
	//возврат списка;
	public List<Student> getStudents() {
		return students;
	}
	
	//создание списка;
	public Group(List<Student> students) {
		this.students = students;
	}
	
	//вычисление разницы в возрасте между самыми старшим и самым младшим студентами;
	public Date getMaxAgeDifference() {
		students = Arrays.asList(Shell.sort(students.toArray(new Student[students.size()]), new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
		}));
		return students.get(students.size() - 1).getBirthday().subtract(students.get(0).getBirthday());
	}
	
	//вычисление максимальной разницы в баллах;
	public int getMaxPointsDifference() {
		students = Arrays.asList(Shell.sort(students.toArray(new Student[students.size()]), new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getPoints() > o2.getPoints() ? 1 : o1.getPoints() == o2.getPoints() ? 0 : -1;
			}
		}));
		return Math.abs(students.get(students.size() - 1).getPoints() - students.get(0).getPoints());
	}
	
	//вычисление максимальной разницы в длинах имен;
	public int getMaxNameLengthDifference() {
		students = Arrays.asList(Shell.sort(students.toArray(new Student[students.size()]), new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().length() > o2.getName().length() ? 1
						: o1.getName().length() == o2.getName().length() ? 0 : -1;
			}
		}));
		return Math.abs(students.get(students.size() - 1).getName().length() - students.get(0).getName().length());
	}
}
