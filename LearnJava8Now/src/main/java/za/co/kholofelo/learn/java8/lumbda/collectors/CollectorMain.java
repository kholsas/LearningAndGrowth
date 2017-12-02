package za.co.kholofelo.learn.java8.lumbda.collectors;

import java.util.*;

import static java.util.stream.Collectors.toSet;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/29.
 */
public class CollectorMain {

    public static void main(String[] args) {
        List<Integer> listOfAges = Arrays.asList(7, 32, 45, 97, 24, 75, 18, 54);

         listOfAges.stream().forEach(System.out::println);

        System.out.println("stream() with filter(?)");
        Set<Integer> listOfOldAges = listOfAges.stream().filter(age -> age > 20).collect(toSet());
        listOfOldAges.stream().forEach(System.out::println);

        System.out.println(System.lineSeparator() + "steam() with comparator");

        Optional<Integer> max = listOfAges.stream().max((val0, val1) -> val0 - val1);
        System.out.println(max);

        System.out.println("\nstream() with removeif(?)");

        listOfOldAges.removeIf(value -> value < 39);
        listOfOldAges.forEach(val -> System.out.print(val +", "));
    }
}
