package za.ac.cput.abelngalema.Factory;

import za.ac.cput.abelngalema.Domain.Author;

import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class AuthorFactory {

    public static Author createAuthor(Map<String,String> value){
        return new Author.Builder(value.get("name")).surname(value.get("surname")).build();
    }
}
