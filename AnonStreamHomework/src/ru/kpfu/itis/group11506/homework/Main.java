package ru.kpfu.itis.group11506.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = Arrays.asList(
				new Student("Student1", 18, 502), 
				new Student("Stu", 20, 501),
				new Student("Stud", 19, 504), 
				new Student("Stude", 18, 503));
		
		//первое задание;
		Student older = students.stream().max((p1, p2) -> p1.getAge().compareTo(p2.getAge())).get();
		System.out.println("older: " + older);
		
		//второе задание;
		List<Student> five = students.stream().filter((p) -> p.getName().length() > 5).collect(Collectors.toList());
		System.out.println(five);
		
		//третье задание;
		Map<Object, Object> example = students.stream().distinct().collect(Collectors.toMap((p) -> p.getGroup(), (p) -> p));
		System.out.println(example);
	}

}
