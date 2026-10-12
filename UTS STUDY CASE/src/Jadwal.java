public class Jadwal {
    private String idJadwal;
    private Film film;
    private Studio studio;
    private String tanggal;
    private String jamMulai;
    private double hargaTiket;
    private boolean[] kursiTerisi; // index 0 = kursi nomor 1

    public Jadwal(String idJadwal, Film film, Studio studio, String tanggal, String jamMulai, double hargaTiket) {
        this.idJadwal = idJadwal;
        this.film = film;
        this.studio = studio;
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        if (hargaTiket < 0) {
            throw new IllegalArgumentException("Harga tiket tidak boleh negatif");
        }
        this.hargaTiket = hargaTiket;
        this.kursiTerisi = new boolean[studio.getKapasitas()];
    }

    public String getIdJadwal() { return idJadwal; }
    public Film getFilm() { return film; }
    public Studio getStudio() { return studio; }
    public String getTanggal() { return tanggal; }
    public String getJamMulai() { return jamMulai; }
    public double getHargaTiket() { return hargaTiket; }

    public boolean isKursiTersedia(int nomorKursi) {
        if (nomorKursi < 1 || nomorKursi > kursiTerisi.length) {
            return false;
        }
        return !kursiTerisi[nomorKursi - 1];
    }

    public boolean pesanKursi(int nomorKursi) {
        if (!isKursiTersedia(nomorKursi)) {
            return false;
        }
        kursiTerisi[nomorKursi - 1] = true;
        return true;
    }

    public int getSisaKursi() {
        int sisa = 0;
        for (int i = 0; i < kursiTerisi.length; i++) {
            if (!kursiTerisi[i]) {
                sisa++;
            }
        }
        return sisa;
    }

    public void tampilInfo() {
        System.out.println("[" + idJadwal + "] " + film.getJudul()
                + " | " + studio.getNamaStudio() + " (" + studio.getTipe() + ")"
                + " | " + tanggal + " " + jamMulai
                + " | Rp" + Math.round(hargaTiket)
                + " | Sisa kursi: " + getSisaKursi() + "/" + studio.getKapasitas());
    }
}
