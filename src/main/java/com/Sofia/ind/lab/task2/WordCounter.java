package com.Sofia.ind.lab.task2;

public class WordCounter {

    private static String strl = "a aasd";
    private static char s ='a';
    public static void main(String[] args) {
       countChar(strl, s);
    }
        public static int countChar(String str, char c)
        {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c)
                    count++;
            }
            System.out.println("Колличество вхождений - " + count);
            return count;
        }

}
