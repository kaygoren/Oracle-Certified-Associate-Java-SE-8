package accessModifier.subBirds;

import accessModifier.bird.Bird;

public class Goose {
    
    public void helpOthers() {
        Swan swan = new Swan();
        // swan.useWings(); // not visible

        Bird bird = new Swan();
        // bird.useWings();  // not visible
    }
}
