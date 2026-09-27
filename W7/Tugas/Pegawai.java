public class Pegawai{ 
    int nip; 
    String nama; 
    
    public Pegawai(int nip_pegawai){ 
        this(nip_pegawai,"NoName"); 
    }  

    public Pegawai(int nip_pegawai, String nama_pegawai){ 
        this.nip = nip_pegawai; 
        this.nama = nama_pegawai; 
    }  

    public static void main(String[] args){
        Pegawai p1 = new Pegawai(101);
        Pegawai p2 = new Pegawai(102, "Budi");
        System.out.println("NIP: " + p1.nip + ", Nama: " + p1.nama);
        System.out.println("NIP: " + p2.nip + ", Nama: " + p2.nama);
        }
} 

