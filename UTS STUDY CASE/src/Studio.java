public class Studio {
    private String namaStudio;
    private String tipe;
    private int kapasitas;

    public Studio(String namaStudio, String tipe, int kapasitas) {
        this.namaStudio = namaStudio;
        this.tipe = tipe;
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas studio harus lebih dari 0");
        }
        this.kapasitas = kapasitas;
    }

    public String getNamaStudio() { return namaStudio; }
    public String getTipe() { return tipe; }
    public int getKapasitas() { return kapasitas; }
}
