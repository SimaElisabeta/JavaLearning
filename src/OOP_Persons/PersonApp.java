package OOP_Persons;

import java.util.ArrayList;
import java.util.List;

public class PersonApp
{
    public static List<Person> personList;

    public static void main(String[] args)
    {
        personList = new ArrayList<>();

        Person user1 = new Person("John", "Doe", 34);
        Person user2 = new Person("Merry", "Doe", 30);
        Person user3 = new Person("Tom", "Burger", 44);
        Person user4 = new Person("Jessy", "Fish", 21);
        Person user5 = new Person("Walter", "White", 52);
        Person user6 = new Person("Water", "Mellow", 38);
        Person user7 = new Person("Jill", "Addams", 38);

        personList.add(user1);
        personList.add(user2);
        personList.add(user3);
        personList.add(user4);
        personList.add(user5);
        personList.add(user6);
        personList.add(user7);

        // change name of user1:
        // user1.firstName = "Jonnathan";
        System.out.println(personList);

        personList.remove(user3);
        System.out.println(personList);


        System.out.println("List of all persons by: First Name, Last Name and Age " + personList);

        List<String> olderThan31 = new ArrayList<>();
        List<String> youngerThan31 = new ArrayList<>();

        int indexOfAge52 = -1;

        for (Person person : personList)
        {
            if (person.age <= 31)
            {
                youngerThan31.add(person.toStringShort());
            }
            else
            {
                olderThan31.add(person.toStringShort());
            }

            if (person.age == 52)
            {
                indexOfAge52 = personList.indexOf(person);
            }
        }

        System.out.println("Younger than 31: " + youngerThan31);
        System.out.println("Older than 31: " + olderThan31);
        System.out.println("Index of person that is 52 years old: " + indexOfAge52);


        /* in a for-each loop you cannot add to OR remove from the List. this will cause an error
           aka. the List in a for-each loop is read-only
        for (Person person : personList)
        {
            personList.remove(person);
        }
        */

        personList.remove(indexOfAge52);
        System.out.println("List of all persons after index removal by: First Name, Last Name and Age " + personList);

        for (int index = 0; index < personList.size(); index++)
        {
            if (personList.get(index).age == 38)
            {
                System.out.println("Removing at: " + index + " person: " + personList.get(index));
                personList.remove(index);
                index--;
            }
            System.out.println("Person at index: " + index + " is: " + personList.get(index));
        }

        System.out.println(personList);

    }
}
