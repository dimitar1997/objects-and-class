import java.math.BigDecimal;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal firstNum = new BigDecimal(scanner.nextLine());
        BigDecimal secondNum = new BigDecimal(scanner.nextLine());
      BigDecimal sum = firstNum.add(secondNum);

        System.out.println(sum);
    }
}
