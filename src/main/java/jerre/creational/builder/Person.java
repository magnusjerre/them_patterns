package jerre.creational.builder;

import java.awt.*;

public class Person {

    public final String name;
    public final int age;
    public final Color favoriteColor;

    private Person(String name, int age, Color favoriteColor) {
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

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder favoriteColor(Color color) {
            favoriteColor = color;
            return this;
        }


        public Person build() {
            return new Person(name, age, favoriteColor);
        }

    }



}
