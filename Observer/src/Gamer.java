public class Gamer extends Person {

    protected Gamer(String name) {
        super(name);
    }

    @Override
    public void update(String title, String achievements, String information, String systemRequirements) {
        System.out.println("This is gamer " + name + ", and the game " + title +
                " with this list of achievements " + achievements + "has finally been realised");
    }
}
