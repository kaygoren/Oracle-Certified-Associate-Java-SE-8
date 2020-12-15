public class PassByValue {
    

    public static void main(String... args) {

        int num = 4;
        String name = "Peralta";
        StringBuilder sbName = new StringBuilder();

        newNumber(num);
        newString(name);
        newStringBuilder(sbName);

        // all threes above are pass by value

        System.out.println(num + " " + name + " " + sbName);  // 4 Peralta Boyle
    }

    // num and n point to same value first, then n points to 8, num still points to 4
    public static void newNumber(int n) {
        n = 8;
    }

    // name and str point to same value first, then str points to another string but name doesnt change.
    public static void newString(String str) {
        str = "Santiago";
    }

    // sbName and s are different references but points to the same StringBuilder,
    // any operations made by s, affects sbName as well since they show still same StringBuilder
    public static void newStringBuilder(StringBuilder s) {
        s.append("Boyle");
    }
}
