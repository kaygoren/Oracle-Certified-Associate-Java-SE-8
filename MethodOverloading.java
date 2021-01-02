public class MethodOverloading {

    private final String firstName;

    private final String lastName;

    {
        firstName = "Kenan";
    }

    private String color;
    private int weight;

    public MethodOverloading(int weight) {
        // before calling this, using comment lines are okey but any other non-commented statements are NOT okey.
        this(weight, "brown");
        // MethodOverloading(weight, "brown");  // does not compile
    }

    public MethodOverloading(int weight, String color) {
        lastName = "Aygören";
        this.color = color;
        this.weight = weight;
    }
   
    public void fly(int a, short b) { }

    // public void fly(int a, short b) throws Exception {}  // does not compile
    // public int fly(int a, short b) {return 1;}  // does not compile

    public void fly(short b, int a) { }

    public void fly(int i, int j) { System.out.println("int"); }
    public void fly(long i, long j) { System.out.println("long"); }
    public void fly(Integer i, Integer j) { System.out.println("Integer"); }
    public void fly(Object i, Object j) { System.out.println("Object"); }
    public void fly(int... i) { System.out.println("vararg"); }

    public static void main(String... args) {

        MethodOverloading m = new MethodOverloading(10, "white");
        m.fly(5, 6); // if public void fly(int numMiles) method comments out, output is long
        m.fly(Integer.valueOf("5"), Integer.valueOf("6"));
        m.fly(5L, 6L);

        System.out.println("-----------------");

        // if int version comments out then long version is called
        // if int + long versions comment out then Integer version is called
        // if int + long + Integer versions comment out then Object version is called
        // if int + long + Integer + Object versions comment out then vararg version is called
        m.fly(5,6);
    }
}
