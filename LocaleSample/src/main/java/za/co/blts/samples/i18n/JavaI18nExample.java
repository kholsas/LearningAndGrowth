package za.co.blts.samples.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Kholofelo Maloma
 * @since 3/23/2017.
 */
public class JavaI18nExample {

    public static void main(String[] args) {
        //Default bundle
        ResourceBundle resourceBundle = ResourceBundle.getBundle("ApplicationMessages", Locale.getDefault());
        ResourceBundle resourceBundleFr = ResourceBundle.getBundle("ApplicationMessages", Locale.FRANCE);

        printMessages(resourceBundle);
        printMessages(resourceBundleFr);
    }

    private static void printMessages(ResourceBundle bundle) {
        System.out.println(bundle.getString("CountryName"));
        System.out.println(bundle.getString("CurrencyCode"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(bundle.getString("FirstSomething"));
    }
}