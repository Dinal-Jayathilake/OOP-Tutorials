package Tutorial2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int day;
        int month;
        boolean flag = true;
        ArrayList<String> date = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.print("\nEnter Your Birthday\n--------------------\nDay[DD]: ");
            day = scanner.nextInt();
            System.out.print("Month[MM]: ");
            month = scanner.nextInt();
            System.out.println("--------------------");
            String dateConcat = ("" + day + month);
            date.add(dateConcat);
            for (int i = 0; i < date.size(); i++) {
                if ((Objects.equals(date.get(i), dateConcat)) && (i != date.size()-1)) {
                    System.out.println("\nMatch Found!");
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("\nIt Took An Average Of " + date.size() + " People Before A Match Was Found.");
    }
}
