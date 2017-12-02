package za.co.kholofelo.examples.contracts;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import za.co.kholofelo.examples.model.Book;
import za.co.kholofelo.examples.resource.BookResource;

import java.util.List;

/**
 * @author Kholofelo.Maloma
 * @since 3/16/2017.
 */

public interface BookClient {

    @RequestLine("GET /{isbn}")
    BookResource findByIsbn(@Param("isbn") String isbn);

    @RequestLine("GET")
    List<BookResource> findAll();

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    void create(Book book);
}