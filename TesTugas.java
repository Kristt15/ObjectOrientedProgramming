import W7.perbankan.*; 

    public class TesTugas { 
    //     public static void main(String arg []){ 
    //     Bank bank = new Bank(); 
    //     bank.tambahNasabah("Agus", "Daryanto"); 
    //     bank.getNasabah(0).setTabungan(new Tabungan(5000)); 
    //     bank.tambahNasabah("Tuti", "Irawan"); 
    //     bank.getNasabah(1).setTabungan(new Tabungan(7000)); 
    //     bank.tambahNasabah("Ani", "Ratna"); 
    //     bank.getNasabah(2).setTabungan(new Tabungan(4000)); 
    //     bank.tambahNasabah("Bambang", "Darmawan"); 
    //     bank.getNasabah(3).setTabungan(new Tabungan(6500) ); 
    //     System.out.println("Jumlah Nasabah = "+bank.getJumlahNasabah()); 
    //     for(int i =0; i<bank.getJumlahNasabah(); i++){ 
    //     System.out.println("Nasabah ke-" + (i+1) + " : " + 
    //     bank.getNasabah(i).getNamaAwal() + " " + 
    //     bank.getNasabah(i).getNamaAkhir() + " ; Saldo = " + 
    //     bank.getNasabah(i).getTabungan().getSaldo()); 
    //     } 
    // } 
    public static void main(String args[]){
PengambilanUang tabungan = new PengambilanUang(5000, 1000);
System.out.println("Uang yang ditabung : 5000");
System.out.println("Uang yang diproteksi : 1000");
System.out.println("-----------------------------");
System.out.println("Uang yang akan diambil : 4500 " +
tabungan.ambilUang(4500));

System.out.println("Saldo sekarang : " + tabungan.getSaldo());
System.out.println("-----------------------------");
System.out.println("Uang yang akan diambil : 2500 " +
tabungan.ambilUang(2500));

System.out.println("Saldo sekarang : " + tabungan.getSaldo());
}

} 