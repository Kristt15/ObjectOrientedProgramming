public class Film {
    private String idFilm;
    private String judul;
    private String genre;
    private int durasiMenit;
    private String ratingUsia;

    public Film(String idFilm, String judul, String genre, int durasiMenit, String ratingUsia) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;
        setDurasiMenit(durasiMenit);
        this.ratingUsia = ratingUsia;
    }

    public String getIdFilm() { return idFilm; }
    public String getJudul() { return judul; }
    public String getGenre() { return genre; }
    public int getDurasiMenit() { return durasiMenit; }
    public String getRatingUsia() { return ratingUsia; }

    public void setDurasiMenit(int durasiMenit) {
        if (durasiMenit <= 0) {
            throw new IllegalArgumentException("Durasi film harus lebih dari 0 menit");
        }
        this.durasiMenit = durasiMenit;
    }

    public void tampilInfo() {
        System.out.println(judul + " (" + genre + ", " + durasiMenit + " menit, " + ratingUsia + ")");
    }
}
