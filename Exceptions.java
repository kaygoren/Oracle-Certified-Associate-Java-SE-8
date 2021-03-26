class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }

public class Exceptions {

    public void rightOrderOfExceptionsInCatch() {
        try {} 
        catch(ExhibitClosedForLunch e) {}
        catch(ExhibitClosed e) {}
    }
    // public void wrongOrderOfExceptionsInCatch() {  // compile error!! subclass must be used first in catch blocks
    //     try {}
    //     catch(ExhibitClosed e) {}
    //     catch(ExhibitClosedForLunch e) {}
    // }
    public void withoutCatch() {  // if there is no catch block with try, then finally must be there.
        try {}
        finally {}
    }

    public static void main(String... args) {

        Exceptions ex = new Exceptions();
        System.out.println(ex.resultWithoutCatch());
        System.out.println(ex.resultWithCatch());

        String v = null;
        try {
            try {
                v.length();
            } catch(NullPointerException e) {
                throw new Exception();
            }finally {
                throw new RuntimeException();  // exception in finally block will mask exception in catch.
                                               // since Runtime masks the other, code compiles but throw exception while running.
                                               // if Exception would mask RuntimeException, code did not compile. it must be caught or declared.
                                               // the reason of this behaviour is checked / unchecked exception types. 
            }
        } finally {}
        // System.out.println("unreachable code");  // compile error
    }

    public String resultWithoutCatch() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before ";
                v.length();
                result += "after ";
            } finally {
                result += "finally ";
                throw new Exception();
            }
        } catch(Exception e) {
            result += "done ";
        } finally {}
        result += "!!!!";
        return result;
    }

    public String resultWithCatch() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before ";
                v.length();
                result += "after ";
            } catch(NullPointerException e) {
                result += "catch ";
                throw new Exception();
            }finally {
                result += "finally ";
                throw new Exception();
            }
        } catch(Exception e) {
            result += "done ";
        }
        return result;
    }
}