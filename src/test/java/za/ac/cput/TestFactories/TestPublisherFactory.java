package za.ac.cput.TestFactories;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.abelngalema.Domain.Publisher;
import za.ac.cput.abelngalema.Factory.PublisherFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class TestPublisherFactory extends TestCase {

    @Test

    public void testCreate()
    {


        Map<String,String> values =  new HashMap<String,String>();
        values.put("name", "SkyRock");
        values.put("city","Cape Town");
        values.put("registration","c123idfr");

        Publisher publisher = PublisherFactory.createPublisher(values);

        assertEquals("SkyRock", publisher.getName());
        assertEquals("Cape Town", publisher.getCity());
        assertEquals("c123idfr", publisher.getRegistration());


    }

    @Test
    public void testUpdate()
    {
        Map<String,String> values =  new HashMap<String,String>();
        values.put("name", "SkyRock");
        values.put("city", "Cape Town");
        values.put("registration","c123idfr");

        Publisher publisher = PublisherFactory.createPublisher(values);

        Publisher newPublisher = new Publisher.Builder(values.get("name")).copy(publisher).city("JHB").build();
        assertEquals("SkyRock", newPublisher.getName());
        assertEquals("JHB", newPublisher.getCity());
        assertEquals("c123idfr", newPublisher.getRegistration());


    }

}
