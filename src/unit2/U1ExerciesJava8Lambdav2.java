package unit2;

import unit1.exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class U1ExerciesJava8Lambdav2 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        System.out.println("Sorting a list of people");
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        performAllPeopleConditionally(people, p -> true, p -> System.out.println(p));

        // Step 3: Create a method that prints all people that have last name beginning with C
        performAllPeopleConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

    }

    private static void performAllPeopleConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
        System.out.println("Printing a list of people");
        for (Person person : people) {
            if (condition.test(person)) {
                consumer.accept(person);
            }
        }
    }

    interface Condition {
        boolean test(Person p);
    }

}
