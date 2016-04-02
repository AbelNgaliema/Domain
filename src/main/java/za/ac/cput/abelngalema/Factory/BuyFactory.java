package za.ac.cput.abelngalema.Factory;

import za.ac.cput.abelngalema.Domain.Book;
import za.ac.cput.abelngalema.Domain.Buy;
import za.ac.cput.abelngalema.Domain.Customer;

import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class BuyFactory {

    public static Buy createBuy(Map<String,String> value, Book book, Customer customer)
    {
        return new Buy.Builder(value.get("cashier")).mode(value.get("mode")).book(book).customer(customer).build();
    }
}
