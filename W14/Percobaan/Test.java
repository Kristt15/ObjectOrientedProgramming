class Musician { 
    public void perform() { //Latihan 2: Overridden method
    System.out.print("Beraksi di atas panggung");
    }
}

class Singer extends Musician { //Latihan 7: inheritance (single)
    //Latihan 2: overridingmethod (sekaligus overridden bagi Kpop & Biduan)
    @Override
    public void perform() {
    System.out.print("Beraksi diatas panggung, bernyanyi dengan merdu");
    }
}

//Latihan 7: Inheritance (Multilevel & Hierarchical)
class Kpop extends Singer {
    //Latihan 2: Overriding method
    @Override
    public void perform() {
    System.out.print("Beraksi diatas panggung, bernyanyi dengan merdu, dan ngedance");
    }
}

//Latihan 7: Inheritance (Multilevel & Hierarchical)
class Biduan extends Singer {
    //Latihan 2: Overriding method
    @Override
    public void perform() {
    System.out.print("Beraksi diatas panggung, bernyanyi dengan merdu, dengan cengkok melayu");
    }
}

class Fans {
    private String name;
    //Latihan 1 & 3: Overloading constructor dalam satu class
    public Fans() {
    this.name = "noname";
    }
    public Fans(String name) {
    this.name = name;
    }
    public void showName() {
    System.out.print(this.name);
    }

    //Latihan 1 & 3: Overloading method dalam satu class
    public void watchingPerformance() {
    showName();
    System.out.println(": melihat idolanya dari youtube");
    }

    //Latihan 6: Polymorphic Argument (Musician musician)
    public void watchingPerformance(Musician musician) {
    showName();
    System.out.print(": melihat idolanya ");
    musician.perform(); //Latihan 5: Virtual Method Invocation (VMI)
    System.out.println();
    }
}

//Latihan7:Inheritance
class KpopFans extends Fans {
    //Latihan 1 & 3: Overloading constructor dalam satu class
    public KpopFans() {
    super();
    }
    public KpopFans(String name) {
    super(name);
    }

    // Latihan 1 & 4: Overloading method antara superclass (Fans) dan subclass (KpopFans)
    public void watchingPerformance(Musician musician, String
    expression) {
    showName();
    System.out.print(": " + expression + " melihat idolanya ");
    musician.perform();
    System.out.println();
    }
}

public class Test { 
    public static void main(String args[]){ 
        Fans fans1 = new Fans(); 
        Fans fans2 = new Fans("Mona"); 
        Fans fans3 = new KpopFans("Tomi"); //Latihan6:PolymorphicReference
        KpopFans fans4 = new KpopFans("Febi"); 
        fans1.watchingPerformance(); 
        fans2.watchingPerformance(new Musician()); 
        fans2.watchingPerformance(new Singer()); //Latihan5&6:VMI&PolymorphicArgument
        fans3.watchingPerformance(new Biduan()); //Latihan5&6:VMI&PolymorphicArgument
        fans4.watchingPerformance(new Kpop(), "teriak histeris");    
    } 
}