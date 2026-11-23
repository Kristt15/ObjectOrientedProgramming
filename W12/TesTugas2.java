public class TesTugas2 {
    public static void main(String[] args) {
        Katak o1 = new Katak(5, "Froggy");
        Kecebong o2 = new Kecebong(2, "Junior Frog", 10);

        System.out.println("O1 bergerak dengan " + o1.caraBergerak());
        System.out.println("O2 bergerak dengan " + o2.caraBergerak());
    }
}