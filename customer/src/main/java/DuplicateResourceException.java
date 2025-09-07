public class DuplicateResourceException extends RuntimeException {
    public DuplicateResourceException(String string) {
        super(string);
    }

    public DuplicateResourceException(String string, Throwable throwable) {
        super(string, throwable);
    }
}
