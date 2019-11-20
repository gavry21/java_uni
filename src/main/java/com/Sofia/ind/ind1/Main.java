package com.Sofia.ind.ind1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends Creater {
    private int choose;
    private String name;
    private ArrayList<Info> tableCharacter = new ArrayList<>();

    public ArrayList<Info> getTableCharacter(){
        return tableCharacter;
    }

    public Main(int choose, String name){
        this.choose = choose;
        this.name = name;
        getMain();
    }

    private void getMain() {
        Creater creater = new Creater();
        creater.createInfo();

        creater.addCharacters(1,new Characters(createID(),"Наруто","Узумаки"));
        creater.addCharacters(1,new Characters(createID(), "Саске", "Учиха"));
        creater.addCharacters(2,new Characters(createID(),"Гаара","Казекаге"));
        if (choose == 1){
            System.out.println("Техники:");
            Villages villageCharacter = find(creater.getVillages(), name);
            for (Info info : creater.getInfos()) {
                if (Arrays.stream(info.getVillages()).anyMatch(villages1 -> villages1 == villageCharacter)) {
                    tableCharacter.add(info);
                    System.out.println("\t" + info.getNumber() + ". " + info.getTechnics() + "\n");
                }
            }
        }
    }

    private Villages find(Villages[] villages, String name) {
        for (Villages village : villages)
            for (Characters character : village.charecters)
                if (character.getName().equals(name)) return village;
                return null;
    }

    public static void main(String[] args) {
        Main main = new Main(1,"Саске");
    }
}
