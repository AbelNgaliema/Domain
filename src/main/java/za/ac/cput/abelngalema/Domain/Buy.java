package za.ac.cput.abelngalema.Domain;

import java.io.Serializable;

/**
 * Created by Abel on 2016-04-02.
 */
public class Buy implements  BuyInterface,Serializable {


    private String cashier;
    private String mode;
    private Book book;
    private Customer customer;

    public String getCashier() {
        return cashier;
    }

    public String getMode() {
        return mode;
    }

    public Book getBook() {
        return  book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Buy(Builder builder)
    {
        this.cashier = builder.cashier;
        this.mode = builder.mode;
        this.book = builder.book;
        this.customer = builder.customer;
    }

    public static class Builder
    {

        String cashier;
        String mode;
        Book book;
        Customer customer;

        public Builder (String value)
        {
             this.cashier = value;
        }

        public Builder mode(String value)
        {
            this.mode= value;
            return this;
        }

        public Builder book(Book object)
        {
            this.book = object;
            return this;
        }

        public Builder customer(Customer customer)
        {
            this.customer = customer;
            return this;
        }

        public Builder copy(Buy buy)
        {
             this.cashier = buy.getCashier();
             this.mode = buy.getMode();
             this.book = buy.getBook();
             this.customer = buy.getCustomer();
             return this;
        }

        public Buy build()
        {
             return  new Buy(this);
        }
    }
}
