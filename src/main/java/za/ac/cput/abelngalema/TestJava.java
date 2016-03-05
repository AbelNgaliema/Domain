package za.ac.cput.abelngalema;

/**
 * Created by Abel on 2016-03-05.
 */
public class TestJava {

    public String name;
    public int age;
    public double salary;


    public TestJava()
    {

    }

    public TestJava(String name,int age,double sal)
    {
        this.name = name ;
        this.age = age ;
        this.salary = sal;
    }

    public void setName(String name)
    {
        this.name  =  name;
    }
    public String getName()
    {
        return  name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public double getSalary()
    {
        return this.salary;
    }
    public void setSalary(double sal)
    {
        this.salary = sal;
    }

}
