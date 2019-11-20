package com.Sofia.ind.lab.task4;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

class Creater {
    private Group[] groups = new Group[0];
    private int idCounter = 0;
    private Lesson[] lessons;

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    int createID() {
        return idCounter++;
    }

    Lesson[] getLessons() {
        return lessons;
    }

    Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Group createGroup(int numberGroup, Student... students) {
        Group group = new Group();
        group.groupNumber = numberGroup;
        group.students = students;

        Group[] groups1 = new Group[1];
        if (groups != null) groups1 = Arrays.copyOf(groups,groups.length+1);

        groups1[groups.length] = group;
        groups = groups1;
        return group;
    }

    public void deleteGroup(int numberGroup) {
        int i, j;
        for (i = j = 0; j < groups.length; ++j) if (groups[j].groupNumber != numberGroup) groups[i++] = groups[j];
        groups = Arrays.copyOf(groups, i);
    }

    public void addStudent(int numberGroup, Student student) {
        Student[] students;
        for (Group group : groups){
            if (group.groupNumber == numberGroup){
                students = Arrays.copyOf(group.students,group.students.length+1);
                students[group.students.length] = student;
                group.students = students;
            }
        }
    }

    public void deleteStudent(String name) {
        int i, j;
        for (Group group : groups) {
            for (i = j = 0; j < group.students.length; ++j) {
                if (group.students[j].getName().equals(name)) {
                    Student[] n = new Student[group.students.length - 1];
                    System.arraycopy(group.students, 0, n, 0, j );
                    System.arraycopy(group.students, j+1, n, j, group.students.length - j-1);
                    group.students = n;
                }
            }
        }
    }

    public void createLesson() {
        Group group42 = createGroup(42);
        Group group41 = createGroup(41);

        Teacher kostenko = new Teacher("Костенко");
        Teacher sinitsa = new Teacher("Синица");
        Teacher lebedeva = new Teacher("Лебедева");
        Teacher podkolzin = new Teacher ("Подколзин");
        Teacher bessarabov = new Teacher("Бессарабов");
        Teacher zanin = new Teacher("Занин");
        Teacher golovin = new Teacher("Головин");
        Teacher garkusha = new Teacher("Гаркуша");

        LocalTime firstLessonTime = LocalTime.of(8,0,0);
        LocalTime secondLessonTime = LocalTime.of(9,40,0);
        LocalTime thirdLessonTime = LocalTime.of(11,30,0);
        LocalTime fourthLessonTime = LocalTime.of(13,10,0);
        LocalTime fifthLessonTime = LocalTime.of(15,0,0);
        LocalTime sixthLessonTime = LocalTime.of(16,40,0);

        lessons = new Lesson[]{
                //Понедельник
                new Lesson(Lesson.Subject.Web, DayOfWeek.MONDAY, firstLessonTime, new Group[]{group42}, sinitsa, 1),
                new Lesson(Lesson.Subject.Web, DayOfWeek.MONDAY, secondLessonTime, new Group[]{group42}, sinitsa, 2),
                //Вторник
                new Lesson(Lesson.Subject.Prolog, DayOfWeek.TUESDAY, firstLessonTime, new Group[]{group42}, lebedeva, 1),
                new Lesson(Lesson.Subject.Delphi, DayOfWeek.TUESDAY, secondLessonTime, new Group[]{group42}, podkolzin, 2),
                new Lesson(Lesson.Subject.Oracle, DayOfWeek.TUESDAY, thirdLessonTime, new Group[]{group41, group42}, bessarabov, 3),
                //Стреда
                new Lesson(Lesson.Subject.Prolog, DayOfWeek.WEDNESDAY, secondLessonTime, new Group[]{group42}, lebedeva, 2),
                //Четверг
                new Lesson(Lesson.Subject.Java, DayOfWeek.THURSDAY, firstLessonTime, new Group[]{group42}, golovin, 1),
                new Lesson(Lesson.Subject.Oracle, DayOfWeek.THURSDAY, secondLessonTime, new Group[]{group42}, zanin, 2),
                new Lesson(Lesson.Subject.Java, DayOfWeek.THURSDAY, thirdLessonTime, new Group[]{group41, group42}, garkusha, 3),
                new Lesson(Lesson.Subject.Prolog, DayOfWeek.THURSDAY, fourthLessonTime, new Group[]{group41, group42}, kostenko, 4),
                //Пятница
                new Lesson(Lesson.Subject.Clojure, DayOfWeek.FRIDAY, firstLessonTime, new Group[]{group42}, sinitsa, 1),
                new Lesson(Lesson.Subject.Clojure, DayOfWeek.FRIDAY, secondLessonTime, new Group[]{group42}, sinitsa, 2),
        };
    }
}
