public class Tugas5 {
    public static void main(String args[]) {
        String kalimat = "Praktikum di laboratorium Database";
        String kataDiganti = "laboratorium";
        String kataPengganti = "Ruang";

        String hasil = kalimat.replace(kataDiganti, kataPengganti);

        System.out.println("Kalimat utama menjadi : " + hasil);
    }
}