package model;

public abstract class Pengguna {
    // atribut
    private String idPengguna;
    private String namaLengkap;
    private String noHP;
    private String email;
    private String alamat;
    private String tanggalLahir;

    // constructor
    public Pengguna(String idPengguna, String namaLengkap, String noHP, String email, String alamat, String tanggalLahir) {
        this.idPengguna = idPengguna;
        this.namaLengkap = namaLengkap;
        this.noHP = noHP;
        this.email = email;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

    // getter
    public String getIdPengguna() { 
        return idPengguna; }
    public String getNamaLengkap() { 
        return namaLengkap; }
    public String getNoHP() { 
        return noHP; }
    public String getEmail() { 
        return email; }
    public String getAlamat() { 
        return alamat; }
    public String getTanggalLahir() { 
        return tanggalLahir; }

    // setter
    public void setNamaLengkap(String nama) { 
        this.namaLengkap = nama; 
    }
    public void setNoHP(String no) { 
        this.noHP = no; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }
}
