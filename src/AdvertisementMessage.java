import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        advertisementMessages line = new advertisementMessages();

        for (int i = 0; i < n ; i++) {
            System.out.println(line.randomMessage());
        }

    }
    static class advertisementMessages{
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

       Random message = new Random();
       public String randomMessage(){
           return String.format("%s %s %s - %s", phrases[message.nextInt(phrases.length)],
                   events[message.nextInt(events.length)],
                   authors[message.nextInt(authors.length)],
                   cities[message.nextInt(cities.length)]);
       }

    }
}
