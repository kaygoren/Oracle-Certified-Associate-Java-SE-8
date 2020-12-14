import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;;


public class Wrappers {
    

    public static void main(String[] args) {


        float primitive = Float.parseFloat("123");
        Float wrapper = Float.valueOf("123.2");
        // int bad1 = Integer.parseInt("a");  // exception
        // Integer bad2 = Integer.valueOf("123.34");  // exception

        System.out.println(primitive + " " + wrapper);

        boolean pBoolean = Boolean.parseBoolean("TRUE");  // true
        Boolean wBoolean = Boolean.valueOf("TRUE");  // true

        List<Integer> list = new ArrayList<>();

        list.add(null); // legal
        // int h = list.get(0);  // NullPointerException

        list.add(0);
        list.add(1);
        list.add(2);
        list.remove(1); // remove at the first index , not 1 
    }
}
