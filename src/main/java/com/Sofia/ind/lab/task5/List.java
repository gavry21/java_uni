package com.Sofia.ind.lab.task5;

import com.Sofia.ind.lab.task2.WordCounter;
import com.sun.istack.internal.NotNull;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class List {
    private String pathDir;
    private Map<String,Integer> wordsStatistic;

    Map<String,Integer> getWordsStatistic(){return this.wordsStatistic;}

    List(String pathDir) throws IOException {
        this.pathDir = pathDir;
        this.wordsStatistic = solution();
    }
    public Integer col(String word){
        return wordsStatistic.get(word);
    }
    @NotNull
    private Map<String, Integer> solution() throws IOException {
        Map<String,Integer> info = new HashMap<>();
        File folder = new File(pathDir);
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());

                Stream<String> streamInfoFromFile = Files.lines(                                    // Получаем Stream из строк(читаем файл построчно в потоке).    lines(Path path , Charset charset(необязательно)).
                        Paths.get(pathDir+file.getName()));                                // Для создания экземпляра класса Path, используем статический метод get класса Paths, позволяющего создать путь из строки или URI.

//                streamInfoFromFile.forEach(System.out::println);                                    // Здесь используем метод forEach(делать для каждого) для полученного Stream<String>(потока строк из файла)

                ArrayList<String> infoFromFile = streamInfoFromFile.collect(Collectors.toCollection(ArrayList::new));
                for (String s : infoFromFile){
                    WordCounter wordCounter = new WordCounter(s);
                    info = joinMaps(info, wordCounter.getWords_col());
                }
            }
        }
        return info;
    }

    private Map<String, Integer> joinMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String,Integer> mapResult = new HashMap<>();
        if (map1 == null || map2 == null){throw new NullPointerException("One of maps is null");}
        if (map1.isEmpty()) return map2;
        if (map2.isEmpty()) return map1;

        mapResult = map1;
        for(String s: map2.keySet()){
            int count = mapResult.getOrDefault(s, 0);
            mapResult.put(s,count+map2.get(s));
        }
        return mapResult;
    }
}

