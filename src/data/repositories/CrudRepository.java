package data.repositories;

/**
 * Created by Chirila on 11/28/2015.
 */
public interface CrudRepository<E,ID> {
    void save(E e);
    long size();
    Iterable<E> getAll();
}
