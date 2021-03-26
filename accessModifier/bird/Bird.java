package accessModifier.bird;

public class Bird {
    
    protected String wing = "every bird has wings";

    protected void useWings() {
        System.out.println(wing);
    }

    public static void main(String... args) {
        System.out.println("aaaa");
    }
}
