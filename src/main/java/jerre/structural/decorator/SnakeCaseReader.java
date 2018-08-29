package jerre.structural.decorator;

public class SnakeCaseReader implements IReader {

    private IReader reader;


    public SnakeCaseReader(IReader reader) {
        this.reader = reader;
    }

    @Override
    public String read(char[] array) {
        String string = reader.read(array);
        return string.replaceAll("\\s", "_");
    }
}
