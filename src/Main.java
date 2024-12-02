public class Main {
    public static void main(String[] args) {
        Swordsman yuusha = new Swordsman("Yuusha", new Stats(100,100, 10));
        Mage maou = new Mage("Maou", new Stats(100,100, 10));
        Sword excalibur = new Sword("Excalibur", "Sword", 10);
        Staff ra = new Staff("Staff of Ra", "Staff", 10);

        yuusha.showStats();
        yuusha.showEquipments();
        maou.showStats();
        maou.showEquipments();


        yuusha.equip(excalibur);
        maou.equip(ra);
        yuusha.showStats();
        yuusha.showEquipments();
        maou.showStats();
        maou.showEquipments();

        yuusha.attack(maou);
        maou.attack(yuusha);
        yuusha.showStats();
        maou.showStats();
    }
}