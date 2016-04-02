package za.ac.cput.TestFactories;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.abelngalema.Domain.PersonalInformation;
import za.ac.cput.abelngalema.Factory.PersonalInformationFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class TestPersonalInformationFactory extends TestCase {

    @Test
    public void testCreate()
    {
        Map<String, String> values = new HashMap<String,String>();
        values.put("name","Abel");
        values.put("surname","Ngaliema");
        values.put("idNumber","12223944");
        values.put("email", "abeln@dipar.co.za");

        PersonalInformation personalInformation = PersonalInformationFactory.createPersonalInformation(values,02100000, 0210000000);

        assertEquals("Abel", personalInformation.getName());
        assertEquals("Ngaliema", personalInformation.getSutname());
        assertEquals("12223944", personalInformation.getIdNumber());
        assertEquals("abeln@dipar.co.za", personalInformation.getEmailAddress());
        assertEquals(02100000, personalInformation.getCellnumber());
        assertEquals(0210000000, personalInformation.getTelephone());

    }
    @Test
    public void testUpdate()
    {
        Map<String, String> values = new HashMap<String,String>();
        values.put("name","Abel");
        values.put("surname","Ngaliema");
        values.put("idNumber","12223944");
        values.put("email", "abeln@dipar.co.za");

        PersonalInformation personalInformation = PersonalInformationFactory.createPersonalInformation(values,02100000, 0210000000);

        PersonalInformation personalInformationCopy = new PersonalInformation.Builder(personalInformation.getIdNumber()).
                copy(personalInformation).name("Othniel").build();

        assertEquals("Othniel", personalInformationCopy.getName());
        assertEquals("Ngaliema", personalInformationCopy.getSutname());
        assertEquals("12223944", personalInformationCopy.getIdNumber());
        assertEquals("abeln@dipar.co.za", personalInformationCopy.getEmailAddress());
        assertEquals(02100000, personalInformationCopy.getCellnumber());
        assertEquals(0210000000, personalInformationCopy.getTelephone());
    }

}
