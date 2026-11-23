package Tugas;

class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int infoGaji() {
        return gaji;
    }

    public int infoBonus() {
        return bonus;
    }
}
