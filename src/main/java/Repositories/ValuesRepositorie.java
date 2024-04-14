package Repositories;

import java.util.List;

public interface ValuesRepositorie <T> {

    /**
     * inserts an entity and commits
     *
     * @param entity
     * @return the persisted entity
     */

    public T add(T entity);

    /**
     * reads an entity given its ID
     *
     * @param id
     * @return
     */
    public T findById(Long id);

    /**
     * Returns the List of all entities in the persistence store
     *
     * @return
     */

    public List<T> listarTodos();
}
