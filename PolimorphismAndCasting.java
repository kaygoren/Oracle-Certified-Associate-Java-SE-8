public class PolimorphismAndCasting {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        lemur.hasHair();
        lemur.isTailStriped();

        HasTail hasTail = lemur;
        hasTail.isTailStriped();
        // hasTail.hashHair();  // does not compile  
        // System.out.println(hasTail.age);  // does not compile

        Primate primate = lemur;
        primate.hasHair();
        // primate.isTailStriped();  // does not compile
        // System.out.println(primate.age);  // does not compile

        Lemur lemurFromPrimate = (Lemur) primate;
        System.out.println(lemurFromPrimate.age);

        Primate primate2 = new Primate();
        Lemur lemurFromPrimate2 = (Lemur) primate2;
        // System.out.println(lemurFromPrimate2.age);  // compiles but gives ClassCastException at runtime
        if(primate2 instanceof Lemur) {
            System.out.println(lemurFromPrimate2.age);
        }
    } 
}

class Primate {
    public void hasHair() {
        System.out.println("has hair");
    } 
}

interface HasTail {  
    public void isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public void isTailStriped() {
        System.out.println("tail is striped");
    }
    public int age = 10;
}