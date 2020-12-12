import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class тест {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        List<Integer> m = new ArrayList<>();

        for (int i = 0; i <numbers.length ; i++) {

            m.add(i);

        }
        int b = Integer.parseInt(scanner.nextLine());

        if (m.contains(b)){
            int v = b;

            System.out.printf("%d",b);
        }else {
            System.out.println("no");
        }

    }
    static class proba{
        int pamet;
        int nos;

        public int getPamet() {
            return pamet;
        }

        public int getNos() {
            return nos;
        }

        public void setPamet(int pamet) {
            this.pamet = pamet;
        }

        public void setNos(int nos) {
            this.nos = nos;
        }

        public proba(int pamet, int nos){
            this.pamet = pamet;
            this.nos = nos;

        }
    }
}
