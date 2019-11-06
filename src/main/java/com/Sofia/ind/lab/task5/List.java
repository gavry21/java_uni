package com.Sofia.ind.lab.task5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class List {
    private static List instance;

    public static List getInstance() {
        if (instance == null) {
            instance = new List();
        }
        return instance;
    }

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("1.txt");
            while (in.available() > 0) {
                System.out.println(in.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
           // throw e;
        }
    }
}

