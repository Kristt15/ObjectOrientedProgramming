public class PembayaranTunai extends Pembayaran {
    private double uangDiterima;

    public PembayaranTunai(String idPembayaran, Pesanan pesanan, double uangDiterima) {
        super(idPembayaran, pesanan);
        this.uangDiterima = uangDiterima;
    }

    public double getUangDiterima() { return uangDiterima; }

    @Override
    public double hitungBiayaAdmin() {
        return 0;
    }

    @Override
    public String getMetode() {
        return "Tunai";
    }

    @Override
    public boolean proses() {
        if (uangDiterima >= getTotalBayar()) {
            setLunas(true);
            return true;
        }
        return false;
    }

    public double getKembalian() {
        if (!isLunas()) {
            return 0;
        }
        return uangDiterima - getTotalBayar();
    }
}
