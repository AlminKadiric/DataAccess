package dao;

import java.util.List;

public interface Dao <E>{
    public E readFirst() throws DaoException;


    public List<E> readAll() throws DaoException;

    public void write(E entity) throws DaoException;

    public void writeAll(List<E> entities) throws DaoException;
}
