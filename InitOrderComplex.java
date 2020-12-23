public class InitOrderComplex {

    static { add(2);}

    public static void add(int num) { System.out.println(num + " ");}

    InitOrderComplex() {
        add(5);
    }

    static {add(4);}

    {add(6);}

    static { new InitOrderComplex();}

    {add(8);}

    public static void main(String args[]) {

    }
}
