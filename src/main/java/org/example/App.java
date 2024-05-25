package org.example;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Set<Person> personSet = new TreeSet<>(new SortByName());
        Map<Person,List<Hobby>> personHobbiesMap = new HashMap<>();

        personSet.add(new Person("George Stefan",25,
                List.of(new Hobby("gym", 3,
                        (List.of(new Address("RO", "IS","Musatini",5,"37462")))))));

        personSet.add(new Student("Ion Marcel",28,
                List.of(new Hobby("fishing", 1,
                        (List.of(new Address("RO","IS","Bucium",7,"32421")))))));

        personSet.add(new Unemployed("Roxana Bianca",38,
                List.of(new Hobby("cooking", 7,
                        (List.of(new Address("RO","IS","",7,"32421")))))));

        personSet.add(new Hired("Ion Marcel",28,
                List.of(new Hobby("fishing", 1,
                        (List.of(new Address("RO","IS","Bucium",7,"32421")))))));

        personSet.add(new Student("Andrei Vlad",28,
                List.of(new Hobby("fishing", 1,
                        (List.of(new Address("RO","IS","Bucium",7,"32421"),
                                new Address("UK", "LON","Kings", 7, "232")))))));


        for (Person person : personSet){
            System.out.println(person.toString());
            personHobbiesMap.put(person,person.getHobbies());
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Map.Entry<Person,List<Hobby>> entry : personHobbiesMap.entrySet()){
            System.out.print("Name: " + entry.getKey().getName() + ", Hobbies: ");
            List<Hobby> hobbies = entry.getValue();

            for (Hobby hobby : hobbies){

                System.out.print(hobby.getName() + ", ");
                List<Address> addresses = hobby.getAddresses();
                boolean isFirst = true;
                System.out.print("Countries: ");

                for (Address address : addresses){
                    if (isFirst){
                        System.out.print(address.getCountry());
                        isFirst = false;
                    }
                    else {
                        System.out.print(", " + address.getCountry());
                    }
                }
            }
            System.out.println();
        }
    }
}
