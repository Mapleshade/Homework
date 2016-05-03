package ru.kpfu.itis.group11506.homework;

public class Student {
	private String name;
	private Integer age;
	private int group;

	public Student(String name, Integer age, int group) {
		this.name = name;
		this.age = age;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public int getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "name = " + name + ", age = " + age + ", group = " + group;
	}

}
