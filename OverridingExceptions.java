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

    // protected boolean hasArms() throws Exception {  // cannot throw broader checked exception
    //     return false;
    // }

    protected double getWeight() throws InsufficientDataException {
        return 2;
    }

    // protected double getHeight() throws InsufficientDataException {  // cannot throw checked exception
    //     return 3;
    // }
    protected double getHeight() throws RuntimeException {  // since this exception is not checked exception, no problem.
        return 3;
    }
}

class Q {
    Number get() {
        return 1.0;
    }
}

class W extends Q {
    Double get() {
        return 0.1;
    }
}