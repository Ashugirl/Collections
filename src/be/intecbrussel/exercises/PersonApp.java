package be.intecbrussel.exercises;

import javax.swing.*;
import java.util.*;

public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("Homer", "Simpson", 'm', 35, 90, 1.70);
        Person person2 = new Person("Marge", "Simpson", 'f', 34, 50, 1.65);
        Person person3 = new Person("Homer", "Simpson", 'm', 35, 90, 1.70);
        Person person4 = new Person("Ned", "Flanders", 'm', 37, 70, 1.75);
        Person person5 = new Person("Maggie", "Simpson", 'f', 1, 15, .75);
        Person person6 = new Person("Joe", "Quimby", 'm', 34, 85, 1.85);
        Person person7 = new Person("Edna", "Crabapple", 'f', 40, 68, 1.65);

        Set<Person> people = new TreeSet<>(new AgeComparator());
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);

        for(Person p : people){
            System.out.println(p);

        }
        System.out.println("==========================");
        //for(Person folks : people){
          //  System.out.println(folks);
        //}

        /*SortedSet<Person> people1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getWeight()-o2.getWeight());
            }
        });*/


        //SortedSet<Person> people1 = new TreeSet<>(((o1, o2) -> o1.getWeight() - o2.getWeight() ));
       //
        //SortedSet<Person> people1 = new TreeSet<>(Comparator.comparingInt(p -> p.getWeight() ));
        SortedSet<Person> people1 = new TreeSet<>(Comparator.comparing(Person::getAge).thenComparing(Person::getLastName).thenComparingInt(Person::getWeight));
        people1.add(person1);
        people1.add(person2);
        people1.add(person3);
        people1.add(person4);
        people1.add(person5);
        people1.add(person6);
        people1.add(person7);
        for (Person p : people1){
            System.out.println(p);
        }
        System.out.println("==========================");

        List<Person> sortedPerson = new ArrayList<>();
        sortedPerson.add(person1);
        sortedPerson.add(person2);
        sortedPerson.add(person3);
        sortedPerson.add(person4);
        sortedPerson.add(person5);
        sortedPerson.add(person6);
        sortedPerson.add(person7);

        sortedPerson.sort(Comparator.naturalOrder());
        for(Person p : sortedPerson){
            System.out.println(p);
        }
        System.out.println("+++++++++++++++++");
        sortedPerson.sort(Comparator.comparingInt(Person::getWeight));
        for(Person p: sortedPerson){
            System.out.println(p);

        }

        System.out.println("********************");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);

        personList.stream()
                .filter(person -> person.getGender()=='f' && person.getAge() > 20)
                .toList()
                .stream().sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);

        SortedMap<String, Person> personTreeMap= new TreeMap<>();
        personTreeMap.put("Homer", person1);
        personTreeMap.put("Marge", person2);
        personTreeMap.put("Ned", person4);
        personTreeMap.put("Maggie", person5);
        personTreeMap.put("Joe", person6);
        personTreeMap.put("Edna", person7);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");

        System.out.println(personTreeMap);
        System.out.println();

        System.out.println(personTreeMap.get("Ned"));
        System.out.println();

        System.out.println(personTreeMap.get(personTreeMap.firstKey()));
        System.out.println(personTreeMap.get(personTreeMap.lastKey()));


    }


}
