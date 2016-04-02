package za.ac.cput.abelngalema.Domain;

import java.io.Serializable;

/**
 * Created by Abel on 2016-04-02.
 */
public class Book implements BookInterface, Serializable {

    private  int year;
    private double price;
    private int quantity;
    private String isbnNumber;
    private Author author;
    private  Publisher publisher;
    private String title;

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return  title;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Book(Builder builder)
    {
        this.title = builder.title;
        this.isbnNumber = builder.isbnNumber;
        this.price =  builder.price;
        this.year = builder.year;
        this.quantity = builder.quantity;
        this.author = builder.author;
        this.publisher = builder.publisher;
    }

    public static class Builder
    {
        int year;
        int quantity;
        Author author;
        String isbnNumber;
        Publisher publisher;
        double price;
        String title;

        public Builder(String value)
        {
             this.isbnNumber = value;
        }

        public Builder year(int value)
        {
            this.year =  value;
            return this;
        }

        public Builder quantity(int value)
        {
            this.quantity = value;
            return this;
        }

        public Builder price(double value)
        {
             this.price = value;
             return  this;
        }

        public Builder author(Author object)
        {
             this.author = object;
             return this;
        }
        public Builder title(String value)
        {
             this.title = value;
             return  this;
        }

        public Builder publisher(Publisher object)
        {
            this.publisher = object;
            return  this;
        }

        public Builder copy(Book book)
        {
            this.isbnNumber = book.getIsbnNumber();
            this.price = book.getPrice();
            this.quantity = book.getQuantity();
            this.year = book.getYear();
            this.author = book.getAuthor();
            this.publisher = book.getPublisher();
            this.title = book.getTitle();
            return this;
        }

        public Book build()
        {
            return  new Book(this);
        }

    }
}
