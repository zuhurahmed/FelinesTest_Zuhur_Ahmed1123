package be.intecbrussel.Felines;

import java.util.Arrays;
import java.util.Objects;

public class MainApp {


    public static void main(String[] args) {

        Felis[] cats1 = {new Felis()};
        PersianCat[] cats2 = {new PersianCat()};
        Panthera[] cats3 = {new Panthera()};
        Acinonyx[] cats4 = {new Acinonyx()};
        AndeanMountainCat[] cats5 = {new AndeanMountainCat()};
        SiamestCat[] cats6 = {new SiamestCat()};

        System.out.println(Arrays.toString(cats1));
        System.out.println(Arrays.toString(cats2));
        System.out.println(Arrays.toString(cats3));
        System.out.println(Arrays.toString(cats4));
        System.out.println(Arrays.toString(cats5));
        System.out.println(Arrays.toString(cats6));

        //equals methode na checken
        //  for (boolean b : new boolean[]{Objects.equals(cats1[2], cats2[2]), Objects.equals(cats1[1], cats2[6])})
        //   System.out.println(b);
        System.out.println(Felis.getVaccitationCount());
        System.out.println(Animal.getAnimalCount());

    }

}
