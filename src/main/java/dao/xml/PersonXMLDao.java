package dao.xml;

import dao.DaoException;
import dao.PersonDao;
import model.Person;

import java.util.List;

public class PersonXMLDao extends PersonDao {
    public PersonXMLDao() {
        super("person.xml");
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
