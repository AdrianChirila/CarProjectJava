package data.repositories;

import data.models.Errors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import data.models.Validator;
import data.models.ValidationException;

/**
 * Created by Chirila on 11/28/2015.
 */
public abstract class AbstractCrudRepository<E,ID> implements CrudRepository<E,ID> {
    protected List<E> entities = new ArrayList<>();

    public void save(E e) {
        Errors errors = validate(e);
        if (errors.size() > 0 ) {
            throw new ValidationException(errors);
        }

        setEntityId(e);
        entities.add(e);
    }

    public abstract Errors validate(E e);

    public long size() {
        return entities.size();
    }

    public abstract void setEntityId(E e);

    public Iterable<E> getAll() {
        return entities;
    }
}
