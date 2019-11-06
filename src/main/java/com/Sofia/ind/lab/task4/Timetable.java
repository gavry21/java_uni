package com.Sofia.ind.lab.task4;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

        public class Timetable {
        private Group[] groups;
        private Teacher[] teachers;
        private String time;
        private String day;

    public Timetable(Group[] group, Teacher[] teacher, String time, String day){
        this.groups = group;
        this.teachers = teacher;
        this.time = time;
        this.day = day;
    }

    public void addGroup(Group group) {
        groups = Arrays.copyOf(groups, groups.length + 1);
        groups[groups.length] = group;
    }

    public void addTeacher(Teacher teacher){
        teachers = Arrays.copyOf(teachers, teachers.length + 1);
        teachers[teachers.length] = teacher;
    }

   @Override

   public String toString(){
        return String.format("%n"+
                Arrays.toString(teachers).replace("[", "").replace("]", "")+
                        "%n"+"Day: " + day +
                        "%n"+"Time: " +
                        time +"%n");
            }


    public static void main(String[] args) {

        Student S1 = new Student("Sarah", "App math", 21, 32);
        Student S2 = new Student("Thomas", "App math", 20, 32);
        Student S3 = new Student("Mark", "App math", 20, 31);
        Student S4 = new Student("Naruto", "App math", 22, 31);

        Group g1 = new Group( new Student[] {S1, S2});//создали группу, в которую поместили студента
        Group g2 = new Group( new Student[] {S3, S4});

        Teacher E1 = new Teacher("Maluhin","App Math");
        Teacher E2 = new Teacher ("Sinica","Web");

        Timetable T1 = new Timetable(new Group[]{g1},new Teacher[]{E1},"11:30","Monday");
        Timetable T2 = new Timetable(new Group[]{g1},new Teacher[]{E2},"13:10", "Monday");

        Timetable T3 = new Timetable(new Group[]{g2},new Teacher[]{E2},"11:30", "Monday");
        Timetable T4 = new Timetable(new Group[]{g2},new Teacher[]{E1},"13:10","Monday");


        System.out.printf("Student:" + S1 + "%n");
        System.out.printf(T1 +"%n" +
                T2);
    }
}
