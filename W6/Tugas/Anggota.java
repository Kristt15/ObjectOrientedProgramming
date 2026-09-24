public class Anggota {
    public String nama;
    public String idAnggota;
    private int jumlahPinjam;
    protected String status;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.jumlahPinjam = 0;
        this.status = "Aktif";
    }

    public boolean pinjamBuku(Buku buku) {
        boolean berhasil = buku.kurangiStok(1);
        if (berhasil) {
            tambahJumlahPinjam();
        }
        return berhasil;
    }

    public void kembalikanBuku(Buku buku) {
        System.out.println(nama + " mengembalikan buku : " + buku.judul);
        jumlahPinjam = jumlahPinjam - 1;
    }

    private void tambahJumlahPinjam() {
        jumlahPinjam = jumlahPinjam + 1;
    }

    String getStatus() {
        return status;
    }
}