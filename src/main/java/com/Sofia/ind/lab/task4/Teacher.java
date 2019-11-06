package com.Sofia.ind.lab.task4;

public class Teacher {
    String name;
    String lesson;

    public Teacher(String name, String lesson){
        this.name = name;
        this.lesson = lesson;
    }

    @Override
    public String toString(){
        return String.format("%n"+"Teacher's name: " +
                name + "%n"+"Lesson: " +
                lesson);
    }


}
