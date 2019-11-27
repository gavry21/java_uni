package com.Sofia.ind.lab.task4;

import java.util.Date;
import java.util.Scanner;

public class Student{

   private String name;
   private String fac;
   private int id;

    //чтобы получить доступ к приватным переменным
   public Student(int id, String name, String fac) {
       this.name = name;
       this.fac = fac;
       this.id = id;
   }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFac() {
        return fac;
    }

}
