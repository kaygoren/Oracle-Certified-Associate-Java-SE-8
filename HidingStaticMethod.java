public class HidingStaticMethod {
    
    public static void main(String args[]) {

        Panda.eat();
        Bear.eat();

        Panda panda = new Panda();
        panda.parentFunction();
        System.out.println("--------------");
        panda.childFunction();
    }
}

class Bear {

    protected String name = "Bear";

    public static boolean hiddenMethod() {
        return true;
    }

    public boolean overridenMethod() {
        return true;
    }

    public void parentFunction() {
        System.out.println("parent function hidden " + hiddenMethod());
        System.out.println("parent function overrriden " + overridenMethod());
    }

    public static void eat() {
        System.out.println("Bear is eating");
    }
}

class Panda extends Bear {

    public String name = "Panda";

    public static boolean hiddenMethod() {
        return false;
    }

    public boolean overridenMethod() {
        return false;
    }

    public void childFunction() {
        System.out.println("child function hidden " + hiddenMethod());
        System.out.println("child function overriden " + overridenMethod());

        System.out.println(super.hiddenMethod());
        System.out.println(name + " /// " + super.name);
    }

    public static void eat() {
        System.out.println("Panda is eating");
    }

    // public void eat() {  // does not compile!!!
    //     System.out.println("Panda is eating");
    // }
}