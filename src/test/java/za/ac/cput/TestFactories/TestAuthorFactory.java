package za.ac.cput.TestFactories;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.abelngalema.Domain.Author;
import za.ac.cput.abelngalema.Factory.AuthorFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class TestAuthorFactory extends TestCase {

    @Test
    public void testCreate()
    {
        Map<String,String> values = new HashMap<String,String>();
        values.put("name","Boniface");
        values.put("surname", "Kabaso");
        Author author = AuthorFactory.createAuthor(values);

        assertEquals("Boniface", author.getName());
        assertEquals("Kabaso", author.getSurname());

    }
    @Test
    public void testUpdate()
    {
        Map<String,String> values = new HashMap<String,String>();
        values.put("name","Hillary");
        values.put("", "Clinton");
        Author author = AuthorFactory.createAuthor(values);

        Author newAuthor = new Author.Builder(author.getName()).copy(author).surname("Golderbasehv").build();

        Assert.assertEquals("Hillary", newAuthor.getName());
        Assert.assertEquals("Golderbasehv", newAuthor.getSurname());
    }

}
