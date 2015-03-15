package ru.kpfu.itis.group403.abdullin.comparator;

public class Student {
    int grade;
    int year;
    String name;

    public Student(int grade, int year, String name) {
        this.grade = grade;
        this.year = year;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getGrade() {
        return grade;
    }

    public int getYear() {
        return year;
    }

//    public void print(Student[] array){
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Name " + array[i].getName() + "Grade: " + array[i].getGrade() + "Year: " + array[i].getYear());
//        }
//    }
}
