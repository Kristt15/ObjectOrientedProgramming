public class Truk { 
    private double muatan; 
    private double muatanmaks; 
 
    public Truk(double beratmaks) { 
        this.muatanmaks = beratmaks; 
        this.muatan = 0.0; 
    } 
 
    public double getMuatan() { 
        return muatan; 
    } 
 
    public double getMuatanMaks() { 
        return muatanmaks; 
    } 
 
    public void tambahMuatan(double berat) { 
        if (this.muatan + berat <= this.muatanmaks) { 
            this.muatan += berat; 
        } 
    } 
}