package model;

public class Film {
    // atribut
    private String idFilm;
    private String judul;
    private int durasi;
    private String genre;
    private String rating;

    // constructor
    public Film(String idFilm, String judul, int durasi, String genre, String rating) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
        this.rating = rating;
    }

    // getter
    public String getIdFilm() { 
        return idFilm; 
    }
    public String getJudul() { 
        return judul; 
    }
    public int getDurasi() { 
        return durasi; 
    }
    public String getGenre() { 
        return genre; 
    }
    public String getRating() { 
        return rating; 
    }
}
