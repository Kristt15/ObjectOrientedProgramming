package model;

public class Studio {
    // atribut
    private String idStudio;
    private String namaStudio;
    private Kursi[] daftarKursi;
    private int jumlahKursi;

    // constructor
    public Studio(String idStudio, String namaStudio) {
        this.idStudio = idStudio;
        this.namaStudio = namaStudio;
        this.daftarKursi = new Kursi[100];
        this.jumlahKursi = 0;
    }

    // method
    public void tambahKursi(Kursi kursi) {
        if (kursi != null) {
            if (jumlahKursi == daftarKursi.length) {
                Kursi[] temp = new Kursi[daftarKursi.length * 2];
                for (int i = 0; i < daftarKursi.length; i++) {
                    temp[i] = daftarKursi[i];
                }
                daftarKursi = temp;
            }
            daftarKursi[jumlahKursi++] = kursi;
        }
    }

    // getter
    public String getIdStudio() { 
        return idStudio; 
    }
    public String getNamaStudio() { 
        return namaStudio; 
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public Kursi[] getDaftarKursi() {
        Kursi[] hasil = new Kursi[jumlahKursi];
        for (int i = 0; i < jumlahKursi; i++) {
            hasil[i] = daftarKursi[i];
        }
        return hasil;
    }
}
