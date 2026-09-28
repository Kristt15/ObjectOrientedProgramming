public class Mahasiswaa {
    public int nrp;
    public String nama;
 
    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
 
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(123, "Budi");
 
        // Atribut bisa diakses dan diubah langsung dari luar class
        System.out.println("NRP  : " + mhs.nrp);
        System.out.println("Nama : " + mhs.nama);
        mhs.nrp = -999; // tidak ada validasi, data bisa diubah sembarangan
        System.out.println("NRP setelah diubah langsung: " + mhs.nrp);
    }
}