import java.util.Scanner;

public class Latihan1 {

    public int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan faktorial: ");
        int num = input.nextInt();

        Latihan1 program = new Latihan1();

        System.out.println("n\t\tn!");
        System.out.println("------------------------------");

        for (int i = 1; i <= num; i++) {
            System.out.println(i + "\t\t" + program.factorial(i));
        }
    }
}