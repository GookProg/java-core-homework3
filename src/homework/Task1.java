package homework;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * Task1
 * Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени
 */

public class Task1 {
    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return getId() == person.getId() && getName().equals(person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }
    }

    private static Person[] RAW_DATA = new Person[]{
            new Person(8, "Amelia"),
            new Person(1, "Harry"), // тёзка
            new Person(4, "Jack"),
            new Person(0, "Harry"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(4, "Jack"),
            new Person(2, "Harry"),
            new Person(6, "Amelia"),
            new Person(3, "Emily"),
            new Person(7, "Amelia"),
            new Person(0, "Harry"),
    };

    public static void main(String[] args) {
        System.out.println("Raw data:");
        System.out.println();

        for (Person person : RAW_DATA) {
            System.out.println(person.id + " - " + person.name);
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        System.out.println();

        Map<String, Set<Integer>> persons = Arrays.stream(RAW_DATA)
                .collect(groupingBy(Person::getName,
                        mapping(Person::getId, toSet())));

        TreeMap<String, Set<Integer>> sortedPersons = new TreeMap<>(persons);

        sortedPersons.forEach((key, value) -> System.out.format("Key: %s \nValue:%d \n", key, value.size()));

    }
}
