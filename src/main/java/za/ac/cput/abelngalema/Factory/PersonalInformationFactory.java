package za.ac.cput.abelngalema.Factory;

import za.ac.cput.abelngalema.Domain.PersonalInformation;

import java.util.Map;

/**
 * Created by Abel on 2016-04-02.
 */
public class PersonalInformationFactory {

    public static PersonalInformation createPersonalInformation (Map<String, String> value,int cellphone, int telephone)
    {
        return  new PersonalInformation.Builder(value.get("idNumber")).name(value.get("name")).surname(value.get("surname")).
                email(value.get("email")).cellphone(cellphone).telephone(telephone).build();
    }
}
