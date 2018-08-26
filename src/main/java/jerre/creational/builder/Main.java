package jerre.creational.builder;

import java.awt.*;

public class Main {
    public static void main(String... args) {
        Person magnus = new Person.Builder().name("Magnus").age(28).favoriteColor(Color.GREEN).build();
        Person2 magnus2 = Person2.BuilderReqOpt.begin().name("Magnus").age(28).favoriteColor(Color.GREEN).build();
    }
}
