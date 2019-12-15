package com.Sofia.ind.ind1;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Characters{
    private String clan;
    private String name;
    private Map<Integer, Info> infoOfCharacters = new HashMap<>();

    public Characters(String name, String clan) {
        this.name = name;
        this.clan = clan;
    }

    public void outInfoHuman(@NotNull List<Creater> villages) {
        System.out.println("Имя : " + name + "\n");
        System.out.println("Клан : " + clan + "\n");
        for (Creater village : villages) {
            assert this.getInfoOfCharacters().containsKey(village.getId());
            System.out.println("\t Статус : " + village.getName() + "\n");
            System.out.println("\t Роль : " + infoOfCharacters.get(village.getId()).getInfo() + "\n\n");
            for (Characters characters : village.getCharacters().values()) {
                Info info = characters.getInfoOfCharacters().get(village.getId());
                if (info.getCode() == 0)
                    System.out.println("Менеджер проекта : " + characters.getName());
            }
            for (Characters characters : village.getCharacters().values()) {
                Info info = characters.getInfoOfCharacters().get(village.getId());
                if ((info.getCharacters() != null) && ((info.getCharacters().contains(this))))
                    System.out.println("Его TeamLead : " + characters.getName());
            }
        }
    }

    public Map<Integer, Info> getInfoOfCharacters() {
        return infoOfCharacters;
    }

    public String getName() {
        return name;
    }

    public void addVillage(@NotNull Creater village, double idVillage) {
        this.infoOfCharacters.put(village.getId(), new Info(idVillage));
    }

    public Set<Characters> findLeaders(@NotNull List<Creater> villages) {
        Set<Characters> res = new HashSet<>();
        for (Creater village : villages) {
            assert this.getInfoOfCharacters().containsKey(village.getId());
            for (Characters characters1 : village.getCharacters().values()) {
                if ((characters1.getInfoOfCharacters().get(village.getId()).getCharacters() != null) &&
                        (characters1.getInfoOfCharacters().get(village.getId()).getCharacters().contains(this)))
                    res.add(characters1);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Characters{" +
                ", clan='" + clan + '\'' +
                ", name='" + name + '\'' +
                ", infoOfCharacters=" + infoOfCharacters +
                '}';
    }
}