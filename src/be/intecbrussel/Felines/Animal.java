package be.intecbrussel.Felines;

public abstract class Animal {
    protected static int animalCount;

    private char size;
    private char coat;
    private String color;
    private double weight;

    {
        animalCount++;
    }
    public void makeNoise() {
        System.out.println("meow");
    }

    public void eat() {
        System.out.println(" fish");
    }

    public void sleep() {
        System.out.println("zssszz");
    }

    public boolean isAlive() {
        boolean cat = isAlive();
        return true;

    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}


