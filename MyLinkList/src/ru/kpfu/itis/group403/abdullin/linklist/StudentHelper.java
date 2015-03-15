package ru.kpfu.itis.group403.abdullin.linklist;

import java.util.Comparator;

public class StudentHelper {

    private class Grade implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            if (o1.grade == o2.grade) return 0;
            else if (o1.grade > o2.grade) return 1;
            else return -1;
        }
    }

    public Comparator getGradeComparator() {
        return new Grade();
    }

    private class Year implements Comparator<Student> {
        public int compare(Student o1, Student o2) {

            if (o1.year == o2.year) return 0;
            else if (o1.year > o2.year) return 1;
            else return -1;

        }

    }

    public Comparator getYearComparator() {
        return new Year();
    }

    public class Name implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {

            return o1.getName().compareToIgnoreCase(o2.getName());

        }

    }
    public Comparator getNameComparator() {
        return new Name();
    }

    public void print(Student[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println("Name " + array[i].getName() + "; Grade: " + array[i].getGrade() + "; Year: " + array[i].getYear());
        }
    }
}
