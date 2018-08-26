package jerre.creational.factory;

public abstract class DB {
    void insert(Object o) {
        System.out.println(String.format("%s: inserting %s", getClass().getSimpleName(), o));
    }
}
