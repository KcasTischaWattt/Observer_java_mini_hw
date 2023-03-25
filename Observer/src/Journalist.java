public class Journalist extends Person {

    protected Journalist(String name) {
        super(name);
    }

    @Override
    public void update(String title, String achievements, String information, String systemRequirements) {
        System.out.println("This is journalist " + name + " writing about " + title +
                " and I have some information about it: " + information);
    }
}
