package dao.txt;

import dao.DaoException;
import dao.PersonDao;
import model.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.*;

public class PersonTxtDao extends PersonDao {
    public PersonTxtDao() {
        super("person.txt");
    }

    @Override
    public Person readFirst() throws DaoException {
        return null;
    }

    @Override
    public List<Person> readAll() throws DaoException {
        String filename = getMediaFileName();
        List<Person> personList = new ArrayList<>();
        try(Scanner scanner = new Scanner(new FileReader(filename))){
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                //String []  properties = line.split(",");
                StringTokenizer stringTokenizer = new StringTokenizer(line,",");
                String name = stringTokenizer.nextToken();
                String surname = stringTokenizer.nextToken();
                String nin = stringTokenizer.nextToken();
                String birthday = stringTokenizer.nextToken();
                StringTokenizer dateTokenizer = new StringTokenizer(birthday,"-");
                int year = Integer.parseInt(dateTokenizer.nextToken());
                int month = Integer.parseInt(dateTokenizer.nextToken());
                int day = Integer.parseInt(dateTokenizer.nextToken());
                LocalDate birthdayLocalDate = LocalDate.of(year,month,day);
                Person person = new Person(nin,name,surname,birthdayLocalDate);
                personList.add(person);

            }
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }



        return personList;
    }

    @Override
    public void write(Person entity) throws DaoException {

    }

    @Override
    public void writeAll(List<Person> persons) throws DaoException {
        if (persons == null || persons.isEmpty()) {
            throw new DaoException("Nemoj mi molim te slati praznu list persona....");


        }
        String filename = getMediaFileName();
        try (PrintWriter out = new PrintWriter(new FileWriter(filename));
        ) {
            for (Person person :persons) {
             String line1 = new StringBuilder().append(person.getName()).append(",").append(person.getSurname()).append("," ).append(person.getNationalIdentificationNumber()).append(",").append(person.getBirthday()).toString();
                String line = new StringJoiner(",").add(person.getName()).add(person.getSurname()).add(person.getNationalIdentificationNumber()).add(person.getBirthday().toString()).toString();
             out.println(line);

            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());


        }

    }
}
