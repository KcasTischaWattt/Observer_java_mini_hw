public class Developer extends Person {

    protected Developer(String name) {
        super(name);
    }

    @Override
    public void update(String title, String achievements, String information, String systemRequirements) {
        System.out.println("This is gamer " + name + ", and the game " + title +
                " with system requirements " + systemRequirements + " has finally been realised");
    }
}
