package be.intecbrussel.Felines;

public class PersianCat extends Felis {
    public PersianCat(int badgeNo, int shelterNo) {
        super(badgeNo, shelterNo);

    }


    public void miauw() {
        System.out.println("make a noise");
    }

    @Override
    public void miauuw() {

    }


    @Override
    public String toString() {
        return "PersianCat";
    }
}