import java.util.*;

public class ArraysAndLists {
    
    public static void main(String[] args) {

        final String names[] = new String[3];
        names[1] = "kaygoren";  // names = [null, "kaygoren", null]

        // different initialization of arrays
        final int[] nums1 = new int[]{1,2};
        final int nums2[] = {1,2,3};
        final int[][] nums3 = {{1,2}, {1}, {3,4}};

        for(int[] nums : nums3) {
            for(int i=0; i<nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        
        // different initialization of lists
        final List<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        final List<Integer> numbers2 = new ArrayList<Integer>(List.of(1,2,3));
        final List<Integer> numbers3 = new ArrayList<>(numbers2);
        final List<Integer> numbers4 = numbers1;

        numbers1.set(0,100);
        numbers2.set(1,200);
        numbers3.set(2,300);
        numbers4.set(3,400);

        System.out.println(names.length);  // for array
        System.out.println(names[1].length()); // for string
        System.out.println(numbers3.size()); // for list

        // lists can be printed as it is but arrays cannot!
        System.out.println(numbers1); // [100, 2, 3, 400]
        System.out.println(numbers2); // [1, 200, 3]
        System.out.println(numbers3); // [1, 2, 300]
        System.out.println(numbers4); // [100, 2, 3, 400]
    }
}
