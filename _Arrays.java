import java.util.*;

public class _Arrays {
    
    public static void main(String[] args) {

        final String names[] = new String[3];
        names[1] = "kaygoren";  // names = [null, "kaygoren", null]
        System.out.println(Arrays.toString(names));


        // different initialization of arrays
        final int[] nums1 = new int[]{1,2,8,4,0};
        // final int[] nums1 = new int[5]{1,2,8,4,0};  // does not compile
        final int nums2[] = {1,2,3};
        final int[][] nums3 = {{1,2}, {1}, {3,4}, {0,6,3}};
        final int[][] nums4 = new int[3][];  // wrong example -> new int[][]
        int[][] nums5 = new int[][] {{1}}; // when array initializer is provided, dimensions can not be defined:  new int[2][]{{},{}}, new int[2][1]{{1},{2}}
        nums4[0] = new int[]{11,33};
        nums4[1] = new int[4];
        // nums4[2] = {6,4,2};  // not allowed

        System.out.println(nums3.length);  // 4

        for(int i=0; i<nums4.length; i++) {
            if(nums4[i] != null)   // nums4[2] points to null
                for(int j=0; j<nums4[i].length; j++) 
                    System.out.print(nums4[i][j] + " ");    
            System.out.println();
        }

        Arrays.sort(nums1);
        // Arrays.sort(nums3);  // runtime error

        for(int[] nums : nums3) {
            for(int i=0; i<nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        int[][] cubbies = new int[0][5];  // legal
        

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4));
        Object[] objectArray = list.toArray();
        // Integer[] intArray = list.toArray();  // error
        Integer[] intArray = list.toArray(new Integer[0]);
    }
}
