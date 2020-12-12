import java.util.*;

public class RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < line.length ; i++) {
            int x = rnd.nextInt(line.length);
            int y = rnd.nextInt(line.length);

            String oldWorlds = line[x];

            line[x] = line[y];
            line[y] = oldWorlds;

        }
        System.out.println(String.join(System.lineSeparator(), line));
    }
}
