public class Deer {

    public Deer() {  // this constructor must exist, since there is no explicit super call in Reindeer
                     // which means it uses super() implicitly.
        System.out.println("Deer");
    }

    public Deer(int age) {
        System.out.println("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    protected void WhatEats() {
        System.out.println("Deers eat grass");
    }
    
    public static void main(String args[]) {


        Deer deer = new Deer(2);
        System.out.println(deer.hasHorns()); // uses own method, obviously there is no inheritance here
        deer.WhatEats(); // also uses own method

        System.out.println("-----------------------");

        Deer reinDeer = new ReinDeer(5);
        System.out.println(reinDeer.hasHorns()); // since the method is private, child class cannot inherit it, so it uses base class method
        reinDeer.WhatEats();  // this method can be inherited, since it is protected and child class can inherit.
        // reinDeer.sayCheese(); // compile error - method is undefined

        System.out.println("-----------------------");

        ReinDeer reinDeer2 = new ReinDeer(3);
        System.out.println(reinDeer2.hasHorns());
        reinDeer2.WhatEats();
        reinDeer2.sayCheese();

        System.out.println("-----------------------");

        // ReinDeer deer2 = new Deer(3);  // cannot convert from Deer to ReinDeer

        ReinDeer reinDeer3 = new ReinDeer();

    }
}

class ReinDeer extends Deer {

    public ReinDeer(int age) {  // if we dont call super constructor explicitly, super() is called implicitly.
                                // either there are no constructor in parent so compiler defines and uses DEFAULT no-arg constructor
                                // or we have to define no-arg constructor
        System.out.println("ReinDeerAge");
    }

    public ReinDeer() {
        this(1);
        System.out.println("ReinDeer");
    }

    public boolean hasHorns() {  // since parent has same method but with private access modifier, 
                                 // we cannot say this method overrides its parent method,
                                 // it has to be public or protected to inherit.
        return true;
    }

    public void WhatEats() {  // method name starts with uppercase is legal
        System.out.println("ReinDeers also eat grass");
    }

    public void sayCheese() {
        System.out.println("cheseee");
    }
}
