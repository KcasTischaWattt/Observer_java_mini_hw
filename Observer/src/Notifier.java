import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Notifier {
    ArrayList<Person> people = new ArrayList<>();

    public void subscribe(@NotNull Person person) {
        System.out.println(person.getClass().getName() + " " + person.name + " subscribed.");
        people.add(person);
    }

    public void unsubscribe(@NotNull Person person) {
        if (!people.contains(person)) {
            System.out.println(person.getClass() + person.name + " was not subscribed.");
        }
        System.out.println(person.getClass() + person.name + " unsubscribed.");
        people.remove(person);
    }

    private void notifyAll(String title, String achievements, String information, String systemRequirements) {
        for (Person person : people) {
            if (person instanceof Gamer) {
                person.update(title, achievements, "unavailable", "unavailable");
            } else if (person instanceof Journalist) {
                person.update(title, "unavailable", information, "unavailable");
            } else {
                person.update(title, "unavailable", "unavailable", systemRequirements);
            }
        }
    }

    public void add (String title, String achievements, String information, String systemRequirements) {
        notifyAll(title, achievements, information, systemRequirements);
    }
}
