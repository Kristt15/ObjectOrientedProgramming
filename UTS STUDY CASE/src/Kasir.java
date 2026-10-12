public class Kasir {
    private String idKasir;
    private String namaKasir;
    private int counterPesanan;
    private int counterTiket;

    public Kasir(String idKasir, String namaKasir) {
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
        this.counterPesanan = 0;
        this.counterTiket = 0;
    }

    public String getIdKasir() { return idKasir; }
    public String getNamaKasir() { return namaKasir; }

    public Pesanan buatPesanan(Pelanggan pelanggan) {
        counterPesanan++;
        return new Pesanan(String.format("PSN-%03d", counterPesanan), pelanggan);
    }

    public boolean jualTiket(Pesanan pesanan, Jadwal jadwal, int nomorKursi) {
        if (pesanan.isLunas() || pesanan.isTiketPenuh() || pesanan.getPelanggan().isRiwayatPenuh()) {
            return false;
        }
        if (!jadwal.pesanKursi(nomorKursi)) { // false jika kursi terisi / tidak valid
            return false;
        }
        counterTiket++;
        Tiket tiket = new Tiket(String.format("TKT-%03d", counterTiket), jadwal, nomorKursi);
        pesanan.tambahTiket(tiket);
        pesanan.getPelanggan().tambahTiket(tiket);
        return true;
    }

    public boolean tambahProdukKePesanan(Pesanan pesanan, Produk produk, int jumlah) {
        if (!pesanan.tambahProduk(produk, jumlah)) {
            return false;
        }
        return produk.kurangiStok(jumlah);
    }

    public boolean terapkanPromo(Pesanan pesanan, Promo promo) {
        if (promo == null || !promo.isBerlaku(pesanan.hitungSubtotal())) {
            return false;
        }
        pesanan.setPromo(promo);
        return true;
    }

    public boolean prosesPembayaran(Pembayaran pembayaran) {
        Pesanan pesanan = pembayaran.getPesanan();
        if (pesanan.isLunas()) {
            return false;
        }
        boolean berhasil = pembayaran.proses(); // polymorphism
        if (berhasil) {
            pesanan.setLunas();
        }
        return berhasil;
    }

    public void cetakStruk(Pesanan pesanan) {
        System.out.println("==========================================");
        System.out.println("              BIOSKOP 212");
        System.out.println("==========================================");
        System.out.println("Pesanan  : " + pesanan.getIdPesanan());
        System.out.println("Kasir    : " + namaKasir);
        System.out.println("Pelanggan: " + pesanan.getPelanggan().getNama());
        System.out.println("------------------------------------------");
        for (int i = 0; i < pesanan.getJumlahTiket(); i++) {
            System.out.println("Tiket " + pesanan.getTiket(i).getInfoTiket());
        }
        for (int i = 0; i < pesanan.getJumlahJenisProduk(); i++) {
            Produk p = pesanan.getProduk(i);
            int qty = pesanan.getQtyProduk(i);
            System.out.println(p.getKategori() + " " + p.getNamaProduk() + " x" + qty
                    + " = Rp" + Math.round(p.hitungHarga() * qty));
        }
        System.out.println("------------------------------------------");
        System.out.println("Subtotal : Rp" + Math.round(pesanan.hitungSubtotal()));
        if (pesanan.getPromo() != null) {
            System.out.println("Diskon (" + pesanan.getPromo().getKodePromo() + "): -Rp"
                    + Math.round(pesanan.hitungDiskon()));
        }
        System.out.println("TOTAL    : Rp" + Math.round(pesanan.hitungTotal()));
        System.out.println("Status   : " + pesanan.getStatus());
        System.out.println("==========================================");
    }
}
