package be.intecbrussel.exercises;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("Homer", "Simpson", 'm', 35, 90, 1.70);
        Person person2 = new Person("Marge", "Simpson", 'f', 34, 50, 1.65);
        Person person3 = new Person("Homer", "Simpson", 'm', 35, 90, 1.70);
        Person person4 = new Person("Ned", "Flanders", 'm', 37, 70, 1.75);
        Person person5 = new Person("Maggie", "Simpson", 'f', 1, 15, .75);

        Set<Person> people = new TreeSet<>(new AgeComparator());
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        for(Person p : people){
            System.out.println(p);
        }

        //for(Person folks : people){
          //  System.out.println(folks);
        //}

    }
}
