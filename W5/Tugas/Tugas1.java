public class Tugas1 {
    public static void main(String args[]) {
        String str1="Politeknik";
        String hasil="";
        int index = str1.indexOf('o');
        while (index != -1) {
            if (hasil.isEmpty()) {
                hasil = hasil + index;
            } else {
                hasil = hasil + "," + index;
            }
            index = str1.indexOf('o', index + 1);
        }   
        System.out.println("Karakter 'o' terdapat pada indek " + hasil);
        
    }
}