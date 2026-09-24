import java.util.Scanner;

public class Tugas2 {

    public void cekKabisat(int tahun) {
        if (tahun < 1900) {
            System.out.println("Maaf, tahun input dibawah 1900");
        } else if (tahun > 2005) {
            System.out.println("Maaf, tahun input diatas 2005");
        } else {
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                System.out.println(tahun + " adalah tahun kabisat");
            } else {
                System.out.println(tahun + " bukan tahun kabisat");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun (1900-2005) : ");
        int tahun = input.nextInt();

        Tugas2 program = new Tugas2();
        program.cekKabisat(tahun);
    }
}