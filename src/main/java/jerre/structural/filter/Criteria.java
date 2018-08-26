package jerre.structural.filter;

import java.util.List;

public interface Criteria<T> {
    List<T> meetCriteria(List<T> list);
}
