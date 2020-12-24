public class Operator {

    // in binary operations byte, short and char are promoted to int: b-> byte, b2->byte, b+b2-> int
    // in unary operations they keep their data types: s-> short, s++ -> short also
    
    public static void main(String args[]) {

        short s = 5;
        s++;
        short s2=10;
        // short s3 = s + s2;  // type mismatch can not convert int to short

        char c = 'a';
        c++;
        char c2 = 'b';

        System.out.println(((Object) s ).getClass().getName() ); // short
        System.out.println(((Object) (s2+s) ).getClass().getName() ); // int
        System.out.println(((Object) c ).getClass().getName() );  // char
        System.out.println(((Object) (c+c2) ).getClass().getName() ); // int

        int x = 3;
        int y = ++x * 5 / x-- + --x;  // 4 * 5 / 4 + 2 = 7; x =2;

        long aa = 10;
        int bb = 5;
        // bb = aa * bb;  // compile error
        bb *= aa; // first bb cast to long then mul op then result cast to int NO COMPILE ERROR

        long dd =5;
        long ee = (dd=3);  // dd -> 3, ee -> 3

        int r = 1;
        int t = 1;
        int e = r >= 10 ? r++ : t++;  // e-> 1, r-> 1, t-> 2;

        double d2 = 10.2 % -3.5f;
        System.out.println(d2);

        int xs = 6;

        boolean ys = (xs >= 6) || (++xs <= 7);
        System.out.println(xs); // 6 since left-side is always true, right side is never calculated.

        boolean zs = (xs >= 6) | (++xs <= 7);
        System.out.println(xs); // 7 even if leftside is always true, leftside must be calculated.

        boolean yy = true;

        boolean xx = (yy = false);  // xx-> false , yy-> false

        File afile = new File("vv.txt");
        File bfile = new File("vv.txt");
        File cfile = afile;  // cfile == afile , bfile != afile
        
    }
}
