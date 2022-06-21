package got.java.dev6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person alex = new Person("Alex", "alex");
        Person david = new Person("David", "david");

        persons.add(alex);
        persons.add(david);

        List<String> collect = persons.stream()
                .map(Main::collectName)
                .collect(Collectors.toList());
        System.out.println(collect);

        Stream<Person> filters = filters(persons);
        filters.collect(Collectors.toList());
    }

    public static String collectName(Person person) {
        return person.getFirstName();
    }


    private static Stream<Person> filters(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getLastName().contains("o"));
    }
}
