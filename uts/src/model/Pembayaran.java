package model;

public class Pembayaran {
    // atribut
    private String idPembayaran;
    private String metode;
    private int totalBayar;
    private String status;
    private String tanggalBayar;
    private Pesanan pesanan;
    private Promo promo;
    private Tiket[] daftarTiket;
    private int jumlahTiket;

    // constructor
    public Pembayaran(String idPembayaran, String metode, Pesanan pesanan) {
        if (pesanan == null) {
            throw new IllegalArgumentException("Pesanan tidak boleh null!");
        }
        this.idPembayaran = idPembayaran;
        this.metode = metode;
        this.pesanan = pesanan;
        this.status = "MENUNGGU";
        this.tanggalBayar = "-";
        this.totalBayar = pesanan.hitungTotal();
        this.daftarTiket = new Tiket[20];
        this.jumlahTiket = 0;
        this.pesanan.setPembayaran(this);
    }

    // getter n setter
    public String getIdPembayaran() {
        return idPembayaran; 
    }
    public String getMetode() { 
        return metode; 
    }
    public int getTotalBayar() { 
        return totalBayar; 
    }
    public String getStatus() { 
        return status; 
    }
    public String getTanggalBayar() { 
        return tanggalBayar; 
    }
    public Pesanan getPesanan() { 
        return pesanan; 
    }
    public Promo getPromo() { 
        return promo; 
    }

    public Tiket[] getDaftarTiket() {
        Tiket[] hasil = new Tiket[jumlahTiket];
        for (int i = 0; i < jumlahTiket; i++) {
            hasil[i] = daftarTiket[i];
        }
        return hasil;
    }

    public void setStatusInternal(String status) { this.status = status; }

    // method
    public int hitungTotalBayar(Promo promo) {
        int baseTotal = pesanan.hitungTotal();
        this.promo = promo;
        if (promo != null && promo.isMasihBerlaku()) {
            this.totalBayar = Math.max(0, baseTotal - promo.getPotongan());
        } else {
            this.totalBayar = baseTotal;
        }
        return this.totalBayar;
    }

    public void konfirmasiPembayaran() {
        if ("LUNAS".equalsIgnoreCase(this.status)) {
            System.out.println("Pembayaran sudah lunas sebelumnya.");
            return;
        }
        this.status = "LUNAS";
        this.tanggalBayar = "2026-10-20";
        this.pesanan.setStatusInternal("SELESAI");

        for (DetailPesanan detail : pesanan.getDaftarDetail()) {
            detail.getProduk().kurangiStok(detail.getJumlah());
        }

        Jadwal jadwal = pesanan.getJadwal();
        if (jadwal != null) {
            int noTiket = 1;
            for (Kursi kursi : pesanan.getDaftarKursiDipesan()) {
                String idTiket = "TKT-" + pesanan.getIdPesanan() + "-" + (noTiket++);
                Tiket tiket = new Tiket(idTiket, "AKTIF", kursi, jadwal);
                jadwal.tambahTiket(tiket);

                if (jumlahTiket == daftarTiket.length) {
                    Tiket[] temp = new Tiket[daftarTiket.length * 2];
                    for (int i = 0; i < daftarTiket.length; i++) {
                        temp[i] = daftarTiket[i];
                    }
                    daftarTiket = temp;
                }
                daftarTiket[jumlahTiket++] = tiket;
            }
        }
        System.out.println("Pembayaran berhasil dikonfirmasi! " + jumlahTiket + " tiket telah diterbitkan.");
    }
}
