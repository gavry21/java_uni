package com.Sofia.ind.lab.task4;

import java.util.Date;
import java.util.Scanner;

public class Student{

   private String name;
   private String fac;
   private int age;
   private int group;

    //чтобы получить доступ к приватным переменным
  /* public String getName(){
       return name;
    }
   public void setName(String name){
       this.name = name;
   }
*/
      //Вместо get и set
   public Student(String name, String fac, int age, int group) {
       this.name = name;
       this.fac = fac;
       this.age = age;
       this.group = group;
   }

    @Override
    public String toString(){
        return String.format("%n"+"Name: " +
                name + "%n"+"Group: " +
                group );
    }
}
