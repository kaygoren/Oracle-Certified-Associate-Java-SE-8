public class Mammal {

    protected String name = "mammal";
    
    public Mammal(String name) {
        this.name = name;
    }

    public void eat_overrriden(int food) {
        System.out.println("Mammal is eating " + food + "amount of food");
    }

    public void walk_overloaded() {
        System.out.println("Mammal is walking");
    }

    public static void main(String... args) {

    }
}

class Cow extends Mammal {
    public Cow() {
        super("cow");
    }

    public void mammalName() {  // all of these are legal
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    // public int eat_overriden(int food) {  // overriden method,so return types must be covariant. compile error!!
    //     return food;
    // }

    public int walk_overloaded(int height) {  // overloaded method, so different return type is allowed.
        return height;
    }
}

// class Cow extends Mammal {  // compile error
// }

// class Cow extends Mammal {  // compile error
//     public Cow() {
//     }
// }

// class Cow extends Mammal {  // compile error
//     public Cow() {
//         super();
//     }
// }