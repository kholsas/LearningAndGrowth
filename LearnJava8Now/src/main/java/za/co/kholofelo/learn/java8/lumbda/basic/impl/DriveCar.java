package za.co.kholofelo.learn.java8.lumbda.basic.impl;

import za.co.kholofelo.learn.java8.lumbda.entities.Person;
import za.co.kholofelo.learn.java8.lumbda.basic.service.WheelService;

import java.util.function.Function;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/29.
 */
public class DriveCar {

    public static void main(String[] args) {
        System.out.println("About to Spin some tyres: 1: ");
        WheelService wheelService1 = turnsPerMinute -> System.out.println("Turning Wheel 1 at " + turnsPerMinute + " turns per minute");

        DriveCar driveCar = new DriveCar();

        driveCar.spinTyres(wheelService1, 40);

        driveCar.spinTyres(turnsPerM -> {
            System.out.println("\nNow turning Wheel 2 at " + turnsPerM + " turns per minute.");
            System.out.println("How was the spin? I felt the ground getting excited. " + turnsPerM + " isn't too bad!");
        }, 32);

        Function<Person, String> anotherToBenamed = (Person person) -> {

            System.out.println("\nBefore updating data, let's see how it looked like.\n" + person);
            double income = person.getIncome();
            System.out.println("We have just learned that " + person.getFirstName() + " earns R" + income);
            System.out.println("Now let's update " + person.getFirstName() + "'s income information! We gotta double that amount!");
            person.setIncome(income * 2);
            System.out.println("Now, after updating this information, let us see how much " + person.getFirstName() +" gets paid ...\n\t" + person);
            return person.toString();
        };


        Person person = new Person("Kholofelo", "Maloma", 100);
        driveCar.unknownFunction(anotherToBenamed, person);
    }

    public void spinTyres(WheelService wheelService, long turnsPerMinute) {
        wheelService.spinWheelRPM(turnsPerMinute);
    }

    public void unknownFunction(Function<Person, String> function, Person person) {
        function.apply(person);
    }
}
