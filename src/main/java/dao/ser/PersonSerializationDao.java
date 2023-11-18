package dao.ser;

import dao.DaoException;
import dao.PersonDao;
import model.Person;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class PersonSerializationDao extends PersonDao {
    public PersonSerializationDao() {
        super( "person.ser");
    }

    @Override
    public Person readFirst() throws DaoException {
        return null;
    }

    @Override
    public List<Person> readAll() throws DaoException {
       try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(getMediaFileName()))) {
          return  (List<Person>) ois.readObject();
       }catch (IOException | ClassNotFoundException exception){
           System.err.println(exception.getMessage());

       }
       return Collections.emptyList();
    }

    @Override
    public void write(Person entity) throws DaoException {

    }

    @Override
    public void writeAll(List<Person> entities) throws DaoException {
        String filename = getMediaFileName();

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(entities);
        }catch (IOException exception){
            System.err.println(exception.getMessage() );

        }
    }
}
