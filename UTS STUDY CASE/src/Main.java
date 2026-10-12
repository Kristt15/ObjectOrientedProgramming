public class Main {
    public static void main(String[] args) {
        Film[] films = {
            new Film("F01", "Laskar Pelangi 2", "Drama", 120, "SU"),
            new Film("F02", "Galaksi Terakhir", "Sci-Fi", 135, "13+"),
            new Film("F03", "Malam Jumat Kliwon", "Horor", 100, "17+")
        };
        Studio[] studios = {
            new Studio("Studio 1", "Reguler", 30),
            new Studio("Studio 2", "Premiere", 20)
        };
        Jadwal[] jadwals = {
            new Jadwal("J01", films[0], studios[0], "2026-10-15", "13:00", 50000),
            new Jadwal("J02", films[1], studios[1], "2026-10-15", "16:00", 75000),
            new Jadwal("J03", films[2], studios[0], "2026-10-15", "19:00", 50000)
        };
        Produk[] produks = {
            new Makanan("M01", "Popcorn Asin", 30000, 20, false),
            new Makanan("M02", "Popcorn Karamel", 35000, 20, true),
            new Minuman("D01", "Cola", 15000, 20, "L"),
            new Minuman("D02", "Air Mineral", 8000, 30, "S")
        };
        Promo[] promos = {
            new Promo("HEMAT10", "Diskon 10% min. belanja Rp100000", 10, 100000),
            new Promo("BIGDEAL", "Diskon 20% min. belanja Rp300000", 20, 300000)
        };
        Kasir kasir = new Kasir("K01", "Rina");
        Pelanggan budi = new Pelanggan("P01", "Budi", "0811111111");

        System.out.println("##### JADWAL FILM #####");
        for (int i = 0; i < jadwals.length; i++) {
            jadwals[i].tampilInfo();
        }
        System.out.println("\n##### MENU #####");
        for (int i = 0; i < produks.length; i++) {
            System.out.println(produks[i].getKategori() + " | " + produks[i].getNamaProduk()
                    + " | Rp" + Math.round(produks[i].hitungHarga())
                    + " | stok " + produks[i].getStok());
        }

        System.out.println("\n##### SIMULASI: Budi beli 2 tiket + makanan, bayar #####");
        Pesanan p1 = kasir.buatPesanan(budi);
        System.out.println("Tiket kursi 5 : " + (kasir.jualTiket(p1, jadwals[0], 5) ? "berhasil" : "gagal"));
        System.out.println("Tiket kursi 6 : " + (kasir.jualTiket(p1, jadwals[0], 6) ? "berhasil" : "gagal"));
        System.out.println("Popcorn Karamel x1: " + (kasir.tambahProdukKePesanan(p1, produks[1], 1) ? "berhasil" : "gagal"));
        System.out.println("Cola L x1 : " + (kasir.tambahProdukKePesanan(p1, produks[2], 1) ? "berhasil" : "gagal"));
        System.out.println("Cola x99 (stok tidak cukup): " + (kasir.tambahProdukKePesanan(p1, produks[2], 99) ? "berhasil" : "gagal"));
        System.out.println("Promo HEMAT10 : " + (kasir.terapkanPromo(p1, promos[0]) ? "diterapkan" : "tidak memenuhi syarat"));

        Pembayaran bayar1 = new PembayaranTunai("PAY-001", p1, 150000);
        if (kasir.prosesPembayaran(bayar1)) {
            System.out.println("Pembayaran " + bayar1.getMetode() + " berhasil. Kembalian: Rp"
                    + Math.round(((PembayaranTunai) bayar1).getKembalian()));
        }
        kasir.cetakStruk(p1);

    }
}
