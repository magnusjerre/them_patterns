package jerre.structural.decorator;

public class SimpleReader implements IReader {
    @Override
    public String read(char[] array) {
        return new String(array);
    }
}
