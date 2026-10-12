public class Tiket {
    private String kodeTiket;
    private Jadwal jadwal;
    private int nomorKursi;
    private double harga;

    public Tiket(String kodeTiket, Jadwal jadwal, int nomorKursi) {
        this.kodeTiket = kodeTiket;
        this.jadwal = jadwal;
        this.nomorKursi = nomorKursi;
        this.harga = jadwal.getHargaTiket(); // harga dikunci saat tiket dibuat
    }

    public String getKodeTiket() { return kodeTiket; }
    public Jadwal getJadwal() { return jadwal; }
    public int getNomorKursi() { return nomorKursi; }
    public double getHarga() { return harga; }

    public String getInfoTiket() {
        return kodeTiket + " | " + jadwal.getFilm().getJudul()
                + " | " + jadwal.getStudio().getNamaStudio()
                + " | " + jadwal.getTanggal() + " " + jadwal.getJamMulai()
                + " | Kursi " + nomorKursi
                + " | Rp" + Math.round(harga);
    }
}
