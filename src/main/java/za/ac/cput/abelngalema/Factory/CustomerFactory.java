package za.ac.cput.abelngalema.Factory;

import za.ac.cput.abelngalema.Domain.Customer;
import za.ac.cput.abelngalema.Domain.CustomerAddress;
import za.ac.cput.abelngalema.Domain.PersonalInformation;

/**
 * Created by Abel on 2016-04-02.
 */
public class CustomerFactory {

    public static Customer createCustomer(int credits, CustomerAddress customerAddress,PersonalInformation personalInformation)
    {
        return new Customer.Builder(credits).CustomerAddress(customerAddress).PersonalInformation(personalInformation).build();
    }
}
