public class Computer {
    public void compute() throws Exception {      
        throw new RuntimeException("Error processing request");   
    }

    public static void main(String[] bits) {

        // final Object exception = new Exception();
        // final RuntimeException data = (RuntimeException) exception; // -> ClassCastException

        // Exception ex = new Exception();
        // RuntimeException r = (RuntimeException) ex; -> ClassCastException

        Object o = new Object();
        String s = (String) o;   // -> ClassCastException

        String ss = new String("kenan");
        Object oo = ss;
        String sss = (String) oo;

        try {         
            new Computer().compute();         
            System.out.print("Ping");      
        } catch (NullPointerException e) {         
            System.out.print("Pong");         
            throw e;      
        } catch (Exception e) {

        }
    } 
}


// main method either requires "throws Exception" or catch(Exception e) {} block in try statement to compile