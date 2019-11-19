package com.Sofia.ind.lab.task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounterFile {
    public static void WordsCounter(String fileName, Map<String, Integer> words) throws FileNotFoundException {
        Scanner file = new Scanner(new File(fileName));
        while (file.hasNext()){
            String word = file.next();
            Integer count = words.get(word);
            if(count != null)
                count++;
            else
                count =1;
            words.put(word, count);
        }
        file.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> words = new HashMap<String, Integer>();
        WordsCounter("C:\\Users\\Sofia\\Documents\\words.txt", words);
        System.out.println(words);
    }
}
