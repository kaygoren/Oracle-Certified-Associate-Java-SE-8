public class InterfaceDefaultMethodAndStaticMethod { 
}

interface Hop {
    static int getJumpHeight() {
        return 8;
    }
}

interface Zip {
    static int getJumpHeight() {
        return 10;
    }
}

class Bunny implements Hop {
    
    public int getDetails() {
        // return getJumpHeight();  // does not compile, static methods from interfaces can not be inherited.
        return Hop.getJumpHeight();
    }
}

class LittleBunny implements Hop, Zip {}  //no error!! since static interface method has to be used with interface name, no conflict.
/*
*****************************************************************************************************************************
*/
interface HasTeeth {
    public default int getNumber() {
        return 5;
    }
}

interface HasFins {
    public default int getNumber() {
        return 4;
    }
    public default double getLongestFinLength() {
        return 20.0;
    }
    public default boolean doFinsHaveScales() {
        return true;
    }
}

interface FishFamily extends HasFins {
    public default int getNumber() {
        return 8;
    }

    public double getLongestFinLength();  // classes which implement this interface have to implement the method.

    // public boolean doFinsHaveScales() {  // without default or static, method body can not exist.
    //     return false;
    // }
}

// class Shark implements HasTeeth, HasFins{}  // does not compile, can not decide which default interface method is used

class Shark implements HasTeeth, HasFins {
    public int getNumber() {
        return 6;
    }
}
