public class OverridingExceptions {
}

class InsufficientDataException extends Exception {}

class Reptile {

    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected boolean hasArms() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {
        return 2;
    }

    protected double getHeight() {
        return 3;
    }
}

class Snake extends Reptile {

    public boolean hasLegs() {
        return false;
    }

    // protected boolean hasArms() throws Exception {  // cannot throw broader exception
    //     return false;
    // }

    protected double getWeight() throws InsufficientDataException {
        return 2;
    }

    // protected double getHeight() throws InsufficientDataException {  // cannot throw exception
    //     return 3;
    // }
}
