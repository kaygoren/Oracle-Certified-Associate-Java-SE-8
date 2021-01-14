import java.io.IOException;

class MyException extends Exception {};

public class Exceptions2 {
    
    public static void main(String... args) {
        
        eatCarrot();

        try {
            drinkWater();
        } catch(Exception e) {}

        try {
            fireInTheHall();
        } catch(Exception e) {
            System.out.println("***All three types of printing an exception start***");
            System.out.println(e);
            System.out.println("****************************************************");
            System.out.println(e.getMessage());
            System.out.println("****************************************************");
            e.printStackTrace();
            System.out.println("****************************************************");
        }
// ******************************************************************************************************************** //
        try {
            Integer.parseInt("abc");  // throws NumberFormatException and it is a subclass of IllegalArgumentException
        } catch(IllegalArgumentException e) {}
// ******************************************************************************************************************** //
        try {
            throw new RuntimeException();
        } catch(RuntimeException e) {
            // System.exit(0);  // stop the program immediately.(finallly block does not run)
            System.out.println("catch-works");
            // throw new Exception();  // since Exception is a checked exception, it has to be declared or handled. COMPILE ERROR
            throw new RuntimeException();  // RuntimeException is unchecked exception. so, no extra things are needed. COMPILES but throws exception
            // System.out.println("catch-unreachable");  // exception is thrown before this print, it is unreachable  COMPILE ERROR
        } finally {
            System.out.println("finally-works");  // this block runs and then exception in catch is thrown.
        }
        // System.out.println("end-unreachable");  // since there is an exception caused from catch, unreachable, COMPILE ERROR
    }

    private static void eatCarrot() throws RuntimeException {}
    private static void drinkWater() throws Exception {}
    private static void fireInTheHall() throws Exception {
        throw new Exception("kill all enemies!");
    }
    private Exception method1() {  // legal usage
        return new Exception();
    }

    public void method2() throws StackOverflowError {}  // legal usage

    public void method3() {  // legal usage
        try {
        } catch(Error e) {}
    }

    // private void walkInBadWay() {  // does not compile
    //     try {
    //         walkAround();
    //     } catch(MyException e) {
    //         System.out.println("not reachable");
    //     }
    // }

    private void walkInGoodWay() throws IOException {
        walkAround();
    }
    private void walkAround() {}
}
