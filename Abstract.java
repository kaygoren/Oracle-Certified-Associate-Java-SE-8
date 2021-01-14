public class Abstract {
    
    public static void main(String... args) {

        Animal animal = new Swan();
        System.out.println(animal.getName());

        Swan swan = new Swan();
        Tiger tiger = new Tiger();

        Animal aTiger = new Tiger();

        printAnimalName(swan);
        printAnimalName(tiger);
        printAnimalName(aTiger);
    }

    public static void printAnimalName(Animal animal) {
        System.out.println(animal.getName());
    }
}

abstract class Animal {

    protected int age = 2;

    protected abstract String getName();

    // protected abstract String getName() {}  // does not compile (body)

    // protected abstract String getName() { return "";}  // does not compile (body)

    // protected abstract final String getName();  // does not compile (final)

    // private abstract String getName();  // does not compile (private)
}

class Swan extends Animal {

    public String getName() {
        return "Swan";
    }
}

class Tiger extends Animal {
    public String getName() {
        return "tiger";
    }
}

final class A {}

// class B extends A {} // can not extends from a FINAL class.
