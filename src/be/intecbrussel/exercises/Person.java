package be.intecbrussel.exercises;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private int weight;
    private double height;

    public Person(){

    }

    public Person(String firstName, String lastName, char gender, int age, int weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender && age == person.age && Double.compare(person.weight, weight) == 0 && Double.compare(person.height, height) == 0 && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age, weight, height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.getLastName().compareTo(o.getLastName());
    }
}
