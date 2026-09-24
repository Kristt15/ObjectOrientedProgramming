public class Tugas4 {
    public static void main(String args[]) {
        String nama1 = "Agung Bakso";
        String nama2 = "Bagas Pangsit";

        String[] array1 = nama1.split(" ");
        String[] array2 = nama2.split(" ");

        String firstName1 = array1[0];
        String familyName1 = array1[array1.length - 1];

        String firstName2 = array2[0];
        String familyName2 = array2[array2.length - 1];

        String hasil1 = firstName1 + " " + familyName2;
        String hasil2 = firstName2 + " " + familyName1;

        System.out.println("String nama pertama awal : " + nama1);
        System.out.println("String nama kedua awal : " + nama2);
        System.out.println("String nama pertama : " + hasil1);
        System.out.println("String nama kedua : " + hasil2);
    }
}