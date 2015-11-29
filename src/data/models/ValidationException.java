package data.models;

/**
 * Created by Chirila on 11/29/2015.
 */
public class ValidationException extends RuntimeException {
    private Errors errors;

    public ValidationException(Errors errors) {
        this.errors = errors;
    }
}
