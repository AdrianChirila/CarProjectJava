package data.models;

/**
 * Created by Chirila on 11/29/2015.
 */
public interface Validator<E> {
    Errors validate(E e);
}
