public class Mahasiswa {
    private int nrp;
    private String nama;
 
    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
 
    public int getNrp() {
        return nrp;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNrp(int nrp) {
        this.nrp = nrp;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(123, "Budi");
 
        System.out.println("NRP  : " + mhs.getNrp());
        System.out.println("Nama : " + mhs.getNama());
 
        mhs.setNrp(456);
        mhs.setNama("Andi");
        System.out.println("NRP  : " + mhs.getNrp());
        System.out.println("Nama : " + mhs.getNama());
    }
}