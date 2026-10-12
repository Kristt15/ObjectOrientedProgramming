public class Makanan extends Produk {
    private boolean porsiBesar;

    public Makanan(String kodeProduk, String namaProduk, double hargaDasar, int stok, boolean porsiBesar) {
        super(kodeProduk, namaProduk, hargaDasar, stok);
        this.porsiBesar = porsiBesar;
    }

    public boolean isPorsiBesar() { return porsiBesar; }

    @Override
    public double hitungHarga() {
        if (porsiBesar) {
            return getHargaDasar() * 1.2; // asumsi: porsi besar +20%
        }
        return getHargaDasar();
    }

    @Override
    public String getKategori() {
        return "Makanan";
    }
}
