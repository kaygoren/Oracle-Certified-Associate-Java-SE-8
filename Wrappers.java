import java.util.ArrayList;
import java.util.List;

public class Wrappers {

    // public Long aaa() {  // incompatible type error -> int cannot be converted to Long.
    //     return 12;
    // }
    
    public static void main(String[] args) {

        float primitive = Float.parseFloat("123");
        Float wrapper = Float.valueOf("123.2");
        // int bad1 = Integer.parseInt("a");  // exception
        // Integer bad2 = Integer.valueOf("123.34");  // exception

        boolean pBoolean = Boolean.parseBoolean("TRUE");  // true
        Boolean wBoolean = Boolean.valueOf("true");  // true

        System.out.println(pBoolean + " " + wBoolean);

        List<Integer> list = new ArrayList<>();

        list.add(null); // legal
        System.out.println(list.get(0));
        // int h = list.get(0);  // NullPointerException

        list.add(0);
        list.add(1);
        list.add(2); // [null, 0, 1, 2]
        list.remove(1); // remove at the first index , not 1  : [null, 1, 2]
    }
}
