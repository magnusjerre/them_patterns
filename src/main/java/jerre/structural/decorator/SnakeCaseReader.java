package jerre.structural.decorator;

public class SnakeCaseReader implements BaseReader {

    private BaseReader reader;


    public SnakeCaseReader(BaseReader reader) {
        this.reader = reader;
    }

    @Override
    public String read(char[] array) {
        String string = reader.read(array);
        return string.replaceAll("\\s", "_");
    }
}
