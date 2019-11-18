package com.Sofia.ind.lab.task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounterFile {
    public static void main(String[] args) throws FileNotFoundException {

        getWordCount("C:\\Users\\Sofia\\Documents\\words.txt");
    }

    public static void getWordCount  (String filename)throws FileNotFoundException
    {
        int c = 0;
        File text = new File(filename);
        Scanner scanner = new Scanner(text);
        String[] words = scanner.split(" ");
        for(String word : words){
            c = find(words,word);
            System.out.println("Количество вхождений"+word+": "+find(words,word));
        }
    }

    private static int find(String[] words, String findWord) {
        int count=0;
        for(String word : words){
            if (word.equals(findWord)) {
                count++;
            }
        }
        return count;
    }
}