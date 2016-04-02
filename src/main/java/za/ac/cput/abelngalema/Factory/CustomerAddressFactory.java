package za.ac.cput.abelngalema.Factory;

import za.ac.cput.abelngalema.Domain.CustomerAddress;

import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class CustomerAddressFactory {

    public static CustomerAddress createCustomerAddress(Map<String,String> value, int postalCode)
    {
        return  new CustomerAddress.Builder(value.get("address")).city(value.get("city")).postalCode(postalCode).build();
    }
}
