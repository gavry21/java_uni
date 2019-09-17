package com.Sofia.ind.lab.task2;
public class Book {

    private static String name  = "Pried & Prejudice";
    private static String auther = "Jane Ostin";
    private static int pages = 300;

    public static void main(String[] args) {
        print(pages, auther);
    }

    private static String print(int t, String str1){
        System.out.println("Имя автора - " + str1);
        System.out.println("Колличество страниц - " + t);
        return null;
    }

    }
