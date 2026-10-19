package model;

public class Jadwal {
    // atribut
    private String idJadwal;
    private String tanggal;
    private String jamMulai;
    private String jamSelesai;
    private int harga;
    private Film film;
    private Studio studio;
    private Tiket[] daftarTiket;
    private int jumlahTiket;

    // constructor
    public Jadwal(String idJadwal, String tanggal, String jamMulai, String jamSelesai, int harga, Film film, Studio studio) {
        this.idJadwal = idJadwal;
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.harga = harga;
        this.film = film;
        this.studio = studio;
        this.daftarTiket = new Tiket[100];
        this.jumlahTiket = 0;
    }

    // getter
    public String getIdJadwal() { 
        return idJadwal; 
    }

    public String getTanggal() { 
        return tanggal; 
    }
    
    public String getJamMulai() { 
        return jamMulai; 
    }
    
    public String getJamSelesai() { 
        return jamSelesai; 
    }
    
    public int getHarga() { 
        return harga; 
    }
    
    public Film getFilm() { 
        return film; 
    }
    
    public Studio getStudio() { 
        return studio; 
    }

    // method
    public void tambahTiket(Tiket tiket) {
        if (tiket == null) return;
        for (int i = 0; i < jumlahTiket; i++) {
            Tiket t = daftarTiket[i];
            if ("AKTIF".equalsIgnoreCase(t.getStatus()) && t.getKursi().equals(tiket.getKursi())) {
                throw new IllegalStateException("Kursi " + tiket.getKursi() + " sudah memiliki tiket aktif pada jadwal ini (BR2)!");
            }
        }
        if (jumlahTiket == daftarTiket.length) {
            Tiket[] temp = new Tiket[daftarTiket.length * 2];
            for (int i = 0; i < daftarTiket.length; i++) {
                temp[i] = daftarTiket[i];
            }
            daftarTiket = temp;
        }
        daftarTiket[jumlahTiket++] = tiket;
    }

    public Kursi[] getKursiTersedia() {
        if (studio == null) return new Kursi[0];
        Kursi[] semuaKursi = studio.getDaftarKursi();

        boolean[] terisi = new boolean[semuaKursi.length];
        int countKosong = 0;

        for (int i = 0; i < semuaKursi.length; i++) {
            for (int j = 0; j < jumlahTiket; j++) {
                Tiket t = daftarTiket[j];
                if ("AKTIF".equalsIgnoreCase(t.getStatus()) &&
                    t.getKursi().getIdKursi().equals(semuaKursi[i].getIdKursi())) {
                    terisi[i] = true;
                    break;
                }
            }
            if (!terisi[i]) {
                countKosong++;
            }
        }

        Kursi[] hasil = new Kursi[countKosong];
        int index = 0;
        for (int i = 0; i < semuaKursi.length; i++) {
            if (!terisi[i]) {
                hasil[index++] = semuaKursi[i];
            }
        }
        return hasil;
    }
}
