public class PrimitiveTypes {

    public static void main(String... args) {

        byte b = -128;
        Byte by = -10;

        long max = 3123456789L; // since 3123456789 is bigger than Ingeter.MAX_VALUE, L is must

        int octal = 017; // 15
        int hexadecimal = 0xFF; // 255 
        int binary = 0b11; // 3

        // does not compile
        // double notAtStart = _1000.00;
        // double notAtEnd = 1000.00_;
        // double notBeforeDecimal = 1000_.00;
        // double notAfterDecimal = 1000._00;

        double legal = 1_00_0.0_0; // 1000.0

        int i1, i2, i3 = 0; // 3 declarations, 1 initialization 

        // does not compile
        // int i, String s;
        // double d1, double d2;
    }
}
