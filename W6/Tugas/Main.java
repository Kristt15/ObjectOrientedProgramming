public class Main {
    public static void main(String args[]) {
        Perpustakaan perpus = new Perpustakaan("Perpustakaan PENS");

        Buku buku1 = new Buku("Belajar Java", "Andi", 5, "Pemrograman");
        Buku buku2 = new Buku("Basis Data", "Budi", 3, "Database");

        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);

        perpus.tampilkanSemuaBuku();

        Anggota anggota1 = new Anggota("Katy", "A001");
        Buku bukuDicari = perpus.cariBuku("Belajar Java");

        if (bukuDicari != null) {
            boolean berhasilPinjam = anggota1.pinjamBuku(bukuDicari);
            System.out.println("Pinjam berhasil : " + berhasilPinjam);
        }
    }
}