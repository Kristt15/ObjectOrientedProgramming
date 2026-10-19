package model;

public class Pelanggan extends Pengguna {
    // constructor
    public Pelanggan(String idPengguna, String namaLengkap, String noHP, String email, String alamat, String tanggalLahir) {
        super(idPengguna, namaLengkap, noHP, email, alamat, tanggalLahir);
    }

    // method
    public Pesanan buatPesanan() {
        String idPesanan = "PSN-" + System.currentTimeMillis();
        return new Pesanan(idPesanan, "2026-10-20", this);
    }
}
