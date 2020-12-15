import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Static {

    public static final List<String> values = new ArrayList<>();

    public static final int one;
    public static final int two = 2;
    // public static final int three;  // DOES NOT COMPILE, there is no other way to get initialized, so it is an error.

    static {  // static initializer
        one = 1;
        // two = 22;  // DOES NOT COMPILE , tries to reassign
        // one = 11;  // DOES NOT COMPILE , tries to reassign
    }
    
    public static void main(String[] args) {

        Arrays.asList("one");  // to be used,  <import java.util.Arrays> has to be imported.
        asList("one", "two");

        values.add("changed");  // it compiles,  final modifier prevents from reassigning to a different object.
    }
}
