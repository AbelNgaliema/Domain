package za.ac.cput.abelngalema.Factory;

import za.ac.cput.abelngalema.Domain.Publisher;

import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class PublisherFactory {

    public static Publisher createPublisher(Map<String,String> value)
    {

        return new Publisher.Builder(value.get("name")).city(value.get("city")).registration(value.get("registration")).build();
    }

}
