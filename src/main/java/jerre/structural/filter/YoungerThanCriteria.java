package jerre.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class YoungerThanCriteria implements Criteria<Person> {

    private int age;

    public YoungerThanCriteria(int age) {
        this.age = age;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> filtered = new ArrayList<>();

        for (Person p : list) {
            if (p.age < age) {
                filtered.add(p);
            }
        }

        return filtered;
    }
}
