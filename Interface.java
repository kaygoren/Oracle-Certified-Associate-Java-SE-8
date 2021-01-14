public class Interface {
}

interface Shape {  // can be public or default access modifier

    int GEOMETRIC_ID = 0; // assumed as public static final int GEOMETRIC_ID = 0;

    int getMaxHeight(); // assumed as public abstract int getMaxHeight();
}

interface Shape2 {
    
    int getMaxHeight(); // different return types are illegal.

    // float getMaxWidth() {  // does not compile, must be declared as static or default
    //     return 2.0f;
    // }
}

class Square implements Shape, Shape2 {

    public int getMaxHeight() {
        return 10;
    }
}