public class _C {

    // the name must begin with a letter or $ or _
    // subsequent characters may also be number.

    private static int $; // is ok, int  _a is ok but int _ is not ok.
    
    private static boolean bool; // class variable, default value is false
    private float f; // instance variable, default is 0.0


    public String __s;
    protected long L = 1L;

    public void eat(int piecesOfCheese) {  // this method consists TWO LOCAL VARIABLES.
        int bitesOfCheese = 1; 
    }

    public static void main(String[] args) {

        _C _c = new _C();

        String a_b;  // local variable, need to be assigned to use.

        System.out.println(_c.__s); // null
        System.out.println($); // 0
        // System.out.print(a_b); // compilation error, local variables require assignment before referencing them.
    
    }
}
