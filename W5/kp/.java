public class Main {
    public static void main(String[] args) {

        // Array untuk menyimpan 5 object KomidiPutar
        KomidiPutar[] daftarWahana = new KomidiPutar[5];

        // Membuat 5 object dengan data berbeda
        daftarWahana[0] = new KomidiPutar(
                "K01", "Komidi Putar 01", 10, 5000, 100000000);

        daftarWahana[1] = new KomidiPutar(
                "K02", "Komidi Putar 02", 12, 5000, 10000000);

        daftarWahana[2] = new KomidiPutar(
                "K03", "Komidi Putar 03", 15, 7000, 20000000);

        daftarWahana[3] = new KomidiPutar(
                "K04", "Komidi Putar 04", 10, 5000, 20000000);

        daftarWahana[4] = new KomidiPutar(
                "K05", "Komidi Putar 05", 20, 7000, 20000000);

        // Perulangan untuk memproses seluruh object
        for (int i = 0; i < daftarWahana.length; i++) {

            System.out.println("=================================");

            daftarWahana[i].infoWahana();

            System.out.println("Pendapatan       : Rp"
                    + daftarWahana[i].hitungPendapatan());

            daftarWahana[i].cekKapasitas();
        }
    }
}
