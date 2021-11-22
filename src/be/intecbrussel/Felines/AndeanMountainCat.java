package be.intecbrussel.Felines;

public class AndeanMountainCat extends Felis {
    public AndeanMountainCat(int badgeNo, int shelterNo) {
        super(badgeNo, shelterNo);
    }


    public void miaiw(String customSound) {
        System.out.println("Make a noise");
    }

    @Override
    public boolean isAlive() {
        return false;

    }

    public String toString() {
        return "AndeanMountainCat";

    }
}