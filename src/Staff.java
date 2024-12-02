public class Staff implements Equipments{
    private String StaffName;
    private String StaffType;
    private int StaffAtk;

    public Staff(String StaffName, String StaffType, int StaffAtk) {
        this.StaffName = StaffName;
        this.StaffType = StaffType;
        this.StaffAtk = StaffAtk;
    }

    @Override
    public String getName() {
        return StaffName;
    }

    @Override
    public String getType() {
        return StaffType;
    }

    public int getAtk() {
        return StaffAtk;
    }
}
