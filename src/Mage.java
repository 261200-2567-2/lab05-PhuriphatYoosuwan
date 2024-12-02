public class Mage implements Charaters, Equipable{
    private String name;
    private Stats stats;
    private Equipments equipments;

    public Mage(String name, Stats stats) {
        this.name = name;
        this.stats = stats;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Stats getStats() {
        return stats;
    }

    @Override
    public void attack(Charaters target) {
        target.getStats().setHp(target.getStats().getHp() - getStats().getAtk());

        System.out.println(name + " use fireball to " + target.getName());
        System.out.println(target.getName() + " -" + getStats().getAtk() + " hp");
        System.out.println("==============================");
    }

    @Override
    public void equip(Equipments equipment) {
        getStats().setAtk(equipment.getAtk() + getStats().getAtk());

        this.equipments = equipment;

        System.out.println(name + " equip " + equipment.getName());
        System.out.println("==============================");
    }

    @Override
    public void showStats() {
        System.out.println(name);
        System.out.println("hp: " + getStats().getHp() + "/" + getStats().getMaxhp() + " atk: " + getStats().getAtk());
        System.out.println("==============================");
    }

    @Override
    public void showEquipments() {
        if (equipments == null) {
            System.out.println("No equipments");
            System.out.println("==============================");
        } else {
            System.out.println(name + " now equip " + equipments.getName());
            System.out.println("==============================");
        }
    }
}
