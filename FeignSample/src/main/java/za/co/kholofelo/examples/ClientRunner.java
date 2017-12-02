package za.co.kholofelo.examples;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import za.co.kholofelo.examples.contracts.BookClient;
import za.co.kholofelo.examples.resource.BookResource;

import java.util.List;

/**
 * @author Kholofelo.Maloma
 * @since 3/16/2017.
 */
public class ClientRunner {

    private static BookClient bookClient;

    public static void main(String[] args) {
        config();

        List<BookResource> books = bookClient.findAll();
        for (BookResource book : books) {
            System.out.println("-----------------------------\n");
            System.out.println("Author\t:\t" + book.getBook().getAuthor());
            System.out.println("Title\t:\t" + book.getBook().getTitle());
            System.out.println("Lanuage\t:\t" + (book.getBook().getLanguage() == null ? "N/A" : book.getBook().getSynopsis()));
            System.out.println("About the book:\n" + (book.getBook().getSynopsis() == null ? "N/A" : book.getBook().getSynopsis()));
        }
    }

    private static void config() {
        bookClient = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(BookClient.class))
                .logLevel(Logger.Level.FULL)
                .target(BookClient.class, "http://localhost:8081/api/books");

    }
}
