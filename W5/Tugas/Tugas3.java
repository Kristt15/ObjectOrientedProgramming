public class Tugas3 {
    public static void main(String args[]) {
        String str = "Teruhashi Kokomi";

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        String tengah = str.substring(1, str.length() - 1);

        String hasil = last + tengah + first;

        System.out.println("String masukan : " + str);
        System.out.println("String hasil   : " + hasil);
    }
}