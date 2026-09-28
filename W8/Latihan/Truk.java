public class Truk {
    private double muatan;
    private double muatanmaks;

    public Truk(double beratmaks) {
        this.muatan = 0;
        this.muatanmaks = kiloToNewts(beratmaks);
    }

    public double getMuatan() {
        return newtsToKilo(muatan);
    }

    public double getMuatanMaks() {
        return Math.round(newtsToKilo(muatanmaks) * 1000) / 1000.0;
    }
    
    public boolean tambahMuatan(double berat) {
        double beratNewtons = kiloToNewts(berat);
        if (muatan + beratNewtons <= muatanmaks) {
            muatan += beratNewtons;
            return true;
        }
        return false;
    }

    public double newtsToKilo(double berat) {
        return berat / 9.8;
    }

    public double kiloToNewts(double berat) {
        return berat * 9.8;
    }

    public static void main(String[] args) {
        Truk truk = new Truk(1000);

        System.out.println("Muatan maks : " + truk.getMuatanMaks() + " kg");
        System.out.println("Tambah 600 kg : " + truk.tambahMuatan(600));
        System.out.println("Tambah 300 kg : " + truk.tambahMuatan(300));
        System.out.println("Tambah 200 kg : " + truk.tambahMuatan(200));
        System.out.println("Muatan sekarang : " + truk.getMuatan() + " kg");
    }
}