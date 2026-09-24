package W7.perbankan;

public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;
 
    public Bank(){
        nasabah = new Nasabah[100];
        jumlahNasabah = 0;
    }
 
    public void tambahNasabah(String namaAwal, String namaAkhir){
        nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        jumlahNasabah++;
    }
 
    public int getJumlahNasabah(){
        return jumlahNasabah;
    }
 
    public Nasabah getNasabah(int indeks){
        return nasabah[indeks];
    }
}
