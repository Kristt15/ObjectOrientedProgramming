public class KomidiPutar {
    String kode;
    String nama;
    int kapasitas;
    double hargaTiket;
    int jumlahPenumpang;

    public KomidiPutar(String kode, String nama, int kapasitas, double hargaTiket, int jumlahPenumpang) {
        this.kode = kode;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.hargaTiket = hargaTiket;
    
        if (jumlahPenumpang <= kapasitas) {
            this.jumlahPenumpang = jumlahPenumpang;
        } else {
            this.jumlahPenumpang = kapasitas;
            System.out.println("Penumpang " + nama + " melebihi batas Dibatasi ke " + kapasitas + " orang.");
        }
    }
    public String cekKapasitas() {
        if (this.jumlahPenumpang >= this.kapasitas) {
            return "PENUH";
        } else {
            return "TERSEDIA";
        }
    }

 
    public double hitungPendapatan() {
        return this.jumlahPenumpang * this.hargaTiket;
    }


    public void infoWahana() {
        System.out.println("Kode: " + this.kode + "\nNama: " + this.nama);
        System.out.println("Penumpang: " + this.jumlahPenumpang + "/" + this.kapasitas);
        System.out.println("Status: " + cekKapasitas());
        System.out.println("Pendapatan: Rp " + hitungPendapatan());
        System.out.println("----------------------------------------");
    }
}

public class TesKomidiPutar {
    public static void main(String[] args) {
 
        KomidiPutar[] daftarWahana = new KomidiPutar[5];
        daftarWahana[0] = new KomidiPutar("KP-01", "Kuda Poni Magical", 20, 15000, 20); 
        daftarWahana[1] = new KomidiPutar("KP-02", "Naga Terbang", 30, 25000, 15);    
        daftarWahana[2] = new KomidiPutar("KP-03", "Korsel Klasik", 25, 20000, 25);    
        daftarWahana[3] = new KomidiPutar("KP-04", "Pegasus Bintang", 15, 10000, 10);  
        daftarWahana[4] = new KomidiPutar("KP-05", "Unicorn Emas", 40, 30000, 40);     

        int totalWahanaPenuh = 0;
        System.out.println("=== LAPORAN OPERASIONAL KOMIDI PUTAR ===\n");

        for (KomidiPutar wahana : daftarWahana) {
                       wahana.infoWahana(); 
                        if (wahana.cekKapasitas().equals("PENUH")) {
                totalWahanaPenuh++;
            }
        }
        System.out.println(" TOTAL WAHANA YANG SEDANG PENUH : " + totalWahanaPenuh + " WAHANA ");
    }
}