import java.util.Scanner;

public class Tugas1 {

    public void tampilkanFibonacci(int n) {
        int a = 0, b = 1, c;

        System.out.print(n + " deret Fibonacci = ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berapa deret Fibonacci? ");
        int n = input.nextInt();

        Tugas1 program = new Tugas1();

        // Memanggil method lewat objek
        program.tampilkanFibonacci(n);
    }
}