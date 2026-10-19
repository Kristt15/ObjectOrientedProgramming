package model;

public class Pesanan {
    // atribut
    private String idPesanan;
    private String tanggalPesan;
    private int grandTotalHarga;
    private String status;

    // relasi
    private Pelanggan pelanggan;
    private Kasir kasir;
    private Jadwal jadwal;
    private Kursi[] daftarKursiDipesan;
    private int jumlahKursiDipesan;
    private DetailPesanan[] daftarDetail;
    private int jumlahDetail;
    private Pembayaran pembayaran;

    // constructor
    public Pesanan(String idPesanan, String tanggalPesan, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.tanggalPesan = tanggalPesan;
        this.pelanggan = pelanggan;
        this.status = "MENUNGGU";
        this.grandTotalHarga = 0;
        this.daftarKursiDipesan = new Kursi[20];
        this.jumlahKursiDipesan = 0;
        this.daftarDetail = new DetailPesanan[20];
        this.jumlahDetail = 0;
    }

    // getter n setter
    public String getIdPesanan() { return idPesanan; }
    public String getTanggalPesan() { return tanggalPesan; }
    public int getGrandTotalHarga() { return grandTotalHarga; }
    public String getStatus() { return status; }
    public Pelanggan getPelanggan() { return pelanggan; }
    public Kasir getKasir() { return kasir; }
    public void setKasir(Kasir kasir) { this.kasir = kasir; }
    public Jadwal getJadwal() { return jadwal; }
    public void setJadwal(Jadwal jadwal) { this.jadwal = jadwal; }
    public Pembayaran getPembayaran() { return pembayaran; }
    public void setPembayaran(Pembayaran pembayaran) { this.pembayaran = pembayaran; }
    public void setStatusInternal(String status) { this.status = status; }

    public Kursi[] getDaftarKursiDipesan() {
        Kursi[] hasil = new Kursi[jumlahKursiDipesan];
        for (int i = 0; i < jumlahKursiDipesan; i++) {
            hasil[i] = daftarKursiDipesan[i];
        }
        return hasil;
    }

    public DetailPesanan[] getDaftarDetail() {
        DetailPesanan[] hasil = new DetailPesanan[jumlahDetail];
        for (int i = 0; i < jumlahDetail; i++) {
            hasil[i] = daftarDetail[i];
        }
        return hasil;
    }

    // method (bentuk 1: objek Kursi)
    public void tambahKursi(Kursi kursi) {
        if (kursi != null) {
            for (int i = 0; i < jumlahKursiDipesan; i++) {
                if (daftarKursiDipesan[i].equals(kursi)) {
                    return;
                }
            }
            if (jumlahKursiDipesan == daftarKursiDipesan.length) {
                Kursi[] temp = new Kursi[daftarKursiDipesan.length * 2];
                for (int i = 0; i < daftarKursiDipesan.length; i++) {
                    temp[i] = daftarKursiDipesan[i];
                }
                daftarKursiDipesan = temp;
            }
            daftarKursiDipesan[jumlahKursiDipesan++] = kursi;
        }
    }

    // method overloading (polymorphism bentuk 2: kode String langsung "B3", "B4")
    public void tambahKursi(String... daftarKodeKursi) {
        if (this.jadwal == null || this.jadwal.getStudio() == null || daftarKodeKursi == null) {
            return;
        }
        Studio studio = this.jadwal.getStudio();
        for (String kode : daftarKodeKursi) {
            if (kode == null || kode.length() < 2) continue;
            String baris = kode.substring(0, 1).toUpperCase();
            int nomor = Integer.parseInt(kode.substring(1));

            for (Kursi k : studio.getDaftarKursi()) {
                if (k.getBaris().equalsIgnoreCase(baris) && k.getNomor() == nomor) {
                    tambahKursi(k);
                    break;
                }
            }
        }
    }

    public void tambahDetailPesanan(DetailPesanan detail) {
        if (detail != null) {
            if (jumlahDetail == daftarDetail.length) {
                DetailPesanan[] temp = new DetailPesanan[daftarDetail.length * 2];
                for (int i = 0; i < daftarDetail.length; i++) {
                    temp[i] = daftarDetail[i];
                }
                daftarDetail = temp;
            }
            daftarDetail[jumlahDetail++] = detail;
        }
    }

    public int hitungTotal() {
        int total = 0;
        for (int i = 0; i < jumlahDetail; i++) {
            total += daftarDetail[i].hitungSubTotal();
        }
        if (jadwal != null && jumlahKursiDipesan > 0) {
            total += jumlahKursiDipesan * jadwal.getHarga();
        }
        this.grandTotalHarga = total;
        return this.grandTotalHarga;
    }

    public void batalPesanan() {
        if ("SELESAI".equalsIgnoreCase(this.status)) {
            throw new IllegalStateException("Pesanan yang sudah selesai tidak dapat dibatalkan!");
        }
        this.status = "BATAL";
        if (this.pembayaran != null && !"LUNAS".equalsIgnoreCase(this.pembayaran.getStatus())) {
            this.pembayaran.setStatusInternal("BATAL");
        }
        System.out.println("Pesanan " + idPesanan + " berhasil dibatalkan.");
    }
}
