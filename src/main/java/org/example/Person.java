package org.example;


import java.util.List;
import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private List<Hobby> hobbies;

    public Person(String name, int age, List<Hobby> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}

