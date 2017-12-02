package za.co.kholofelo.examples.ejbs.stateless;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/08.
 */
public class LibrarySessionBean implements LibrarySessionBeanRemote {

    private List<String> bookShelf;

    public LibrarySessionBean() {
        bookShelf = new ArrayList<>();
    }

    @Override
    public void addBook(String bookTitle) {
        bookShelf.add(bookTitle);
    }

    @Override
    public List<String> listBooks() {
        return bookShelf;
    }
}
