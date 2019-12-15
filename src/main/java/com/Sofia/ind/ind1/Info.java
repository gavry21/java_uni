package com.Sofia.ind.ind1;

import java.util.ArrayList;
import java.util.List;

public class Info {
    private double code;
    private List<String> Position = new ArrayList<>();
    private String info;
    private List<Characters> characters;

    public Info(double code) {
        this.code = code;

        if (code == 0) {
            info = "Хокаге";
            Position.add("Охрана деревни");
            Position.add("Контроль деревни");
            characters = new ArrayList<>();
        }

        if (code == 1.0) {
            info = "Чуунин";
            Position.add("Экзаменатор");
            Position.add("Охрана границы");
            Position.add("Охрана Хокаге");
            characters = new ArrayList<>();
        }


        if (code == 2.0) {
            info = "Медик";
            Position.add("Незамедлительная помощь раненым членам отряда");
            Position.add("Разработка противоядий");
            characters = new ArrayList<>();
        }

        if (code == 3.0) {
            info = "Отступник";
            Position.add("Исследование территорий");
            Position.add("Охрана деревни на расстоянии");
            characters = new ArrayList<>();
        }

    }

    public double getCode() {
        return code;
    }

    public List<Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Characters> characters) {
        this.characters = characters;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Info{" +
                "code=" + code +
                ", Position=" + Position +
                ", info='" + info + '\'' +
                ", characters=" + characters +
                '}';
    }
}
