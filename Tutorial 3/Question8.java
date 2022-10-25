package Tutorial3;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        USPostal obj = new USPostal();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter 5-Digit ZIP Code: ");
        String zip = scanner.nextLine();
        System.out.println("\nThe Encoded ZIP Code Is " + obj.encode(zip));
        System.out.println("\nThe Decoded ZIP Code Is " + obj.decode("|:::||::|:|::||::|::|:|:|::|:|:|"));
    }
}
