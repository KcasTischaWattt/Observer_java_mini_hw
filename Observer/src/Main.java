import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Journalist journalist1 = new Journalist("Ramon Antonio");
        Journalist journalist2 = new Journalist("Max Perest");
        Developer developer1 = new Developer("Supercell");
        Gamer gamer1 = new Gamer("Johann Krupp");
        Gamer gamer2 = new Gamer("Никита Терлыч");

        Notifier observer = new Notifier();
        observer.subscribe(gamer1);
        observer.subscribe(gamer2);
        observer.subscribe(journalist1);
        observer.subscribe(journalist2);
        observer.subscribe(developer1);

        // Выпуск новой игры
        observer.add("BrawlStars", "Waste all your in the game",
                "YETA SHEDEVAR", "Ведро с Алиэкспресс за 5к");
    }
}