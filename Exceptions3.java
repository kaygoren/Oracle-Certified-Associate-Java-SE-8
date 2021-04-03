public class Exceptions3 {
    public Long zipper() throws Exception {
        try {
            String checkZipper = (String)new Object();   // ClassCastException is thrown during runtime. therefore, return statement
                                                         // is not an unreachable statement.

            // throw new ClassCastException("Broken!");  // if this line had been used instead of the above line, the code would not 
                                                         // have been compiled becuse of an unreachable statement error.
                                                         // the reason is compiler knows there is an exception which is absulately thrown
                                                         // during compile time and return statement can not be reached.
        } catch (Exception e) {
            throw new Exception("Broken!");
        }
        return null;
    }
    public static void main(String... warmth)  {
        try {
            new Coat().zipper();
            System.out.print("Finished!");
        } catch (Throwable t) {}
    }
}