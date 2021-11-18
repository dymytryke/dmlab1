package test;

class SetOutOfBoundsUniverse extends RuntimeException {
    public SetOutOfBoundsUniverse(String msg) {
        super(msg);
    }

    public SetOutOfBoundsUniverse(Throwable cause) {
        super(cause);
    }

    public SetOutOfBoundsUniverse() {
        super("Out of bounds Universe");
    }
}