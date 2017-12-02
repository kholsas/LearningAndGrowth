package za.co.kholofelo.learn.java8.lumbda.consumer;

import za.co.kholofelo.learn.java8.lumbda.entities.Person;

import java.util.function.Consumer;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/30.
 */
public class ConsumerTest {

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();
        Person person = new Person("Kholofelo", "Maloma", 532);

        Consumer<Person> personNameConsumer = ConsumerTest::printName;
        Consumer<Person> personIncomeConsumer = ConsumerTest::printIncome;
        Consumer<Person> personSurnameConsumer = consumerTest::printSurname;


        personNameConsumer.andThen(personIncomeConsumer).andThen(personSurnameConsumer).accept(person);

    }

    public static void printName(Person person) {
        System.out.println(person.getFirstName());
    }

    public static void printIncome(Person person) {
        System.out.println(person.getIncome());
    }

    public void printSurname(Person person) {
        System.out.println(person.getLastName());
    }
}
