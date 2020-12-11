import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    
    public static void main(String args[]) {

        
        // different initialization of lists
        final List<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        final List<Integer> numbers2 = new ArrayList<Integer>(List.of(1,2,3));
        final List<Integer> numbers3 = new ArrayList<>(numbers2);
        final List<Integer> numbers4 = numbers1;

        numbers1.set(0,100);
        numbers2.set(1,200);
        numbers3.set(2,300);
        numbers4.set(3,400);

        
        System.out.println(numbers3.size()); // for list

        // lists can be printed as it is but arrays cannot!
        System.out.println(numbers1); // [100, 2, 3, 400]
        System.out.println(numbers2); // [1, 200, 3]
        System.out.println(numbers3); // [1, 2, 300]
        System.out.println(numbers4); // [100, 2, 3, 400]

        ArrayList list1 = new ArrayList(); // pre Java5 way of creating ArrayList, still legal.
        list1.add(5);
        list1.add("kenan");
        System.out.println(list1);

        Float f = Float.valueOf("1.0");

    }
}
