package com.Sofia.ind.ind1;

import com.sun.istack.internal.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class IndTest {
    private List<Characters> characters = new ArrayList<>();
    private List<Creater> villages = new ArrayList<>();

    @BeforeEach
    public void createData() {

        Characters characterMain1 = new Characters("Наруто", "Узумаки");

        Characters characterMain2 = new Characters("Гаара", "Песочный");


        Creater village1 = new Creater(1, "Коноха");
        Creater village2 = new Creater(2, "Деревня скрытого песка");
        //Коноха
        characterMain1.addVillage(village1, 0);
        village1.addCharacters(characterMain1);
        characters.add(characterMain1);
        //Деревня скрытого песка
        characterMain2.addVillage(village2, 0);
        village2.addCharacters(characterMain2);
        characters.add(characterMain2);

        //------------------------
        Characters character2 = new Characters("Сакура", "Харуно");
        character2.addVillage(village1, 2.0);
        village1.addCharacters(character2);
        characters.add(character2);

        Characters character3 = new Characters("Саске", "Учиха");
        character3.addVillage(village1, 3.0);
        village1.addCharacters(character3);
        characters.add(character3);

        Characters character4 = new Characters("Шикамару", "Нара");
        character4.addVillage(village1, 1.0);
        village1.addCharacters(character4);
        characters.add(character4);

        Characters character5 = new Characters("Какаши", "Хатаке");
        character5.addVillage(village1, 1.0);
        village1.addCharacters(character5);
        characters.add(character5);

        Characters character6 = new Characters("Итачи", "Учиха");
        character6.addVillage(village1, 3.0);
        village1.addCharacters(character6);
        characters.add(character6);
        
        character5.getInfoOfCharacters().get(village1.getId()).setCharacters(Arrays.asList(character3, character4, character2, character6));
        //------------------------
        villages.add(village1);



        //------------------------
        Characters character7 = new Characters("Темари", "Песочная");
        character7.addVillage(village2, 1.0);
        village2.addCharacters(character7);
        characters.add(character7);

        Characters character8 = new Characters("Карура", "Песочная");
        character8.addVillage(village2, 1.0);
        village2.addCharacters(character8);
        characters.add(character8);

        Characters character9 = new Characters("Канкура", "Песочной");
        character9.addVillage(village2, 1.0);
        village2.addCharacters(character9);
        characters.add(character9);

        character7.getInfoOfCharacters().get(village2.getId()).setCharacters(Arrays.asList(character8, character9));

        villages.add(village2);
    }

    @Test
    public void indTest() {
        Assertions.assertTrue(villages.get(0).getCharacters().containsValue(characters.get(3)));
       // Assertions.assertFalse(villages.get(1).getCharacters().containsValue(characters.get(3)));

        //Assertions.assertEquals(Arrays.asList(characters.get(0), characters.get(1)),
         //       findCharactersVillage(villages.get(0)));

        villages.get(0).workJSON();

        Characters newCharacter = new Characters("Боруто", "Узумаки");
        newCharacter.addVillage(villages.get(0), 0);
        villages.get(0).addCharacters(newCharacter);
        characters.add(newCharacter);

        Assertions.assertEquals(Arrays.asList( characters.get(0), characters.get(10)),
              findCharactersVillage(villages.get(0)));

        Assertions.assertEquals(Arrays.asList(characters.get(1)),
              findCharactersVillage(villages.get(1)));

 //     Assertions.assertEquals(Stream.of(characters.get(2)).collect(Collectors.toSet()), characters.get(1).findLeaders(villages));
//       characters.get(10).outInfoHuman(villages);
    }

    public List<Characters> findCharactersVillage(@NotNull Creater village) {
        List<Characters> res = new ArrayList<>();
        for (Characters character : village.getCharacters().values()) {
            Info info = character.getInfoOfCharacters().get(village.getId());
            if (info.getCode() == 0) res.add(character);
        }
        return res;
    }
}
