package OOP_Persons;

public class Person
{
    // Fields - campuri
    String firstName;
    String lastName;
    int age;

    // Constructor of the class - constructorul clasei
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    // this function is called when an object of type Person is printed out
    // by default all classes have a toString function/method, but what it prints is not human readable
    // with the @Override we can specify our own implementation of the toString function and print whatever we want
    @Override
    public String toString()
    {
        return firstName + " " + lastName + " " + age;
    }

    public String toStringShort()
    {
        return firstName + " " + lastName;
    }
}
