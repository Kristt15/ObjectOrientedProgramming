import java.text.NumberFormat;

public class Latihan1 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);

        int nrp[] = {1, 2, 3, 4};
        String nama[] = {"Ahmad", "Adang", "Dani", "Edi"};
        int nilai[][] = {
            {81, 90, 62},   // Ahmad -> RPL, BD, PBO
            {50, 83, 87},   // Adang
            {89, 55, 65},   // Dani
            {77, 70, 92}    // Edi
        };

        double rataRata[] = new double[nilai.length];

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                rataRata[i] += nilai[i][j];
            }
            rataRata[i] /= nilai[i].length;
        }

        System.out.println("NRP\tRata-rata");
        System.out.println("--------------------------");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nrp[i] + "\t" + nf.format(rataRata[i]));
        }
        System.out.println("---------------------------");
    }
}