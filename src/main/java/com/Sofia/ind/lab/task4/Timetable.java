package com.Sofia.ind.lab.task4;

import javax.xml.crypto.Data;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.application.Application;


        public class Timetable extends Creater {
                private int choose;
                private String name;
                private ArrayList<Lesson> timeTableStudent = new ArrayList<>();
                private ArrayList<Lesson> timeTableTeacher = new ArrayList<>();

                public ArrayList<Lesson> getTimetableStudent(){
                    return timeTableStudent;}
                public ArrayList<Lesson> getTimetableEducator(){
                    return timeTableTeacher;}

                public Timetable(int choose, String name) {
                    this.choose = choose;
                    this.name = name;
                    getTimetable();
                }


            private void getTimetable() {
                Creater creater = new Creater();
                creater.createLesson();

                creater.addStudent(42, new Student(createID(), "София", "КИТ"));
                creater.addStudent(42, new Student(createID(), "Динара", "КИТ"));
                creater.addStudent(42, new Student(createID(), "Хиеу", "КИТ"));

                creater.addStudent(41, new Student(createID(), "Дарья", "КПМ"));
                creater.addStudent(41, new Student(createID(), "Ирина", "КИТ"));

                if (choose == 1){
                    Group groupStudent = find(creater.getGroups(), name);
                    DayOfWeek dayOfWeek = null;
                    for (Lesson lesson : creater.getLessons()) {
                        if (dayOfWeek != lesson.getDayOfWeek()) System.out.println(lesson.getDayOfWeek() + "----");
                        dayOfWeek = lesson.getDayOfWeek();
                        if (Arrays.stream(lesson.getGroup()).anyMatch(group1 -> group1 == groupStudent)) {
                            LocalTime endLesson = lesson.getLocalTime().plusHours(1).plusMinutes(30);
                            timeTableStudent.add(lesson);
                            System.out.println("\t" + lesson.getNumber() + " ) " + lesson.getLocalTime() + " - " + endLesson);
                            System.out.println("\t\t" + lesson.getSubject() + "\n");
                        }
                    }
                }
                if (choose == 2){

                    for (Lesson lesson : creater.getLessons())
                        if (name.equals(lesson.getEducator().getName())) {
                            timeTableTeacher.add(lesson);
                        }
                    System.out.println("\nEducator : "+name);
                    for (Lesson lesson : timeTableTeacher){
                        System.out.println(lesson.getDayOfWeek());
                        System.out.println("\tNumber Lesson : " + lesson.getNumber());
                        System.out.println("\tName Lesson : " + lesson.getSubject());
                        System.out.print("\tNumber Group : ");
                        for (Group group : lesson.getGroup()) System.out.print(group.groupNumber + " ");
                        System.out.println("\n"); }
                }
            }

            private Group find(Group[] groups, String name) {
                for (Group group : groups)
                    for(Student student : group.students)
                        if (student.getName().equals(name)) return group;
                return null;
            }

            public static void main(String[] args) {
                Timetable timeTable = new Timetable(1,"Дарья");
            }
            }


