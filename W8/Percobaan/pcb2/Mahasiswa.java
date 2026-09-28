public class Mahasiswa { 
    private int nrp; 
    private String nama; 
    public Mahasiswa() { 
        nrp=0; 
        nama=""; 
        } 

        public Mahasiswa(String nama) { 
            nrp=0; 
            this.nama=nama; 
            } 

            public Mahasiswa(int nrp, String nama) { 
            this.nrp=nrp; 
            this.nama=nama; 
            } 
}
