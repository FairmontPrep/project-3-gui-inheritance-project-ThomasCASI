package part;

public class Parts {
    protected StringBuilder description;

    public Parts() {
        description = new StringBuilder("Base of a sword.\n");
    }

    public String getDescription() {
        return description.toString();
    }
}
