import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

        Collections.sort(numbers2);
        System.out.println(numbers3.size()); // for list

        // lists can be printed as it is but arrays cannot!
        System.out.println(numbers1); // [100, 2, 3, 400]
        System.out.println(numbers2); // [1, 200, 3]
        System.out.println(numbers3); // [1, 2, 300]
        System.out.println(numbers4); // [100, 2, 3, 400]

        // --------------------------------------------------------------------------------------------------------------------------

        ArrayList list1 = new ArrayList(); // pre Java5 way of creating ArrayList, still legal.
        // ArrayList list1 = new ArrayList<>();  // also legal
        list1.add(5);
        list1.add("kenan");
        System.out.println(list1);  // [5, "kenan"]

        // --------------------------------------------------------------------------------------------------------------------------

        Integer[] numArray = {9,8,7};
        List<Integer> numbers5 = Arrays.asList(numArray);  // numArray can not be -> int[]
                                                           // numArray and numbers5 point to same data source.
        // numbers5.remove(1); // exception since list initiated from array, the size is fixed, we cannot make operations that causes change of size.
        List<Integer> numbers6 = new ArrayList<>(Arrays.asList(numArray));
        numbers6.add(666);
        numbers6.set(0,90);

        numbers5.set(1, 80);
        numArray[2] = 70;
        System.out.println(numbers5);
        for(int num : numArray) {
            System.out.print(num + " ");
        }
        System.out.println(numbers6);

        List<Integer> numbers7 = Arrays.asList(5,7,8);
        // numbers7.add(777);  // error
        numbers7.set(0,100);  // legal
        System.out.println(numbers7);

        List<Integer> numbers8 = List.of(12,13,14,15);
        // numbers8.add(888); // error
        // numbers8.set(3,55); // error
        System.out.println(numbers8);

        
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);  // 2 1 -3

        List<Integer> a = new ArrayList(List.of(1,2,3));
        List<Integer> b = new ArrayList(List.of(1,2,3));
        System.out.print(a == b);  // false

        String aa = new String("kenan");
        String bb = new String("kenan");
        System.out.print(aa == bb);  // false

        Integer aaa = new Integer(50);
        Integer bbb = new Integer(50);
        System.out.print(aaa == bbb);  // false
        System.out.print(aaa.equals(bbb));  // true
    }
}
