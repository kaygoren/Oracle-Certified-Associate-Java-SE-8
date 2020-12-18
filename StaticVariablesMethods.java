public class StaticVariablesMethods {
    
    private String instanceField = "ins";
    // private static String classField = "cla" + instanceField;  // not allowed


    public void instanceMethod() { }

    public static void classMethod() { }

    public static void classMethodWithInstanceField() {
        // System.out.println(instanceField);  using non static field in static method is not allowed.
    }
    
    public static void main(String... args) {


        // instanceMethod();  // not allowed
        classMethod();

        Koala k = new Koala();

        System.out.println(k.count);  // 5 , since count is static, compiler looks Koala.count
        System.out.println(k.color);  // gray

        k = null;

        System.out.println(k.count);  // 5 , still compiler looks Koala.count thus, no exception
        // System.out.println(k.color);  // NullPointerException

        k = new Koala();
        Koala k2 = new Koala();

        Koala.count = 10;
        k.count = 15;
        k2.count = 20;

        System.out.println(Koala.count + "-" + k.count + "-" + k2.count);// 20-20-20  there is only one count variable since it's static
    
    }
}


class Koala {

    public static int count = 5;
    public String color = "gray";
}
