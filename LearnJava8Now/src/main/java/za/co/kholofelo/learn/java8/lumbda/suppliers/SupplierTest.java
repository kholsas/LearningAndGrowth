package za.co.kholofelo.learn.java8.lumbda.suppliers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/30.
 */
public class SupplierTest {

    public static void main(String[] args) {
        List<String> values = Arrays.asList("Apple", "Flight", "Java8", "ShowMax");

        values.stream().forEach(val -> {
            Supplier<String> supplier = () -> val;
            printValue(supplier);
        });

    }

    public static void printValue(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
