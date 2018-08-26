package jerre.creational.builder;

import java.awt.*;

public class Person2 {
    public final String name;
    public final int age;
    public final Color favoriteColor;

    private Person2(String name, int age, Color favoriteColor) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    static class BuilderReqOpt {
        private String name;
        private int age;
        private Color favoriteColor;

        static class NameBuilder {
            private BuilderReqOpt builder;

            NameBuilder(BuilderReqOpt builder) {
                this.builder = builder;
            }

            public AgeBuilder name(String name) {
                builder.name = name;
                return new AgeBuilder(builder);
            }

        }

        static class AgeBuilder {
            private BuilderReqOpt builder;

            AgeBuilder(BuilderReqOpt builder) {
                this.builder = builder;
            }

            BuilderReqOpt age(int age) {
                this.builder.age = age;
                return builder;
            }
        }


        public static NameBuilder begin() {
            BuilderReqOpt builderReqOpt = new BuilderReqOpt();
            return new NameBuilder(builderReqOpt);
        }


        public BuilderReqOpt favoriteColor(Color color) {
            this.favoriteColor = color;
            return this;
        }

        public Person2 build() {
            return new Person2(name, age, favoriteColor);
        }
    }

}

