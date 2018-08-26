package jerre.structural.filter;

import java.awt.*;

public class Person {

    final String name;
    final int age;
    final Color favoriteColor;

    Person(String name, int age, Color favoriteColor) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    public static class Builder {
        private String name;
        private int age;
        private Color favoriteColor;

        public Builder() {

        }

        public Person.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Person.Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person.Builder favoriteColor(Color color) {
            favoriteColor = color;
            return this;
        }


        public Person build() {
            return new Person(name, age, favoriteColor);
        }

    }

}
