package test;

class NotSetException extends RuntimeException {
    NotSetException(String msg) {
        super(msg);
    }

    NotSetException(Throwable cause) {
        super(cause);
    }

    NotSetException() {
        super("Not a Set");
    }
}
