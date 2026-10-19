package model;

public class Promo {
    // atribut
    private String kodePromo;
    private int potongan;
    private String masaBerlaku;

    // constructor
    public Promo(String kodePromo, int potongan, String masaBerlaku) {
        this.kodePromo = kodePromo;
        this.potongan = potongan;
        this.masaBerlaku = masaBerlaku;
    }

    // getter
    public String getKodePromo() { 
        return kodePromo; 
    }
    public int getPotongan() { 
        return potongan; 
    }
    public String getMasaBerlaku() { 
        return masaBerlaku; 
    }

    // method
    public boolean isMasihBerlaku() {
        return masaBerlaku != null && !masaBerlaku.trim().isEmpty();
    }
}
