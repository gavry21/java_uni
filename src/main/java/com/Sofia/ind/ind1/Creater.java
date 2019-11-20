package com.Sofia.ind.ind1;

import java.util.Arrays;

class Creater {
    private Villages[] villages = new Villages[0];
    private int idCounter = 0;
    private Info[] infos;

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    int createID() {
        return idCounter++;
    }

    Villages[] getVillages(){
        return villages;
    }

    Info[] getInfos(){
        return infos;
    }

    public void setVillages(Villages[] villages) {
        this.villages = villages;
    }

    public Villages createVillages(int villageName, Characters... characters) {
        Villages village = new Villages();
        village.villageName = villageName;
        village.charecters = characters;

        Villages[] villages1 = new Villages[1];
        if (villages != null) villages1 = Arrays.copyOf(villages,villages.length+1);

        villages1[villages.length] = village;
        villages = villages1;
        return village;
    }

    public void addCharacters(int villageName, Characters character) {
        Characters[] characters;
        for (Villages village : villages){
            if (village.villageName == villageName){
                characters = Arrays.copyOf(village.charecters,village.charecters.length+1);
                characters[village.charecters.length] = character;
                village.charecters = characters;
            }
        }
    }

    public void createInfo(){
        Villages village1 = createVillages(1);
        Villages village2 = createVillages(2);

        infos = new Info[]{
                new Info(Info.Technics.Fūinjutsu,new Villages[]{village1},1),
                new Info(Info.Technics.Genjutsu,new Villages[]{village1},2),
                new Info(Info.Technics.Ninjutsu,new Villages[]{village1},3),
                new Info(Info.Technics.Fūinjutsu,new Villages[]{village2},1),
                new Info(Info.Technics.Taijutsu,new Villages[]{village2},2),
        };
    }
}
