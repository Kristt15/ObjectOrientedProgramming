package W7.perbankan;

public class PengambilanUang extends Tabungan {
private int proteksi;

    public PengambilanUang(int saldo) {
        super(saldo);
    }

    public PengambilanUang(int saldo, int tingkatBunga) {
        super(saldo);
        this.proteksi = tingkatBunga;   // tebakan
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo - jumlah >= proteksi) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
}
