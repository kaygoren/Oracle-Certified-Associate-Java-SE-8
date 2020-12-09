public class CodeBlock {

    private String name = "Fluffy";

    {System.out.println("setting field");}   // code block which is outside of a method is called instance initializer.

    public CodeBlock() {
        name = "Tiny";
        number = 5;
        System.out.println("setting constructor");
    }

    public static void main(String... args) {

        CodeBlock codeBlock = new CodeBlock();

        System.out.println(codeBlock.name);
        System.out.println(codeBlock.number);

    }

    private int number = 3;

    {number = 4;}
    
}
