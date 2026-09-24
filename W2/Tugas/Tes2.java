public class Tes2 { 
    public static void main(String[] args) { 
        Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7); 
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "pick up", 1500, 2); 
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5); 
        Mobil mobil4 = new Mobil("Honda", "Merah", "sedan", 1300, 5); 
 
        System.out.println("=== INFORMASI ARMADA RENTAL MOBIL ==="); 

	System.out.println("Mobil 1:"); 
		mobil1.infoMobil(); 
	System.out.println("Mobil 2:"); 
		mobil2.infoMobil(); 
	System.out.println("Mobil 3:"); 
		mobil3.infoMobil(); 
	System.out.println("Mobil 4:"); 
	mobil4.infoMobil(); 
	} 
} 