package za.ac.cput.TestFactories;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.abelngalema.Domain.*;
import za.ac.cput.abelngalema.Factory.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class TestBuyFactory extends TestCase {


    @Test

    public void testCreate()
    {
        //author created
        Map<String,String> values = new HashMap<String,String>();
        values.put("name","Boniface");
        values.put("surname", "Kabaso");
        Author author = AuthorFactory.createAuthor(values);

        //Publisher created

        Map<String,String> values2 =  new HashMap<String,String>();
        values2.put("name", "SkyRock");
        values2.put("city","Cape Town");
        values2.put("registration","c123idfr");

        Publisher publisher = PublisherFactory.createPublisher(values2);


        //Book Object
        Map<String,String> values3 =  new HashMap<String,String>();
        values3.put("isbn", "88878-4445544");
        values3.put("title","Testing");;
        Book book = BookFactory.creaBook(values3, 2014, 23, 120.00, publisher, author);

        //Customer Address object created
        Map<String, String> values4 = new HashMap<String,String>();
        values4.put("address", "58 Victoria Rd. Southfield");
        values4.put("city", "Cape Town");

        CustomerAddress customerAddress = CustomerAddressFactory.createCustomerAddress(values4, 7800);

        //PersonalInfromation Object Created
        Map<String, String> values1 = new HashMap<String,String>();
        values1.put("name","Abel");
        values1.put("surname","Ngaliema");
        values1.put("idNumber","12223944");
        values1.put("email", "abeln@dipar.co.za");

        PersonalInformation personalInformation = PersonalInformationFactory.createPersonalInformation(values1, 02100000, 0210000000);


        Customer  customer = CustomerFactory.createCustomer(100, customerAddress, personalInformation);
        Map<String, String> values5 = new HashMap<String,String>();
        values5.put("mode","Cash");
        values5.put("cashier","Bingo");

        //Buy object
        Buy buy = BuyFactory.createBuy(values5,book,customer);
        //Test
        assertEquals("Cash", buy.getMode());
        assertEquals("Bingo", buy.getCashier());
        assertEquals("88878-4445544", buy.getBook().getIsbnNumber());
        assertEquals("Testing", buy.getBook().getTitle());
        assertEquals(2014, buy.getBook().getYear());
        assertEquals(23, buy.getBook().getQuantity());
        assertEquals(120.00, buy.getBook().getPrice());
        assertEquals("Boniface", buy.getBook().getAuthor().getName());
        assertEquals("Kabaso", buy.getBook().getAuthor().getSurname());
        assertEquals("SkyRock", buy.getBook().getPublisher().getName());
        assertEquals("Cape Town", buy.getBook().getPublisher().getCity());
        assertEquals("c123idfr", buy.getBook().getPublisher().getRegistration());
        assertEquals(100, buy.getCustomer().getCredits());
        assertEquals("58 Victoria Rd. Southfield", buy.getCustomer().getCustomerAddress().getAddress());
        assertEquals("Cape Town", buy.getCustomer().getCustomerAddress().getCity());
        assertEquals(7800, buy.getCustomer().getCustomerAddress().getPostalCode());
        assertEquals("Abel", buy.getCustomer().getPersonalInformation().getName());
        assertEquals("Ngaliema", buy.getCustomer().getPersonalInformation().getSutname());
        assertEquals("12223944", buy.getCustomer().getPersonalInformation().getIdNumber());
        assertEquals("abeln@dipar.co.za", buy.getCustomer().getPersonalInformation().getEmailAddress());
    }

    @Test
    public void testUpdate()
    {
        //author created
        Map<String,String> values = new HashMap<String,String>();
        values.put("name","Boniface");
        values.put("surname", "Kabaso");
        Author author = AuthorFactory.createAuthor(values);

        //Publisher created

        Map<String,String> values2 =  new HashMap<String,String>();
        values2.put("name", "SkyRock");
        values2.put("city","Cape Town");
        values2.put("registration","c123idfr");

        Publisher publisher = PublisherFactory.createPublisher(values2);


        //Book Object
        Map<String,String> values3 =  new HashMap<String,String>();
        values3.put("isbn", "88878-4445544");
        values3.put("title","Testing");;
        Book book = BookFactory.creaBook(values3, 2014, 23, 120.00, publisher, author);

        //Customer Address object created
        Map<String, String> values4 = new HashMap<String,String>();
        values4.put("address", "58 Victoria Rd. Southfield");
        values4.put("city", "Cape Town");

        CustomerAddress customerAddress = CustomerAddressFactory.createCustomerAddress(values4, 7800);

        //PersonalInfromation Object Created
        Map<String, String> values1 = new HashMap<String,String>();
        values1.put("name","Abel");
        values1.put("surname","Ngaliema");
        values1.put("idNumber","12223944");
        values1.put("email", "abeln@dipar.co.za");

        PersonalInformation personalInformation = PersonalInformationFactory.createPersonalInformation(values1, 02100000, 0210000000);


        Customer  customer = CustomerFactory.createCustomer(100, customerAddress, personalInformation);
        Map<String, String> values5 = new HashMap<String,String>();
        values5.put("mode","Cash");
        values5.put("cashier","Bingo");
        Buy buy = BuyFactory.createBuy(values5,book,customer);

        Buy newBuy =  new Buy.Builder(buy.getCashier()).copy(buy).mode("Swipe").build();

        //Test
        assertEquals("Swipe", newBuy.getMode());
        assertEquals("Bingo", newBuy.getCashier());
        assertEquals("88878-4445544", newBuy.getBook().getIsbnNumber());
        assertEquals("Testing", newBuy.getBook().getTitle());
        assertEquals(2014, newBuy.getBook().getYear());
        assertEquals(23, newBuy.getBook().getQuantity());
        assertEquals(120.00, newBuy.getBook().getPrice());
        assertEquals("Boniface", newBuy.getBook().getAuthor().getName());
        assertEquals("Kabaso", newBuy.getBook().getAuthor().getSurname());
        assertEquals("SkyRock", newBuy.getBook().getPublisher().getName());
        assertEquals("Cape Town", newBuy.getBook().getPublisher().getCity());
        assertEquals("c123idfr", newBuy.getBook().getPublisher().getRegistration());
        assertEquals(100, newBuy.getCustomer().getCredits());
        assertEquals("58 Victoria Rd. Southfield", newBuy.getCustomer().getCustomerAddress().getAddress());
        assertEquals("Cape Town", newBuy.getCustomer().getCustomerAddress().getCity());
        assertEquals(7800, newBuy.getCustomer().getCustomerAddress().getPostalCode());
        assertEquals("Abel", newBuy.getCustomer().getPersonalInformation().getName());
        assertEquals("Ngaliema", newBuy.getCustomer().getPersonalInformation().getSutname());
        assertEquals("12223944", newBuy.getCustomer().getPersonalInformation().getIdNumber());
        assertEquals("abeln@dipar.co.za", newBuy.getCustomer().getPersonalInformation().getEmailAddress());




    }

}
