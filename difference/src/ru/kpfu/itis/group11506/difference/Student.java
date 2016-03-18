package ru.kpfu.itis.group11506.difference;

public class Student {
	
	//объявление переменных;
    private Date birthday;
    private int points;
    private String name;
    
    //конструктор;
    public Student(Date birthday, int points, String name) {
        this.birthday = birthday;
        this.points = points;
        this.name = name;
    }
    
    //возврашение даты рождения;
    public Date getBirthday() {
        return birthday;
    }
    
    //возвращение имени;
    public String getName() {
        return name;
    }
    
    //возвращение баллов;
    public int getPoints() {
        return points;
    }
    
    //присвоение баллов;
    public void setPoints(int points) {
        this.points = points;
    }
    
    //преобразование в строку;
    @Override
    public String toString() {
        return "birthday = " + birthday +
                ", points = " + points +
                ", name = " + name;
    }
}
