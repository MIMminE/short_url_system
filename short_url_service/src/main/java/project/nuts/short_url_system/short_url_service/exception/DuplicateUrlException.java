package project.nuts.short_url_system.short_url_service.exception;

public class DuplicateUrlException extends RuntimeException {
    public DuplicateUrlException(String message) {
        super(message);
    }
}
