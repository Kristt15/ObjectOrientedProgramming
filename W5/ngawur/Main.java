class BomBomCar {
    String kode;
    String nama;
    int kapasitas;
    double hargaTiket;
    int jumlahPenumpang;
        
    public BomBomCar(String kode, String nama, int kapasitas, double hargaTiket, int jumlahPenumpang) {
        this.kode = kode;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.hargaTiket = hargaTiket;
        this.jumlahPenumpang = jumlahPenumpang;
    }
        
    public double hitungPendapatan() {
        return jumlahPenumpang * hargaTiket;
    }
        
    public String cekKapasitas() {
        if (jumlahPenumpang >= kapasitas) {
            return "PENUH";
        } else {
            return "TERSEDIA";
        }
    }
        
        
    public void infoWahana() {
        System.out.println("Kode Wahana    : " + kode);
        System.out.println("Nama Wahana    : " + nama);
        System.out.println("Harga Tiket    : Rp " + hargaTiket);
        System.out.println("Kapasitas      : " + kapasitas + " orang");
        System.out.println("Penumpang      : " + jumlahPenumpang + " orang");
        System.out.println("Pendapatan     : Rp " + hitungPendapatan());
        System.out.println("Status         : " + cekKapasitas());
        System.out.println("---------------------------------");
    }
}
        
public class Main {
    public static void main(String[] args) {
        BomBomCar[] daftarArena = new BomBomCar[5];

        daftarArena[0] = new BomBomCar("BBC-01", "Bom-Bom Car Anak", 15, 10000, 0);
        daftarArena[1] = new BomBomCar("BBC-02", "Bom-Bom Car Reguler A", 20, 15000, 19);
        daftarArena[2] = new BomBomCar("BBC-03", "Bom-Bom Car Reguler B", 20, 15000, 20);
        daftarArena[3] = new BomBomCar("BBC-04", "Bom-Bom Car VIP", 10, 25000, 100);
        daftarArena[4] = new BomBomCar("BBC-05", "Bom-Bom Car Extreme", 12, 20000, 1000);
     
        System.out.println("=== DATA SELURUH WAHANA BOM-BOM CAR ===\n");

        for (int i = 0; i < daftarArena.length; i++) {
            daftarArena[i].infoWahana();
        }

        BomBomCar arenaSepi = daftarArena[0];
        for (int i = 1; i < daftarArena.length; i++) {
            if (daftarArena[i].jumlahPenumpang < arenaSepi.jumlahPenumpang) {
arenaSepi = daftarArena[i];
            }
        }
        
        System.out.println("\n=== LAPORAN KHUSUS ===");
        System.out.println("Wahana dengan jumlah penumpang paling sedikit:");
        System.out.println("- Nama Wahana : " + arenaSepi.nama);
        System.out.println("- Penumpang   : " + arenaSepi.jumlahPenumpang + " orang");
 
}}