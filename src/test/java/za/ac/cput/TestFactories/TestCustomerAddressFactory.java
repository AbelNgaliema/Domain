package za.ac.cput.TestFactories;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.abelngalema.Domain.CustomerAddress;
import za.ac.cput.abelngalema.Factory.CustomerAddressFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class TestCustomerAddressFactory extends TestCase {

    @Test
    public void testCreate()
    {

        Map<String, String> values = new HashMap<String,String>();
        values.put("address", "58 Victoria Rd. Southfield");
        values.put("city", "Cape Town");

        CustomerAddress customerAddress = CustomerAddressFactory.createCustomerAddress(values,7800);

        assertEquals("58 Victoria Rd. Southfield", customerAddress.getAddress());
        assertEquals("Cape Town", customerAddress.getCity());
        assertEquals(7800, customerAddress.getPostalCode());

    }

    @Test
    public void testUpdate()
    {
        Map<String, String> values = new HashMap<String,String>();
        values.put("address", "58 Victoria Rd. Southfield");
        values.put("city", "Cape Town");

        CustomerAddress customerAddress = CustomerAddressFactory.createCustomerAddress(values,7800);

        CustomerAddress copyCustomerAddress = new CustomerAddress.Builder(customerAddress.getAddress()).copy(customerAddress).city("JHB").build();

        assertEquals("58 Victoria Rd. Southfield", copyCustomerAddress.getAddress());
        assertEquals("JHB", copyCustomerAddress.getCity());
        assertEquals(7800, copyCustomerAddress.getPostalCode());


    }

}
