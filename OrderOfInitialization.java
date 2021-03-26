public class OrderOfInitialization {

    public static void main(String[] args) {

        Child c = new Child();
    }

}

class Child extends Parent{

    static {
        System.out.println("in child static");
    }

    public Child() {
        System.out.println("in child constructor");
    }
}

class Parent {

    static {
        System.out.println("in parent static");
    }

    {
        System.out.println("in parent instance");
    }

    public Parent() {
        System.out.println("int parent constructor");
    }
}