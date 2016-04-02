package za.ac.cput.abelngalema.Domain;

import java.io.Serializable;

/**
 * Created by Abel on 2016-04-02.
 */
public class Author implements Serializable, AuthorInterface {

    private String name;
    private String surname;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Author (Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public static class Builder{

        private String name;
        private String surname;
        public Builder(String value)
        {
            name = value;
        }
        public Builder name(String value){
            this.surname = value;
            return this;
        }

        public Builder surname(String value){
            this.surname = value;
            return this;
        }

        public Builder copy(Author value){
            this.name = value.name;
            this.surname = value.surname;
            return this;
        }

        public Author build(){
            return new Author(this);
        }

    }
}
