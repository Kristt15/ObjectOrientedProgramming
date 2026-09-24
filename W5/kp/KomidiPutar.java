public class KomidiPutar {
    // Atribut
    String kode;
    String nama;
    int kapasitas;
    double hargaTiket;
    int jumlahPenumpang;

    // Constructor
    KomidiPutar(String kode, String nama, int kapasitas,
                double hargaTiket, int jumlahPenumpang) {
        this.kode = kode;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.hargaTiket = hargaTiket;
        this.jumlahPenumpang = jumlahPenumpang;
    }

    // Method menampilkan informasi wahana
    void infoWahana() {
        System.out.println("Kode             : " + kode);
        System.out.println("Nama             : " + nama);
        System.out.println("Kapasitas        : " + kapasitas);
        System.out.println("Harga Tiket      : Rp" + hargaTiket);
        System.out.println("Jumlah Penumpang : " + jumlahPenumpang);
    }

    // Method menghitung pendapatan
    double hitungPendapatan() {
        return hargaTiket * jumlahPenumpang;
    }

    // Method mengecek kapasitas
    void cekKapasitas() {
        if (jumlahPenumpang > kapasitas) {
            System.out.println("Status           : MELEBIHI KAPASITAS");
        }
        else if (jumlahPenumpang >= kapasitas) {
            System.out.println("Status           : PENUH");
        } else {
            System.out.println("Status           : TERSEDIA");
        }
    }
}