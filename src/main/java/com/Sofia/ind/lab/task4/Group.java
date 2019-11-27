package com.Sofia.ind.lab.task4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
     private List<Student> students;//массив студентов
     private int groupNumber;
     private int id;

    public Group(int id, List<Student> students, int groupNumber) {
        this.students = new ArrayList<>(students);
        this.groupNumber = groupNumber;
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getId() {
        return id;
    }
}


