package za.ac.cput.abelngalema.Domain;

/**
 * Created by Abel on 2016-04-02.
 */
public interface BookInterface {

    int getYear();
    double getPrice();
    String getIsbnNumber();
    int getQuantity();
    String getTitle();
    Author getAuthor();
    Publisher getPublisher();


}
