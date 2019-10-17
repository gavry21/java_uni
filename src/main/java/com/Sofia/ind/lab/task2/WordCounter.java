package com.Sofia.ind.lab.task2;

public class WordCounter {

    private static String strl = "a aasd bsd bsd";
    public static void main(String[] args) {
        countChar(strl);
    }
        public static void countChar (String str)
        {
            int i = 0, c = 0;
            String[] str2 = str.split(" ");
            for (String str3 : str2){
                i++;
            }
            for (int j=0; j< i-1; j++){
                for (int k= j+1; k < i; k++){
                    if (!str2[j].equals(" ")) {
                        if (str2[j].equals(str2[k])){
                            c++;
                            str2[k]= " ";
                        }
                    }
                }
                if (!str2[j].equals(" "))
                    System.out.println("количество вхождений " + str2[j] + " - " +(c+1));
                c = 0;
            }
            if (!str2[i-1].equals(" "))
                System.out.println("количество вхождений " + str2[i] + " - " + 1);

        }


}
