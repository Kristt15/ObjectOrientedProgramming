package model;

public class Kasir extends Pengguna {
    // atribut
    private String idKasir;

    // constructor
    public Kasir(String idKasir, String idPengguna, String namaLengkap,
                 String noHP, String email, String alamat, String tanggalLahir) {
        super(idPengguna, namaLengkap, noHP, email, alamat, tanggalLahir);
        this.idKasir = idKasir;
    }

    // getter
    public String getIdKasir() { 
        return idKasir; 
    }

    // method
    public void prosesPesanan(Pesanan pesanan) {
        if (pesanan != null && "MENUNGGU".equals(pesanan.getStatus())) {
            pesanan.setStatusInternal("DIPROSES");
            System.out.println("Kasir " + getNamaLengkap() + " memproses pesanan: " + pesanan.getIdPesanan());
        }
    }
}
