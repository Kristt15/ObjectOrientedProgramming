package model;

public class Kursi {
    // atribut
    private String idKursi;
    private String baris;
    private int nomor;

    // constructor
    public Kursi(String idKursi, String baris, int nomor) {
        this.idKursi = idKursi;
        this.baris = baris;
        this.nomor = nomor;
    }

    // getter
    public String getIdKursi() { 
        return idKursi; 
    }
    
    public String getBaris() { 
        return baris; 
    }
    
    public int getNomor() { 
        return nomor; 
    }

    @Override
    public String toString() {
        return baris + nomor;
    }
}
