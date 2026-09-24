import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan batas bilangan? ");
        int n = scan.nextInt();

        boolean isPrima[] = new boolean[n + 1];

        // Anggap semua bilangan awalnya prima, kecuali 0 dan 1
        for (int i = 2; i <= n; i++) {
            isPrima[i] = true;
        }

        // Cek tiap bilangan, tandai kelipatannya sebagai bukan prima
        for (int i = 2; i <= n; i++) {
            if (isPrima[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    isPrima[j] = false;
                }
            }
        }

        System.out.print("Bilangan prima dari 2 sampai " + n + " : ");
        for (int i = 2; i <= n; i++) {
            if (isPrima[i]) {
                System.out.print(i + " ");
            }
        }
    }
}