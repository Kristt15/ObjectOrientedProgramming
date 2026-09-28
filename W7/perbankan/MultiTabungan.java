package W7.perbankan;

public class MultiTabungan extends Tabungan {
    public static final int KURS_AUD = 10000;
    public static final int KURS_USD = 9000;

    public MultiTabungan(int initsaldo){
        super(initsaldo);
    }

    private int getKurs(String mataUang){
        switch (mataUang.toUpperCase()) {
            case "IDR": return 1;
            case "AUD": return KURS_AUD;
            case "USD": return KURS_USD;
            default:    return -1;
        }
    }

    public boolean simpanUang(int jumlah, String mataUang){
        int kurs = getKurs(mataUang);
        if (kurs == -1 || jumlah <= 0) {
            return false;
        }
        super.simpanUang(jumlah * kurs);
        return true;
    }

    public boolean ambilUang(int jumlah, String mataUang){
        int kurs = getKurs(mataUang);
        if (kurs == -1 || jumlah <= 0) {
            return false;
        }
        return super.ambilUang(jumlah * kurs);
    }

    public double getSaldo(String mataUang){
        int kurs = getKurs(mataUang);
        if (kurs == -1) {
            return -1;
        }
        return (double) getSaldo() / kurs;
    }
}