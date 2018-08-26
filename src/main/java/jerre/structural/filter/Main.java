package jerre.structural.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String... args) {
        List<Person> allThePeople = Arrays.asList(
                new Person.Builder().name("Arne").age(45).build(),
                new Person.Builder().name("Bjarne").age(65).build(),
                new Person.Builder().name("Narnje").age(25).build(),
                new Person.Builder().name("Ninja").age(Integer.MAX_VALUE).build()
        );

        OrCriteria orCriteria = new OrCriteria(new OlderThanCriteria(50), new YoungerThanCriteria(30));
        System.out.println("---- eldre enn 50 eller yngre enn 30 ----");
        List<Person> filtered = orCriteria.meetCriteria(allThePeople);
        for (Person p : filtered) {
            System.out.printf("navn: %s, alder: %d\n", p.name, p.age);
        }

        System.out.println("---- yngre enn 50 ----");
        List<Person> youngerThan50 = new YoungerThanCriteria(50).meetCriteria(allThePeople);
        for (Person p : youngerThan50) {
            System.out.printf("navn: %s, alder: %d\n", p.name, p.age);
        }

        List<Person> lambdaVariant = allThePeople.stream().filter(p -> p.age < 30 || p.age > 50).collect(Collectors.toList());
        System.out.println("---- Lambda: eldre enn 50 eller yngre enn 30 ----");
        for (Person p : lambdaVariant) {
            System.out.printf("navn: %s, alder: %d\n", p.name, p.age);
        }

    }

}
