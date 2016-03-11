package ru.kpfu.itis.group11506.birthday;

public class Main {
	
	public static void main(String[] args) {
		Shell shell = new Shell(new Date[]{
		new Date(Group.ГазизоваЭлина,1997,8,6),
		new Date(Group.БиктимировАзат,1996,2,6),
		new Date(Group.ПавловЕгор,1996,5,25),
		new Date(Group.СергеевАртем,1997,3,16),
		new Date(Group.ХайруллинБулат,1997,4,27)
		});
		shell.forEach((f) -> System.out.print(f+" "));
		shell.sort();
		System.out.println();
		shell.forEach((f) -> System.out.print(f+" "));
		}
		

}
