package W7.perbankan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }

    public boolean ambilUang(int jumlah){
        if (jumlah <= saldo) {
            this.saldo -= jumlah;
            return true;
        }
        return false;
    }

}
