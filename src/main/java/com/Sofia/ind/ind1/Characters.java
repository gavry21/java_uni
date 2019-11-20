package com.Sofia.ind.ind1;

public class Characters {
    private String name;
    private String family;
    private int id;

    public Characters(int id, String name, String family){
        this.name = name;
        this.family = family;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }
}
