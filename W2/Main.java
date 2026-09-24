public class Main {
    public static void main(String[] args) {
        Siswa s = new Siswa();

        s.nrp = 2024001;
        s.nama = "Budi";

        s.info();

        System.out.println("NRP: " + s.nrp);
        System.out.println("Nama: " + s.nama);
    }
}