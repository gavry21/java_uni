package com.Sofia.ind.lab.task2;

public class WordCounter {

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
