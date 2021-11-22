package be.intecbrussel.Felines;

import java.util.Objects;

public class Felis extends Animal {

    private static int vaccitationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    //increment/decrement
    {
        vaccitationCount++;
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;

    }

    public void setShelterNo(int shelterNo) {
        if (shelterNo>0&&shelterNo<999){
            this.shelterNo = shelterNo;

        }

    }

    //Constructor
    public Felis(int badgeNo, int shelterNo) {
        super();
        setBadgeNo(badgeNo);
       setShelterNo(shelterNo);
    }



    public void miauw() {
        System.out.println("the animal make noise");
    }

    public static int getVaccitationCount() {
        return vaccitationCount;
    }

    public void miauuw() {
        System.out.println("the animal make noise");
    }

    // setter and getters methode
    public static void setVaccitationCount(int vaccitationCount) {
        vaccitationCount = vaccitationCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//hashCode//equals//override methode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }

    // vraag4;
    public static int f(int x, int y) {
        int b = y--;
        while (b > 0) {
            if (x % 2 != 0) {
                --x;
                y = y - 2;
            } else {
                x = x / 2;
                b = b - x - 1;
                System.out.println(b);
            }
        }
        return x - y;

    }
//vraag4;
//    public static void main(String[] args){
//        int i = 7;
//        --i;
//        System.out.println(i);
//        --i;
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(i++);
//        System.out.println(i);
//    }

}
