package be.intecbrussel.Felines;

public class TurkishVanCat extends Felis{
    public String nickname;

    public TurkishVanCat(int badgeNo,int shelterNo) {
        super(badgeNo,shelterNo);
    }
    @Override
    public void miauw() {
        super.miauw();
    }

    @Override
    public String toString() {
        return "TurkishCat";
    }
}


