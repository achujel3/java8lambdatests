package unit3;

import unit1.exercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodRefExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        printAllPeopleConditionally(people, p -> true, System.out::println);

    }

    private static void printAllPeopleConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        System.out.println("Printing a list of people");
        for (Person person : people) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }

    interface Condition {
        boolean test(Person p);
    }

}
