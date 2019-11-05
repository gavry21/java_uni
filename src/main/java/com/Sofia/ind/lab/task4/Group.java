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

}
