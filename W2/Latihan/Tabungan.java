public class Tabungan {
	public int saldo;

	public Tabungan(int initsaldo) {
		this.saldo = initsaldo;
	}
		
	public void ambilUang(int jumlah) {
		this.saldo -= jumlah;
	}
}