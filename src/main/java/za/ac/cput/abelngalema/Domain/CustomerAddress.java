package za.ac.cput.abelngalema.Domain;

import java.io.Serializable;

/**
 * Created by Abel on 2016-04-02.
 */
public class CustomerAddress implements CustomerAddressInterface,Serializable {

    public String city;
    public String address;
    public int postalCode;
    public String getCity() {
       return this.city ;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public String getAddress() {
        return this.address;
    }



    public CustomerAddress(Builder builder)
    {
         this.address = builder.address;
         this.city = builder.city;
         this.postalCode = builder.postalCode;
    }

    public static class Builder
    {
        String city;
        String address;
        int postalCode;

        public Builder(String value)
        {
            this.address = value;
        }
        public Builder city(String value)
        {
            this.city = value;
            return this;
        }

        public Builder  postalCode(int value)
        {
            this.postalCode = value;
            return this;
        }

        public Builder copy(CustomerAddress customerAddress)
        {
            this.city = customerAddress.getCity();
            this.postalCode = customerAddress.getPostalCode();
            this.address = customerAddress.getAddress();
            return  this;
        }

        public CustomerAddress build()
        {
             return new CustomerAddress(this);
        }
    }
}
