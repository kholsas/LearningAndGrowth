package za.co.kholofelo.learn.java8.lumbda.methodreferences;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/29.
 *
 * Difference between Function and Consumer is this: They are both Functional interfaces whose methods take only one input,
 * however, Consumer must return void, whereas Function returns a value
 */
public class MethodRefMain {

    public static void main(String[] args) {
        Function<String, Integer> toIntConverter = Integer::parseInt;
        Function<String, Double> toDoubleConverter = input ->{
            System.out.println("Converting String input to Double\n");
            return Double.parseDouble(input);};

        System.out.println("Method Ref: To-Int Converter: --> " + toIntConverter.apply("212"));
        System.out.println("Method Ref: To-Double Converter: --> " + toDoubleConverter.apply("96.5512629"));

        Consumer<String>  stringConsumer = System.out::println;
    }


}
