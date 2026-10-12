public class Promo {
    private String kodePromo;
    private String deskripsi;
    private double persenDiskon;
    private double minimalBelanja;
    private boolean aktif;

    public Promo(String kodePromo, String deskripsi, double persenDiskon, double minimalBelanja) {
        this.kodePromo = kodePromo;
        this.deskripsi = deskripsi;
        if (persenDiskon < 0 || persenDiskon > 100) {
            throw new IllegalArgumentException("Persen diskon harus 0 - 100");
        }
        this.persenDiskon = persenDiskon;
        this.minimalBelanja = minimalBelanja;
        this.aktif = true;
    }

    public String getKodePromo() { return kodePromo; }
    public String getDeskripsi() { return deskripsi; }
    public double getPersenDiskon() { return persenDiskon; }
    public boolean isAktif() { return aktif; }
    public void setAktif(boolean aktif) { this.aktif = aktif; }

    public boolean isBerlaku(double subtotal) {
        return aktif && subtotal >= minimalBelanja;
    }

    public double hitungDiskon(double subtotal) {
        if (!isBerlaku(subtotal)) {
            return 0;
        }
        return subtotal * persenDiskon / 100;
    }
}
