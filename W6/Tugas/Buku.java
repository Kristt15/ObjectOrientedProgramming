public class Buku {
    public String judul;
    public String penulis;
    private int stok;
    protected String kategori;

    public Buku(String judul, String penulis, int stok, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.stok = stok;
        this.kategori = kategori;
    }

    public void tampilkanInfo() {
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis);
        System.out.println("Stok     : " + stok);
        System.out.println("Kategori : " + kategori);
    }

    public boolean kurangiStok(int jumlah) {
        if (cekStok() && stok >= jumlah) {
            stok = stok - jumlah;
            return true;
        }
        return false;
    }

    private boolean cekStok() {
        return stok > 0;
    }

    void updateKategori(String kategori) {
        this.kategori = kategori;
    }
}