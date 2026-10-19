package model;

public class DetailPesanan {
    // atribut
    private int jumlah;
    private int subTotal;
    private Produk produk;

    // constructor
    public DetailPesanan(Produk produk, int jumlah) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk tidak boleh null");
        }
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah harus lebih dari 0");
        }
        this.produk = produk;
        this.jumlah = jumlah;
        this.subTotal = hitungSubTotal();
    }

    // method
    public int hitungSubTotal() {
        if (produk != null) {
            this.subTotal = this.jumlah * produk.getHarga();
        }
        return this.subTotal;
    }

    // getter
    public int getJumlah() { return jumlah; }
    public int getSubTotal() { return subTotal; }
    public Produk getProduk() { return produk; }
}
