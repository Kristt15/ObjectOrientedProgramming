public class Minuman extends Produk {
    private String ukuran; // "S", "M", "L"

    public Minuman(String kodeProduk, String namaProduk, double hargaDasar, int stok, String ukuran) {
        super(kodeProduk, namaProduk, hargaDasar, stok);
        setUkuran(ukuran);
    }

    public String getUkuran() { return ukuran; }

    public void setUkuran(String ukuran) {
        String u = ukuran.toUpperCase();
        if (!u.equals("S") && !u.equals("M") && !u.equals("L")) {
            throw new IllegalArgumentException("Ukuran harus S, M, atau L");
        }
        this.ukuran = u;
    }

    @Override
    public double hitungHarga() {
        if (ukuran.equals("M")) {
            return getHargaDasar() + 3000; // asumsi
        } else if (ukuran.equals("L")) {
            return getHargaDasar() + 6000; // asumsi
        }
        return getHargaDasar();
    }

    @Override
    public String getKategori() {
        return "Minuman";
    }
}
