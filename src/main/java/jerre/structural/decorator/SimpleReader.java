package jerre.structural.decorator;

public class SimpleReader implements BaseReader {

    private char[] buffer;

    @Override
    public String read(char[] buffer) {
        return new String(buffer);
    }
}
