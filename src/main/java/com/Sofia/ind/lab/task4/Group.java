package com.Sofia.ind.lab.task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Group {
    private Student[] students;//массив студентов

    //передача данных о группе
    public Group(Student[] student){
        this.students = student;
    }

    public void addStudent(Student student){
        students = Arrays.copyOf(students,students.length+1);
        students[students.length] = student;//в последнюю позицию записываем нового студента
    }

    @Override
    public String toString(){
        return Arrays.toString(students);
    }
    public static void main(String[] args) {

        /*
        Student S1 = new Student("Sarah", "App math", 21, 32);
        Student S2 = new Student("Thomas", "App math", 20, 32);

        Group g1 = new Group( new Student[] {S1, S2});//создали группу, в которую поместили студента

        System.out.println(g1);
        */
    }


}
