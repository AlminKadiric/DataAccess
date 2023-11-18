package dao.json;

import dao.DaoException;
import dao.PersonDao;
import model.Person;

import java.util.List;

public class PersonJSONDao extends PersonDao {
    public PersonJSONDao() {
        super("person.json");
    }

    @Override
    public Person readFirst() throws DaoException {
        return null;
    }

    @Override
    public List<Person> readAll() throws DaoException {
        return null;
    }

    @Override
    public void write(Person entity) throws DaoException {

    }

    @Override
    public void writeAll(List<Person> entities) throws DaoException {

    }
}
