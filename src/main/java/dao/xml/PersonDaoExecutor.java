package dao.xml;

import dao.DaoException;
import dao.PersonDao;
import model.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonDaoExecutor {
private PersonDao personDao;


public PersonDaoExecutor(PersonDao personDao){
    this.personDao=personDao;

}

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void saveAllPersons(List<Person>personList)  {
     try {
         personDao.writeAll(personList);
     } catch (DaoException e) {
         System.err.println(e.getMessage());
     }
 }
 public List<Person> findAllPersons(){
     try {
        List<Person> personList=  personDao.readAll();
        return personList;
     } catch (DaoException e) {
         System.err.println(e.getMessage());


     }
     return Collections.emptyList();
 }
}
