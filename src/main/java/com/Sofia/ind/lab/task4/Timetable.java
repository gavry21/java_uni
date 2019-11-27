package com.Sofia.ind.lab.task4;

import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;


        public class Timetable {
            private List<Lesson> lessons;
            //private <Group> groups;

            public Timetable(List<Lesson> lessons) {
                this.lessons = new ArrayList<>(lessons);
               // this.groups = new ArrayList<>(groups);
            }

            public List<Lesson> getLessons() {
                return lessons;
            }

            public List<Lesson> findLesson(Student student) {
                List<Lesson> lessons1 = new ArrayList<>();

                for (Lesson lesson : lessons) {
                    for (Student student1 : lesson.getGroup().getStudents())
                        if (student1.getName().equals(student.getName()))
                            lessons1.add(lesson);

                }
                outPut(lessons1);
                return lessons1;
            }

            public void outPut(List<Lesson> lessons){
                for(Lesson lesson: lessons){
                    System.out.println("\t |" + lesson.getDayOfWeek() + "|");
                    System.out.println("\t --------------------------------");
                    System.out.println("\t " + lesson.getSubject());
                    System.out.println("\t " + lesson.getLocalTime());
                    System.out.println("\t " + lesson.getGroup().getGroupNumber());
                    System.out.println("\t " + lesson.getTeacher().getName() );
                    System.out.println();
                }
            }

        }



