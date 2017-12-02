package za.co.kholofelo.learn.java8.lumbda.default_methods;

import za.co.kholofelo.learn.java8.lumbda.entities.Person;

import javax.naming.OperationNotSupportedException;
import java.util.List;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/29.
 */

@FunctionalInterface
public interface RadioProgram {

    void speak(Person person, long duration);
    default List<Person> findAllHosts() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default Person findCurrentSpeaker() {
        System.out.println("Default impl");
        return null;
    }
}
