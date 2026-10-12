public abstract class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double hargaDasar;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double hargaDasar, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        if (hargaDasar < 0 || stok < 0) {
            throw new IllegalArgumentException("Harga dan stok tidak boleh negatif");
        }
        this.hargaDasar = hargaDasar;
        this.stok = stok;
    }

    public String getKodeProduk() { return kodeProduk; }
    public String getNamaProduk() { return namaProduk; }
    public double getHargaDasar() { return hargaDasar; }
    public int getStok() { return stok; }

    public boolean kurangiStok(int jumlah) {
        if (jumlah <= 0 || jumlah > stok) {
            return false;
        }
        stok -= jumlah;
        return true;
    }

    public abstract double hitungHarga();

    public abstract String getKategori();
}
