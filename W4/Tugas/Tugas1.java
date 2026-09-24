public class Tugas1 {
    public static void main(String[] args) {
        int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },
                                 { 622, 127, 77, 955 }};
        int cari = 12;
        boolean ketemu = false;

        cariAngka:
        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == cari) {
                    System.out.println("Found " + cari + " at " + i + ", " + j);
                    ketemu = true;
                    break cariAngka;
                }
            }
        }

        if (!ketemu) {
            System.out.println(cari + " tidak ditemukan dalam array");
        }
    }
}