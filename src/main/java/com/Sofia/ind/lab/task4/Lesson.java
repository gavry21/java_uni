package com.Sofia.ind.lab.task4;

import javax.security.auth.Subject;
import java.time.DayOfWeek;
import java.time.LocalTime;

public class Lesson {
    private LocalTime localTime;
    private Group[] group;
    private Subject subject;
    private Teacher teacher;
    private DayOfWeek dayOfWeek;
    private int number;

    //передача данных о занятиях
    public Lesson(Subject subject, DayOfWeek dayOfWeek, LocalTime localTime,
                  Group[] group, Teacher teacher, int number){
        this.localTime = localTime;
        this.dayOfWeek = dayOfWeek;
        this.group = group;
        this.subject = subject;
        this.teacher = teacher;
        this.number = number;
    }

    //get
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Group[] getGroup() {
        return group;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public int getNumber() {
        return number;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getEducator() {
        return teacher;
    }

    //предметы
    public enum Subject {
        Java,
        Web,
        Delphi,
        Oracle,
        Clojure,
        Prolog
    }
}
