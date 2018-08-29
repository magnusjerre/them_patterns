package jerre.structural.decorator;

public class SimpleReader implements IReader {
    @Override
    public String read(char[] buffer) {
        return new String(buffer);
    }
}
