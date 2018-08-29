package jerre.structural.decorator;

public class UpperCaseReader implements IReader {

    private IReader reader;

    public UpperCaseReader(IReader reader) {
        this.reader = reader;
    }

    @Override
    public String read(char[] array) {
        return reader.read(array).toUpperCase();
    }
}
