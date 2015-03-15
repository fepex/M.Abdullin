package ru.kpfu.itis.group403.abdullin.comparator;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        StudentHelper sh = new StudentHelper();
        Student[] array = new Student[15];
        array[0] = new Student(75, 20, "Zac");
        array[1] = new Student(105, 18, "Anna");
        array[2] = new Student(89, 24, "George");
        array[3] = new Student(60, 19, "Klara");
        array[4] = new Student(55, 18, "Bill");
        array[5] = new Student(96,24,"James");
        array[6] = new Student(92,35,"Anna");
        array[7] = new Student(40,18,"Rori");
        array[8] = new Student(79,20,"Alex");
        array[9] = new Student(85,26,"Skyler");
        array[10] = new Student(80,24,"Fibi");
        array[11] = new Student(90,19,"Mike");
        array[12] = new Student(95,17,"Joseph");
        array[13] = new Student(110,25,"Alisha");
        array[14] = new Student(107,24,"Benjamin");

        Arrays.sort(array, sh.getGradeComparator());
        sh.print(array);
        Arrays.sort(array, sh.getYearComparator());
        sh.print(array);
        Arrays.sort(array, sh.getNameComparator());
        sh.print(array);
    }
}
