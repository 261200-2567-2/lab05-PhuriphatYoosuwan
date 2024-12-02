public class Sword implements Equipments{
    private String swordName;
    private String swordType;
    private int swordAtk;

    public Sword(String swordName, String swordType, int swordAtk) {
        this.swordName = swordName;
        this.swordType = swordType;
        this.swordAtk = swordAtk;
    }

    @Override
    public String getName() {
        return swordName;
    }

    @Override
    public String getType() {
        return swordType;
    }

    @Override
    public int getAtk() {
        return swordAtk;
    }
}
