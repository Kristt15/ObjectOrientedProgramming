public class Truk extends Mobil {
    protected int muatanMaks;

    public void setMuatanMaks(String muatanMaks) {
        this.muatanMaks = Integer.parseInt(muatanMaks);
    }

    public String getMuatanMaks() {
        return String.valueOf(muatanMaks);
    }
}