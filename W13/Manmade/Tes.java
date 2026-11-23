class Parent {
    public void Info() { System.out.println("Ini class Parent"); }
}

class Child extends Parent {
    public void Info() { System.out.println("Ini class Child"); }
}

public class Tes {
    public static void main(String args[]) {
        Parent tes = new Child();
        tes.Info();
    }
}