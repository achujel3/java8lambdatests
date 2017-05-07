package unit1.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class U1ExerciseJava8Lambda {

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
        printAllPeopleConditionally(people, p -> true);

        // Step 3: Create a method that prints all people that have last name beginning with C
        printAllPeopleConditionally(people, p -> p.getLastName().startsWith("C"));

    }

    private static void printAllPeopleConditionally(List<Person> people, Condition condition) {
        System.out.println("Printing a list of people");
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    interface Condition {
        boolean test(Person p);
    }

}
