package jerre.structural.filter;

import java.util.*;

public class OrCriteria implements Criteria<Person> {

    private Criteria<Person> criteria1, criteria2;

    public OrCriteria(Criteria<Person> criteria1, Criteria<Person> criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        Set<Person> filtered = new HashSet<>();
        filtered.addAll(criteria1.meetCriteria(list));
        filtered.addAll(criteria2.meetCriteria(list));

        List<Person> output = new ArrayList<>();
        for (Person p : filtered) {
            output.add(p);
        }
        return output;
    }
}
