package classesAndObjects;

import java.util.Random;
import java.util.Scanner;

public class advertismentMessage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int repetitions = scanner.nextInt();

        String[] phrases = new String[] {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = new String[]  {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = new String[] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[] {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        for (int n = 0; n < repetitions; n++) {
            int randomPhrase = r.nextInt(phrases.length);
            int randomEvent = r.nextInt(events.length);
            int randomAuthor = r.nextInt(authors.length);
            int randomCity = r.nextInt(cities.length);
            System.out.println(phrases[randomPhrase] + " " + events[randomEvent] + " " + authors[randomAuthor] + " - " + cities[randomCity]);
        }
    }
}
