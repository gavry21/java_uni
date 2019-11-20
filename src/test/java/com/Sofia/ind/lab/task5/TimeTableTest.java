package com.Sofia.ind.lab.task5;

import com.Sofia.ind.lab.task4.Lesson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import com.Sofia.ind.lab.task4.Timetable;

public class TimeTableTest {
    @Test
    void scheduleStudentTest() {
        Timetable timeTable = new Timetable(1,"София");
        Set<Lesson> scheduleStudent = new HashSet<>(timeTable.getTimetableStudent());

        Set<DayOfWeek> dayOfWeeks = new HashSet<>();
        Set<Lesson.Subject> subjects = new HashSet<>();
        scheduleStudent.forEach(lesson -> {
            dayOfWeeks.add(lesson.getDayOfWeek());
            subjects.add(lesson.getSubject());
        });

        HashSet subjects1 = new HashSet<>(Arrays.asList(Lesson.Subject.values()));
        Set<DayOfWeek> dayOfWeeks1 = new HashSet<>(Arrays.asList(DayOfWeek.values()).subList(0, DayOfWeek.values().length - 2));

        Assertions.assertEquals(scheduleStudent.size(), 18);

        Assertions.assertEquals(dayOfWeeks.size(),5);
        Assertions.assertEquals(dayOfWeeks,dayOfWeeks1);

        Assertions.assertEquals(subjects.size(),9);
        Assertions.assertEquals(subjects,subjects1);
    }
}
