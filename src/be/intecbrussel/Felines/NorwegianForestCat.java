package be.intecbrussel.Felines;

public  class NorwegianForestCat extends Felis {

    public NorwegianForestCat(int badgeNo,int shelterNo) {
        super(badgeNo,shelterNo);
    }
    public void miauuwInNorgian() {
        System.out.println("krrr");
    }

    @Override
    public void miauuw() {
        System.out.println(" Make a noise");
    }
    @Override
    public String toString() {
        return " NorwegianForestCat";
    }
    }

