public class Stats {
    private int maxhp;
    private int hp;
    private int atk;

    public Stats(int maxhp, int hp,int atk) {
        this.maxhp = maxhp;
        this.hp = hp;
        this.atk = atk;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
