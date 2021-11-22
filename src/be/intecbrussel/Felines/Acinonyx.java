package be.intecbrussel.Felines;

public class Acinonyx extends Animal {
    private double speed;

    public Acinonyx(int badgeNo, int shelterNo, double speed) {
        super(badgeNo, shelterNo);
        this.speed = speed;
    }

    public void run(double distance) {
        System.out.println("run fast");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void kiauuw() {
        System.out.println("kkrrr");
    }
    @Override
    public String toString() {
        return "Acinonyx ";
    }
}
