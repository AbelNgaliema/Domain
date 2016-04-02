package za.ac.cput.abelngalema.Domain;

/**
 * Created by Abel on 2016-04-02.
 */
public interface CustomerInterface {

    int getCredits();
    CustomerAddress getCustomerAddress();
    PersonalInformation getPersonalInformation();
}
