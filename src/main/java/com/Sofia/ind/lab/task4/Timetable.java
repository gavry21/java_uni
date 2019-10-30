package com.Sofia.ind.lab.task4;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Scanner;

public class Timetable {
    private Group[] groups;
    private String lesson;
    private String time;

    public Timetable(Group[] group, String lesson, String time){
        this.groups = group;
        this.lesson = lesson;
        this.time = time;
    }

    public void addGroup(Group group){
        groups = Arrays.copyOf(groups, groups.length+1);
        groups[groups.length] = group;
    }

    @Override
    public String toString(){
        return Arrays.toString(groups);
    }

    public static void main(String[] args) {

        Timetable T1 = new Timetable(new Group[]{g1},"Java","11:30");


    }




}
