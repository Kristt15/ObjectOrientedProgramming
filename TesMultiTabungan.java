import W7.perbankan.*;
 
public class TesMultiTabungan {
    public static void main(String[] args) {
        MultiTabungan tabungan = new MultiTabungan(100000);
        System.out.println("Saldo awal          : " + tabungan.getSaldo() + " IDR");
 
        tabungan.simpanUang(5, "USD");
        System.out.println("Simpan 5 USD        -> saldo: " + tabungan.getSaldo() + " IDR");
 
        tabungan.simpanUang(2, "AUD");
        System.out.println("Simpan 2 AUD        -> saldo: " + tabungan.getSaldo() + " IDR");
 
        tabungan.simpanUang(50000, "IDR");
        System.out.println("Simpan 50000 IDR    -> saldo: " + tabungan.getSaldo() + " IDR");
 
        boolean status = tabungan.ambilUang(10, "USD");
        System.out.println("Ambil 10 USD        -> " + (status ? "ok" : "gagal") + ", saldo: " + tabungan.getSaldo() + " IDR");
 
        status = tabungan.ambilUang(3, "AUD");
        System.out.println("Ambil 3 AUD         -> " + (status ? "ok" : "gagal") + ", saldo: " + tabungan.getSaldo() + " IDR");
 
        status = tabungan.ambilUang(100, "AUD");
        System.out.println("Ambil 100 AUD       -> " + (status ? "ok" : "gagal") + ", saldo: " + tabungan.getSaldo() + " IDR");
 
        status = tabungan.ambilUang(5, "EUR");
        System.out.println("Ambil 5 EUR         -> " + (status ? "ok" : "gagal (mata uang tidak dikenal)"));
 
        System.out.println("Saldo akhir (IDR)   : " + tabungan.getSaldo("IDR"));
        System.out.println("Saldo akhir (USD)   : " + tabungan.getSaldo("USD"));
        System.out.println("Saldo akhir (AUD)   : " + tabungan.getSaldo("AUD"));
    }
}