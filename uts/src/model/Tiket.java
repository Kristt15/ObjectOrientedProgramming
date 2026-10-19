package model;

public class Tiket {
    // atribut
    private String idTiket;
    private String status;
    private Kursi kursi;
    private Jadwal jadwal;

    // constructor
    public Tiket(String idTiket, String status, Kursi kursi, Jadwal jadwal) {
        this.idTiket = idTiket;
        this.status = status;
        this.kursi = kursi;
        this.jadwal = jadwal;
    }

    // getter n setter
    public String getIdTiket() { 
        return idTiket; 
    }
    public String getStatus() { 
        return status; 
    }
    public void setStatus(String status) { this.status = status; }
    public Kursi getKursi() { 
        return kursi; 
    }
    public Jadwal getJadwal() { 
        return jadwal; 
    }
}
