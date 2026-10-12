public class PembayaranQRIS extends Pembayaran {
    private String penyediaQR;

    public PembayaranQRIS(String idPembayaran, Pesanan pesanan, String penyediaQR) {
        super(idPembayaran, pesanan);
        this.penyediaQR = penyediaQR;
    }

    public String getPenyediaQR() { return penyediaQR; }

    @Override
    public double hitungBiayaAdmin() {
        return getPesanan().hitungTotal() * 0.007; // asumsi 0,7%
    }

    @Override
    public String getMetode() {
        return "QRIS (" + penyediaQR + ")";
    }

    @Override
    public boolean proses() {
        // Simulasi: selalu berhasil
        setLunas(true);
        return true;
    }
}
