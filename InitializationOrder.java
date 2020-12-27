public class InitializationOrder {
    
    private String name = "Torchie";

    private static GS gs = new GS();

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    {
        COUNT += 20;
        System.out.println(COUNT);
    }

    public InitializationOrder() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        System.out.println("main");
        new InitializationOrder();
    }
}

class GS {
    public static int trophy = 22;
    public final String legend = "Hagi";
}
