package com.Sofia.ind.lab.task2;

import java.util.HashMap;
import java.util.Map;

/*
    private String text;
    private Map<String,Integer> words_col = new HashMap<>();

    public Map<String, Integer> getWords_col() {
        return words_col;
    }

    public WordCounter(String text){
        this.text = text;
        Count();
    }

    Integer col(String word){
        return words_col.get(word);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> pair : words_col.entrySet()) {
            builder.append(pair.getKey()).append(" : ").append(pair.getValue()).append("\n");
        }
        return builder.toString();
    }

    private void Count(){
        String[] words = text.split("\\s+");
        for(String s: words){
            if (!s.equals("")) {
                int count = words_col.getOrDefault(s, 0);
                words_col.put(s, count + 1);
            }
        }
//        for(Map.Entry<String,Integer> pair: words_col.entrySet())
//            System.out.println(pair.getKey() + " : " + pair.getValue());
    }
}

/*
public class WordCounter {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        String sentence = "My home, is my home";

        for (String word : sentence.split("\\W")) {
            if (word.isEmpty()) {
                continue;
            }
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (
                Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
*/

/*
    public static void main(String[] args) {
        String strl = "asd as";
        countChar(strl);
    }
        public static int countChar (String text)
        {
            int c = 0;
            String[] words = text.trim().split(" ");
            for(String word : words){
                c = find(words,word);
              System.out.println(word+": "+find(words,word));
            }
         return c;
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



public class WordCounter {

    public static void main(String[] args) {
        WordCounter countWord = new WordCounter();
        countWord.countWords("find spring tutorial, java tutorial how to java articles spring articles and may more");
    }

    public void countWords(String input) {
        Map <String, String> map = new HashMap <String, String> ();

        if (input != null) {
            String[] separatedWords = input.split(" ");
            for (String str: separatedWords) {
                if (map.containsKey(str)) {
                    int count = Integer.parseInt(map.get(str));
                    map.put(str, String.valueOf(count + 1));
                } else {
                    map.put(str, "1");
                }
            }
        }
        System.out.println("Count :- " + map);
    }

}

 */

public class WordCounter {

    private String text;
    private Map<String,Integer> words_col = new HashMap<>();

    public Map<String, Integer> getWords_col() {
        return words_col;
    }

    public WordCounter(String text){
        this.text = text;
        Count();
    }

    Integer col(String word){
        return words_col.get(word);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> pair : words_col.entrySet()) {
            builder.append(pair.getKey()).append(" : ").append(pair.getValue()).append("\n");
        }
        return builder.toString();
    }

    public void Count(){
        String[] words = text.split("\\s+");
        for(String s: words){
            if (!s.equals("")) {
                int count = words_col.getOrDefault(s, 0);
                words_col.put(s, count + 1);
            }
        }
    }
}