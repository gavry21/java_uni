package com.Sofia.ind.lab.task4;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

        public class Timetable {
        private Group[] groups;
        private String lesson;
        private String time;
        private String day;
        private Lessons[] lessons;


    public Timetable(Group[] group, String lesson, String time, String day){
        this.groups = group;
        this.lesson = lesson;
        this.time = time;
        this.day = day;
    }

    public void addGroup(Group group) {
        groups = Arrays.copyOf(groups, groups.length + 1);
        groups[groups.length] = group;
    }

    @Override

            public String toString(){
                return String.format("%n"+"Day: " + day +
                        "%n"+"Lesson: " +
                        lesson + "%n"+"Time: " +
                        time +"%n");
            }

    public static void main(String[] args) {

        Student S1 = new Student("Sarah", "App math", 21, 32);
        Student S2 = new Student("Thomas", "App math", 20, 32);
        Student S3 = new Student("Mark", "App math", 20, 31);
        Student S4 = new Student("Naruto", "App math", 22, 31);

        Group g1 = new Group( new Student[] {S1, S2});//создали группу, в которую поместили студента
        Group g2 = new Group( new Student[] {S3, S4});

        Timetable T1 = new Timetable(new Group[]{g1},"Java","11:30","Monday");
        Timetable T2 = new Timetable(new Group[]{g1},"C++","13:10", "Monday");

        Timetable T3 = new Timetable(new Group[]{g1},"C++","11:30", "Monday");
        Timetable T4 = new Timetable(new Group[]{g1},"Oracle","13:10","Monday");



        System.out.printf("Student:" + S1 + "%n");
        System.out.printf(T1 +"%n" +
                T2);
    }




}
