package com.Sofia.ind.ind1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Creater {
    private int id;
    private String name;
    private Map<Integer, Characters> characters = new HashMap<>();

    public Creater(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(Map<Integer, Characters> characters) {
        this.characters = characters;
    }


    public void workJSON() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();//для записи не в одну строку
        String json = gson.toJson(this);
        try(FileWriter writer = new FileWriter("src/main/resources/indJSON.txt", false);) {
            // Запись в файл
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            // Чтение из файла
            Stream<String> streamInfoFromFile = Files.lines(                                    // Получаем Stream из строк(читаем файл построчно в потоке).    lines(Path path , Charset charset(необязательно)).
                    Paths.get("src/main/resources/indJSON.txt"));                                // Для создания экземпляра класса Path, используем статический метод get класса Paths, позволяющего создать путь из строки или URI.
            String info = streamInfoFromFile.collect(Collectors.toCollection(ArrayList::new)).get(0);
            Creater data1 = gson.fromJson(info, Creater.class);
            data1.getCharacters().values().forEach(n -> System.out.println(n.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addCharacters(Characters characters) {
        this.characters.put(this.characters.size() + 1, characters);
    }


    @Override
    public String toString() {
        return "Creater{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", characters=" + characters +
                '}';
    }
}
