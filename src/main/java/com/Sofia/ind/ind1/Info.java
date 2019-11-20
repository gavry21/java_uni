package com.Sofia.ind.ind1;

public class Info {
    private Technics technics;
    private Villages[] villages;
    private int number;

    public Info(Technics technics, Villages[] villages, int number){
        this.technics = technics;
        this.villages = villages;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Technics getTechnics() {
        return technics;
    }

    public Villages[] getVillages() {
        return villages;
    }

    public enum Technics {
        Ninjutsu,
        Genjutsu,
        Taijutsu,
        Fūinjutsu
    }
}
