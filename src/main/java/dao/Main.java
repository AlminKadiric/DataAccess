package dao;

import dao.ser.PersonSerializationDao;
import dao.txt.PersonTxtDao;
import dao.xml.PersonDaoExecutor;
import dao.xml.PersonXMLDao;
import model.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("1121213", "Mirsad", "Skandro", LocalDate.of(1999, 1, 1)),
                new Person("2221213", "Edin", "Dzaferagic", LocalDate.of(1998, 1, 1)),
                new Person("32221213", "Selma", "Mustafic", LocalDate.of(1999, 1, 1)),
                new Person("12131213", "Nedim", "Tutic", LocalDate.of(1999, 1, 1)),
                new Person("33333333", "Nedim", "Korcic", LocalDate.of(1999, 1, 1)),
                new Person("542312131", "Emir", "Pasagic", LocalDate.of(1999, 1, 1)),
                new Person("12319241", "Dino", "Celikovic", LocalDate.of(1999, 1, 1))
        );
//        PersonDaoExecutor personDaoExecutor = new PersonDaoExecutor(new PersonTxtDao());
//        List<Person>personList = personDaoExecutor.findAllPersons();
//        personList.forEach(System.out::println);


//   Main main = new Main();
//   PersonConsumer personConsumer = main.new PersonConsumer();
//        PersonTester personTester = new PersonTester();
//        PersonConsumer personConsumer = new PersonConsumer();
//       personList.stream().filter(personTester).forEach(personConsumer);
        PersonDaoExecutor personDaoExecutor = new PersonDaoExecutor(new PersonTxtDao());
//personDaoExecutor.saveAllPersons(personList);
        personDaoExecutor.setPersonDao(new PersonSerializationDao());
        personDaoExecutor.saveAllPersons(personList);
        personDaoExecutor.findAllPersons().forEach(System.out::println);


    }

    private static class PersonTester implements Predicate<Person> {

        @Override
        public boolean test(Person person) {
            System.out.println("Ko si...." + person.getName());

            return !person.getName().equalsIgnoreCase("kenan");
        }
    }

    private static class PersonConsumer implements Consumer<Person> {

        @Override
        public void accept(Person person) {
            System.out.println(person);

        }
    }
}
