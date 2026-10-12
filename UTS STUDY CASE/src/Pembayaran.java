public abstract class Pembayaran {
    private String idPembayaran;
    private Pesanan pesanan;
    private boolean lunas;

    public Pembayaran(String idPembayaran, Pesanan pesanan) {
        this.idPembayaran = idPembayaran;
        this.pesanan = pesanan;
        this.lunas = false;
    }

    public String getIdPembayaran() { return idPembayaran; }
    public Pesanan getPesanan() { return pesanan; }
    public boolean isLunas() { return lunas; }

    protected void setLunas(boolean lunas) {
        this.lunas = lunas;
    }

    public double getTotalBayar() {
        return pesanan.hitungTotal() + hitungBiayaAdmin();
    }

    public abstract double hitungBiayaAdmin();

    public abstract String getMetode();

    public abstract boolean proses();
}
