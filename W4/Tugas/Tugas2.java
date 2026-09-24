public class Tugas2 {
    public static void main(String[] args) {
        char[] matKul = {'p','e','m','r','o','g','r','a','m','a','n','b','e',
                          'r','b','a','s','i','s','o','b','y','e','k'};
        int jumlahA = 0;

        for (int i = 0; i < matKul.length; i++) {
            if (matKul[i] == 'a') {
                jumlahA++;
            }
        }

        System.out.println("Jumlah huruf 'a' = " + jumlahA);
    }
}