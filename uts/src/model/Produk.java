package model;

public class Produk {
    // atribut
    private String idProduk;
    private String nama;
    private int harga;
    private int stok;

    // constructor
    public Produk(String idProduk, String nama, int harga, int stok) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // getter
    public String getIdProduk() { 
        return idProduk; 
    }
    public String getNama() { 
        return nama; 
    }
    public int getHarga() { 
        return harga; 
    }
    public int getStok() { 
        return stok; 
    }

    // method
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah harus lebih dari 0");
        }
        if (this.stok < jumlah) {
            throw new IllegalStateException("Stok produk tidak mencukupi. Sisa stok: " + this.stok);
        }
        this.stok -= jumlah;
    }
}
