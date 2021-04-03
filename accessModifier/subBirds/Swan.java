package accessModifier.subBirds;

import accessModifier.bird.Bird;

public class Swan extends Bird {

    protected String baseSwanString = "";

    public Swan() { }
    
    public Swan(int uselessNumber) {
        System.out.println(wing);
        useWings();
    }

    public void helpOtherSwan() {
        Swan otherSwan = new Swan();
        otherSwan.useWings();  // COMPILES, // different packages but Swan extends Bird
    }

    public void helpOtherBird() {
        Bird otherBird = new Swan();
        // otherBird.useWings();  // DOES NOT COMPILE, // since different packages and Bird does not extend Bird.
    }
}
