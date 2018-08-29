package jerre.structural.decorator;

public class Main {
    public static void main(String... args) {
        SimpleReader simpleReader = new SimpleReader();
        SnakeCaseReader snakeCaseReader = new SnakeCaseReader(simpleReader);
        UpperCaseReader upperCaseReader = new UpperCaseReader(simpleReader);
        UpperCaseReader upperSnakeCaseReader = new UpperCaseReader(snakeCaseReader);

        char[] input = "DecoraTor Schmeckorator".toCharArray();
        System.out.println("simple reader: " + simpleReader.read(input));
        System.out.println("snakeCase reader: " + snakeCaseReader.read(input));
        System.out.println("upperCaseReader: " + upperCaseReader.read(input));
        System.out.println("upperSnakeCaseReader: " + upperSnakeCaseReader.read(input));
    }
}
