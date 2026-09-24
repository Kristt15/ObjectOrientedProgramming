import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah deretan Fibonacci? ");
        int n = scan.nextInt();

        int fibonacci[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci[i] = 0;
            } else if (i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}