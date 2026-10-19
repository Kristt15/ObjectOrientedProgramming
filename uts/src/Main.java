import model.*;

public class Main {
    public static void main(String[] args) {
        //film
        Film film1 = new Film("FLM-001", "The Last: Naruto the Movie", 112, "Animation, Action, Romance", "13+");
        Film film2 = new Film("FLM-002", "Exhuma", 134, "Horror, Mystery, Thriller", "17+");
        Film film3 = new Film("FLM-003", "Interstellar", 169, "Sci-Fi, Adventure, Drama", "13+");

        System.out.println("[1] DAFTAR FILM YANG SEDANG TAYANG:");
        System.out.println("    1. " + film1.getJudul() + " | Durasi: " + film1.getDurasi() + " mnt | Genre: " + film1.getGenre() + " | Rating: " + film1.getRating());
        System.out.println("    2. " + film2.getJudul() + " | Durasi: " + film2.getDurasi() + " mnt | Genre: " + film2.getGenre() + " | Rating: " + film2.getRating());
        System.out.println("    3. " + film3.getJudul() + " | Durasi: " + film3.getDurasi() + " mnt | Genre: " + film3.getGenre() + " | Rating: " + film3.getRating());
        System.out.println();

        //stdio n kursi
        Studio studio1 = new Studio("STD-01", "Studio 1 Regular");
        Studio studio2 = new Studio("STD-02", "Studio 2 Premiere");

        for (int i = 0; i < 6; i++) {
            char hurufBaris = (char) ('A' + i);
            for (int no = 1; no <= 14; no++) {
                String idKursi = studio1.getIdStudio() + "-" + hurufBaris + no;
                studio1.tambahKursi(new Kursi(idKursi, String.valueOf(hurufBaris), no));
            }
        }

        for (int i = 0; i < 4; i++) {
            char hurufBaris = (char) ('A' + i);
            for (int no = 1; no <= 8; no++) {
                String idKursi = studio2.getIdStudio() + "-" + hurufBaris + no;
                studio2.tambahKursi(new Kursi(idKursi, String.valueOf(hurufBaris), no));
            }
        }

        System.out.println("[2] DAFTAR STUDIO & LAYOUT KURSI (Komposisi - BR4):");
        System.out.println("    - " + studio1.getNamaStudio() + ": " + studio1.getJumlahKursi() + " kursi (Baris A-F, No 1-14)");
        System.out.println("    - " + studio2.getNamaStudio() + ": " + studio2.getJumlahKursi() + " kursi (Baris A-D, No 1-8)\n");

        //jadwal
        Jadwal jadwal1 = new Jadwal("JDW-01", "2026-10-20", "13:00", "15:00", 45000, film1, studio1);
        Jadwal jadwal2 = new Jadwal("JDW-02", "2026-10-20", "15:30", "17:45", 50000, film2, studio1);
        Jadwal jadwal3 = new Jadwal("JDW-03", "2026-10-21", "18:30", "21:20", 75000, film3, studio2);

        System.out.println("[3] JADWAL PENAYANGAN (Oktober 2026):");
        System.out.println("    1. [" + jadwal1.getIdJadwal() + "] " + jadwal1.getFilm().getJudul()
                + " | " + jadwal1.getTanggal() + " " + jadwal1.getJamMulai() + " di " + jadwal1.getStudio().getNamaStudio()
                + " | Rp " + jadwal1.getHarga());
        System.out.println("    2. [" + jadwal2.getIdJadwal() + "] " + jadwal2.getFilm().getJudul()
                + " | " + jadwal2.getTanggal() + " " + jadwal2.getJamMulai() + " di " + jadwal2.getStudio().getNamaStudio()
                + " | Rp " + jadwal2.getHarga());
        System.out.println("    3. [" + jadwal3.getIdJadwal() + "] " + jadwal3.getFilm().getJudul()
                + " | " + jadwal3.getTanggal() + " " + jadwal3.getJamMulai() + " di " + jadwal3.getStudio().getNamaStudio()
                + " | Rp " + jadwal3.getHarga());
        System.out.println();

        //produk n promo
        Produk caramelPopcorn = new Produk("PRD-01", "Caramel Popcorn (L)", 40000, 35);
        Produk saltyPopcorn = new Produk("PRD-02", "Salty Popcorn (M)", 30000, 25);
        Produk cocaCola = new Produk("PRD-03", "Coca-Cola (L)", 18000, 50);
        Produk pepsi = new Produk("PRD-04", "Pepsi Blue (L)", 18000, 40);

        Promo promoNobar = new Promo("NOBARSERU", 20000, "2026-10-31");

        System.out.println("[4] MENU MAKANAN / MINUMAN & PROMO:");
        System.out.println("    - " + caramelPopcorn.getNama() + " | Rp " + caramelPopcorn.getHarga() + " (Stok: " + caramelPopcorn.getStok() + ")");
        System.out.println("    - " + saltyPopcorn.getNama() + " | Rp " + saltyPopcorn.getHarga() + " (Stok: " + saltyPopcorn.getStok() + ")");
        System.out.println("    - " + cocaCola.getNama() + " | Rp " + cocaCola.getHarga() + " (Stok: " + cocaCola.getStok() + ")");
        System.out.println("    - " + pepsi.getNama() + " | Rp " + pepsi.getHarga() + " (Stok: " + pepsi.getStok() + ")");
        System.out.println("    - Kupon Promo: " + promoNobar.getKodePromo() + " (Diskon: Rp " + promoNobar.getPotongan() + ", Exp: " + promoNobar.getMasaBerlaku() + ")");
        System.out.println();

        //pengguna
        Pelanggan pelanggan1 = new Pelanggan("USR-01", "Bagus", "081234567890", "", "", "");
        Kasir kasir1 = new Kasir("KSR-01", "USR-02", "Dewi Lestari", "089876543210", "dewi@cinema.com", "Surabaya", "2000-08-20");

        System.out.println("[5] PENGGUNA TERLIBAT:");
        System.out.println("    Pelanggan : " + pelanggan1.getNamaLengkap());
        System.out.println("    Kasir     : " + kasir1.getNamaLengkap() + " [ID Kasir: " + kasir1.getIdKasir() + "]\n");

        //skenario
        System.out.println("[6] DENAH KURSI SEBELUM PEMESANAN (Semua Kursi Masih Kosong):");
        System.out.println("       ------------------ [ LAYAR BIOSKOP ] ------------------");
        String barisSaatIni1 = "";
        for (Kursi k : studio2.getDaftarKursi()) {
            if (!k.getBaris().equals(barisSaatIni1)) {
                if (!barisSaatIni1.isEmpty()) {
                    System.out.println();
                }
                barisSaatIni1 = k.getBaris();
                System.out.print("               ");
            }
            boolean kosong = false;
            for (Kursi ks : jadwal3.getKursiTersedia()) {
                if (ks.getIdKursi().equals(k.getIdKursi())) {
                    kosong = true;
                    break;
                }
            }
            if (kosong) {
                System.out.printf("[%2s] ", k.toString());
            } else {
                System.out.print("[XX] ");
            }
        }
        System.out.println("\n       -------------------------------------------------------");
        System.out.println("       Keterangan: [XX] = Terisi");

        System.out.println("\n[7] PELANGGAN MEMBUAT PESANAN:");
        Pesanan pesanan = pelanggan1.buatPesanan();
        pesanan.setJadwal(jadwal3);

        pesanan.tambahKursi("B3", "B4");

        // Menambah menu F&B: 1 Caramel Popcorn & 2 Pepsi Blue
        pesanan.tambahDetailPesanan(new DetailPesanan(caramelPopcorn, 1));
        pesanan.tambahDetailPesanan(new DetailPesanan(pepsi, 2));

        System.out.println("    ID Pesanan  : " + pesanan.getIdPesanan());
        System.out.println("    Film Dipilih: " + jadwal3.getFilm().getJudul() + " (" + studio2.getNamaStudio() + ")");
        System.out.println("    Kursi       : B3, B4 (2 tiket x Rp " + jadwal3.getHarga() + ")");
        System.out.println("    F&B         : 1x " + caramelPopcorn.getNama() + ", 2x " + pepsi.getNama());
        System.out.println("    Grand Total : Rp " + pesanan.hitungTotal() + "\n");

        // Kasir memproses pesanan
        kasir1.prosesPesanan(pesanan);
        System.out.println("    Status      : " + pesanan.getStatus() + "\n");

        //pembayaran
        System.out.println("[8] PROSES PEMBAYARAN & PENERBITAN TIKET:");
        Pembayaran pembayaran = new Pembayaran("BYR-2026-001", "QRIS", pesanan);
        int totalSetelahDiskon = pembayaran.hitungTotalBayar(promoNobar);

        System.out.println("    Metode       : " + pembayaran.getMetode());
        System.out.println("    Kupon Promo  : " + promoNobar.getKodePromo() + " (Potongan Rp " + promoNobar.getPotongan() + ")");
        System.out.println("    Total Bayar  : Rp " + totalSetelahDiskon + "\n");

        // Konfirmasi pembayaran -> men-trigger penerbitan tiket dan pemotongan stok F&B
        pembayaran.konfirmasiPembayaran();
        System.out.println("    Status Bayar : " + pembayaran.getStatus());
        System.out.println("    Tanggal Bayar: " + pembayaran.getTanggalBayar());
        System.out.println("    Status Order : " + pesanan.getStatus());
        System.out.println("    Sisa Popcorn : " + caramelPopcorn.getStok() + " (stok terpotong)");
        System.out.println("    Sisa Pepsi   : " + pepsi.getStok() + " (stok terpotong)\n");

        System.out.println("[9] TIKET RESMI YANG DITERBITKAN:");
        for (Tiket t : pembayaran.getDaftarTiket()) {
            System.out.println("    [TIKET RESMI] ID: " + t.getIdTiket() +
                    " | Film: " + t.getJadwal().getFilm().getJudul() +
                    " | Studio: " + t.getJadwal().getStudio().getNamaStudio() +
                    " | Kursi: " + t.getKursi() +
                    " | Status: " + t.getStatus());
        }

        System.out.println("\n[10] DENAH KURSI SETELAH TIKET TERBIT (Kursi B3 & B4 Bertanda [XX]):");
        System.out.println("       ------------------ [ LAYAR BIOSKOP ] ------------------");
        String barisSaatIni2 = "";
        for (Kursi k : studio2.getDaftarKursi()) {
            if (!k.getBaris().equals(barisSaatIni2)) {
                if (!barisSaatIni2.isEmpty()) {
                    System.out.println();
                }
                barisSaatIni2 = k.getBaris();
                System.out.print("               ");
            }
            boolean kosong = false;
            for (Kursi ks : jadwal3.getKursiTersedia()) {
                if (ks.getIdKursi().equals(k.getIdKursi())) {
                    kosong = true;
                    break;
                }
            }
            if (kosong) {
                System.out.printf("[%2s] ", k.toString());
            } else {
                System.out.print("[XX] ");
            }
        }
        System.out.println("\n       -------------------------------------------------------");
        System.out.println("       Keterangan: [XX] = Terisi");
    }
}
