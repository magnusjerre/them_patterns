package jerre.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class OlderThanCriteria implements Criteria<Person> {

    private int age;

    public OlderThanCriteria(int age) {
        this.age = age;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> filtered = new ArrayList<>();
        for (Person p : people) {
            if (p.age > age) {
                filtered.add(p);
            }
        }

        return filtered;
    }
}
