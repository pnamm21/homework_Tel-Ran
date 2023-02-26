package Convert;
import java.util.Scanner;

public class EURtoUSD {
    public static void main(String[] args) {
        double r = 1212.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int enter = scanner.nextInt();
        System.out.print("From "+enter+" Euro");

        Euro1 f = new Euro1(enter);

        System.out.println();

        System.out.println("Enter your digit: ");
        int input = scanner.nextInt();
        System.out.println("From "+input+" To");

        Euro2 g = new Euro2();
        System.out.println("Result: "+g.printEuro2(input)+"$");
        scanner.close();



    }


}
