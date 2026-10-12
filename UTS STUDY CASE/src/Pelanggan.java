public class Pelanggan {
    private static final int MAKS_TIKET = 10;

    private String idPelanggan;
    private String nama;
    private String noHp;
    private Tiket[] daftarTiket;
    private int jumlahTiket;

    public Pelanggan(String idPelanggan, String nama, String noHp) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noHp = noHp;
        this.daftarTiket = new Tiket[MAKS_TIKET];
        this.jumlahTiket = 0;
    }

    public String getIdPelanggan() { return idPelanggan; }
    public String getNama() { return nama; }
    public String getNoHp() { return noHp; }
    public int getJumlahTiket() { return jumlahTiket; }

    public boolean isRiwayatPenuh() {
        return jumlahTiket >= daftarTiket.length;
    }

    public boolean tambahTiket(Tiket tiket) {
        if (tiket == null || isRiwayatPenuh()) {
            return false;
        }
        daftarTiket[jumlahTiket] = tiket;
        jumlahTiket++;
        return true;
    }

    public void tampilRiwayatTiket() {
        System.out.println("Riwayat tiket " + nama + " (" + jumlahTiket + " tiket):");
        if (jumlahTiket == 0) {
            System.out.println("  (belum ada tiket)");
        }
        for (int i = 0; i < jumlahTiket; i++) {
            System.out.println("  " + (i + 1) + ". " + daftarTiket[i].getInfoTiket());
        }
    }
}
