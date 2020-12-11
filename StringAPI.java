public class StringAPI {
    

    public static void main(String[] args) {
        

        System.out.println(1 + 2 + "a"); // 3a
        System.out.println(1 + 2 + 3 + "4"); // 64  


        String string = "animals"; System.out.println(string.indexOf('a')); // 0 
        System.out.println(string.indexOf("al")); // 4 
        System.out.println(string.indexOf('a', 4)); // 4 
        System.out.println(string.indexOf("al", 5)); // -1

        ////////////////////////////////////////////////////////////////////////////////////////////////
        ////////                                                                                ////////
        ////////  Remember that strings are immutable, so the original string stays the same.   ////////                                                                 
        ////////                                                                                ////////
        ////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 3)); // empty string
        // System.out.println(string.substring(3, 2)); // error
        System.out.println(string.substring(3, 7)); // mals
        // System.out.println(string.substring(3, 8)); // error

        // System.out.println(string.startsWith('a'));  // 'a' must be String "a"

        System.out.println("kenan" + true); // kenantrue

        // In this example, we don’t have two of the same String literal. 
        // Although x and z happen to evaluate to the same string,one is computed at runtime. 
        //Since it isn’t the same at compile-time, a new String object is created. 
        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z); // false


        StringBuilder sb = new StringBuilder(10); // StringBuilder increases capacity when necessary.
        sb.append("kenanaygorenkenanaygoren");
        String sub_sb = sb.substring(5);  // sb does NOT change
        sb.delete(5, 25);  // kenan
        sb.insert(5, "-");  //kenan-
        sb.insert(1, "?");  // k?enan-
        

    }
}
