public class Perpustakaan {
    public String namaPerpustakaan;
    private Buku[] daftarBuku;
    private Anggota[] daftarAnggota;
    private int jumlahBukuSaatIni;

    public Perpustakaan(String nama) {
        this.namaPerpustakaan = nama;
        this.daftarBuku = new Buku[100];
        this.daftarAnggota = new Anggota[100];
        this.jumlahBukuSaatIni = 0;
    }

    public void tambahBuku(Buku buku) {
        daftarBuku[jumlahBukuSaatIni] = buku;
        jumlahBukuSaatIni = jumlahBukuSaatIni + 1;
    }

    public Buku cariBuku(String judul) {
        for (int i = 0; i < jumlahBukuSaatIni; i++) {
            if (daftarBuku[i].judul.equals(judul)) {
                return daftarBuku[i];
            }
        }
        return null;
    }

    private int hitungTotalBuku() {
        return jumlahBukuSaatIni;
    }

    public void tampilkanSemuaBuku() {
        System.out.println("Total buku di " + namaPerpustakaan + " : " + hitungTotalBuku());
        for (int i = 0; i < jumlahBukuSaatIni; i++) {
            daftarBuku[i].tampilkanInfo();
            System.out.println("---");
        }
    }
}