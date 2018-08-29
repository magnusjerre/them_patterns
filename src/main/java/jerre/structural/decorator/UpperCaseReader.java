package jerre.structural.decorator;

public class UpperCaseReader implements BaseReader {

    private BaseReader reader;

    public UpperCaseReader(BaseReader reader) {
        this.reader = reader;
    }

    @Override
    public String read(char[] buffer) {
        return reader.read(buffer).toUpperCase();
    }
}
