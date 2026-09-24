// public class Latihan3 {
//     public static void main(String args[]) {
//     int a;
//     for(a=2;a<=20;a++)
//          {
//             if (a % 2 == 0) {
//                 if (a==6) continue;
//                 System.out.println(a);      
//             } else {
//                 continue;
//             }

//         }
//     }
// }

public class Latihan3 {

    public void tampilkanAngka() {
        int a;
        for (a = 2; a <= 20; a++) {
            if (a % 2 == 0) {
                if (a == 6) continue;
                System.out.print(a + " ");
            } else {
                continue;
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Latihan3 program = new Latihan3();
        program.tampilkanAngka();
    }
}