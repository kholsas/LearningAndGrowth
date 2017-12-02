
package za.co.kholofelo.examples.ejbs.stateless;

import javax.ejb.Remote;
import java.util.List;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/08.
 */

@Remote
public interface LibrarySessionBeanRemote {

    void addBook(String bookTitle);
    List<String> listBooks();
}
