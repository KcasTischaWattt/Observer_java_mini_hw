public abstract class Person {
    public final String name;

    protected Person(String name) {
        this.name = name;
    }

    public abstract void update(String title, String achievements, String information, String systemRequirements);
}
