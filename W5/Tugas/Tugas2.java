public class Tugas2 {
    public static void main(String args[]) {
        String str1="Selamat Datang di PENS";
        String hasil="";
        String hasil2 = "";
        String keyword= "PENS";
        int index = str1.indexOf(keyword);
        while (index != -1) {
                if (hasil.isEmpty()) {
                    hasil = hasil + index;
                } else {
                    hasil = hasil + "," + index;
                }
            index = str1.indexOf(keyword, index + 1);
        } 
        hasil2 = str1.toUpperCase();
        System.out.println(hasil);
        System.out.println(hasil2);
    }
}