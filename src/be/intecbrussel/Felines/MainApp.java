package be.intecbrussel.Felines;

import java.util.Arrays;
import java.util.Objects;

public class MainApp {


    public static void main(String[] args) {
        Felis[] cats = {new PersianCat(34,25), new SiamestCat(44,56), new AndeanMountainCat(89,28),
                new TurkishVanCat(88,85), new NorwegianForestCat(88,74)};
        System.out.println(Arrays.toString(cats));

        System.out.println(Felis.getVaccitationCount());
        System.out.println(Animal.getAnimalCount());


    }


}