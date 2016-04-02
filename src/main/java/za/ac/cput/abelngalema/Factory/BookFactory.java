package za.ac.cput.abelngalema.Factory;

import za.ac.cput.abelngalema.Domain.Author;
import za.ac.cput.abelngalema.Domain.Book;
import za.ac.cput.abelngalema.Domain.Publisher;

import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class BookFactory {

    public static Book creaBook(Map<String,String>value, int year,int qty, double price,Publisher publisher, Author author){
        return new Book.Builder(value.get("isbn")).title(value.get("title")).year(year).quantity(qty).price(price).publisher(publisher).author(author).build();
    }
}
