public class Mobil { 
private String merk; 
private String warna; 
private String tipe; 
    private int kapasitasMesin; 
    private int kapasitasPenumpang; 
 
    public Mobil(String merk, String warna, String tipe, int kapasitasMesin, int kapasitasPenumpang) { 
        this.merk = merk; 
        this.warna = warna; 
        this.tipe = tipe; 
        this.kapasitasMesin = kapasitasMesin; 
        this.kapasitasPenumpang = kapasitasPenumpang; 
    } 
 
    public void infoMobil() { 
        System.out.println("Merk                : " + merk); 
        System.out.println("Warna               : " + warna); 
        System.out.println("Tipe                : " + tipe); 
        System.out.println("Kapasitas Mesin     : " + kapasitasMesin + " cc"); 
        System.out.println("Kapasitas Penumpang : " + kapasitasPenumpang + " orang"); 
        System.out.println("----------------------------------------"); 
    } 
} 