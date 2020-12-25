import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class LambdaSearch {
    
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        needInterfaceToPrint(animals, a -> !a.canHop());
        needInterfaceToPrint(animals, a -> { return a.canSwim(); });
        needInterfaceToPrint(animals, (Animal a) -> a.canHop());
        
        noNeedInterfaceToPrint(animals, a-> a.canSwim());
    }

    private static void needInterfaceToPrint(List<Animal> animals, CheckTrait checkTrait) {
        
        for(Animal animal : animals) {
            if(checkTrait.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }

    private static void noNeedInterfaceToPrint(List<Animal> animals, Predicate<Animal> predicate) {

        for(Animal animal: animals) {
            if(predicate.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println(" ");
    }

}

interface CheckTrait {

    boolean test(Animal a);
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
}