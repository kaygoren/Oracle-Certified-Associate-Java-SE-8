public class VarArgs {
    
    public static void test_vararg(int start, int... nums) {
        System.out.println("length is " + nums.length);
        if(nums.length != 0)
            System.out.println("first element is " + nums[0]);
    }

    public static void main(String... args) {

        test_vararg(1);  // 0
        test_vararg(1, 2);  // 1
        test_vararg(1, 2, 3);  // 2
        test_vararg(1, new int[]{3,4});  // 2
        // test_vararg(1, null);  // NullPointerEception

        // howMany(true, {true, true});  // invalid declaration
        howMany(true, new boolean[]{true, true});
        howMany(true, true, true);
    }

    public static int howMany(boolean b1, boolean... b2) {
        return b2.length;
    }
}
