package za.ac.cput.abelngalema.Domain;

import java.io.Serializable;

/**
 * Created by Abel on 2016-04-02.
 */
public class Customer implements CustomerInterface,Serializable {


    private CustomerAddress customerAddress;
    private PersonalInformation personalInformation;
    private int credits;

    public int getCredits() {
       return  this.credits;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public Customer(Builder builder)
    {
         this.credits = builder.credits;
         this.customerAddress = builder.customerAddress;
         this.personalInformation = builder.personalInformation;
    }

    public static class Builder
    {
        CustomerAddress customerAddress;
        PersonalInformation personalInformation;
        int credits;

        public Builder (int credits)
        {
            this.credits = credits;

        }
        public Builder CustomerAddress(CustomerAddress customerAddress)
        {
             this.customerAddress = customerAddress;
             return this;
        }

        public Builder PersonalInformation(PersonalInformation personalInformation)
        {
            this.personalInformation = personalInformation;
            return this;
        }


        public Builder copy(Customer customer)
        {
             this.credits = customer.getCredits();
             this.personalInformation = customer.getPersonalInformation();
             this.customerAddress = customer.getCustomerAddress();
             return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }
    }



}
