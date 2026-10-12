public class Pesanan {
    private static final int MAKS_TIKET = 5;
    private static final int MAKS_PRODUK = 10;

    private String idPesanan;
    private Pelanggan pelanggan;
    private Promo promo;
    private Tiket[] daftarTiket;
    private Produk[] daftarProduk;
    private int[] jumlahPerProduk;
    private int jumlahTiket;
    private int jumlahProduk;
    private String status;

    public Pesanan(String idPesanan, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.promo = null;
        this.daftarTiket = new Tiket[MAKS_TIKET];
        this.daftarProduk = new Produk[MAKS_PRODUK];
        this.jumlahPerProduk = new int[MAKS_PRODUK];
        this.jumlahTiket = 0;
        this.jumlahProduk = 0;
        this.status = "BELUM_BAYAR";
    }

    public String getIdPesanan() { return idPesanan; }
    public Pelanggan getPelanggan() { return pelanggan; }
    public Promo getPromo() { return promo; }
    public String getStatus() { return status; }
    public boolean isLunas() { return status.equals("LUNAS"); }
    public int getJumlahTiket() { return jumlahTiket; }
    public int getJumlahJenisProduk() { return jumlahProduk; }
    public Tiket getTiket(int index) { return daftarTiket[index]; }
    public Produk getProduk(int index) { return daftarProduk[index]; }
    public int getQtyProduk(int index) { return jumlahPerProduk[index]; }

    public boolean isTiketPenuh() {
        return jumlahTiket >= daftarTiket.length;
    }

    public boolean tambahTiket(Tiket tiket) {
        if (tiket == null || isLunas() || isTiketPenuh()) {
            return false;
        }
        daftarTiket[jumlahTiket] = tiket;
        jumlahTiket++;
        return true;
    }

    // Stok hanya dicek di sini. Pengurangan stok dilakukan Kasir setelah berhasil.
    public boolean tambahProduk(Produk produk, int jumlah) {
        if (produk == null || jumlah <= 0 || isLunas() || jumlahProduk >= daftarProduk.length) {
            return false;
        }
        if (produk.getStok() < jumlah) {
            return false;
        }
        daftarProduk[jumlahProduk] = produk;
        jumlahPerProduk[jumlahProduk] = jumlah;
        jumlahProduk++;
        return true;
    }

    public void setPromo(Promo promo) {
        if (!isLunas()) {
            this.promo = promo;
        }
    }

    public double hitungSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < jumlahTiket; i++) {
            subtotal += daftarTiket[i].getHarga();
        }
        for (int i = 0; i < jumlahProduk; i++) {
            subtotal += daftarProduk[i].hitungHarga() * jumlahPerProduk[i]; // polymorphism
        }
        return subtotal;
    }

    public double hitungDiskon() {
        if (promo == null) {
            return 0;
        }
        return promo.hitungDiskon(hitungSubtotal());
    }

    public double hitungTotal() {
        return hitungSubtotal() - hitungDiskon();
    }

    public void setLunas() {
        this.status = "LUNAS";
    }
}
