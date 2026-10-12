public class Child extends Parent {
    int x;
    
    public Child() {
    x = 5;
    super();
    }


// public class Child extends Parent {
// int x;
// public Child() {
// super();
// x = 5;
// }
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x = " + c.x);
    }

}