import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        boolean flag = false;
        int count = 0;
        int newDay = 0;
        ArrayList<Integer> people = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (!flag) {
            count++;
            System.out.println("\nEnter Your Birthday\n--------------------------------\n");
            System.out.print("Month: ");
            int month = scanner.nextInt();
            System.out.print("Day: ");
            int day = scanner.nextInt();
            for (int i = 1; i < month+1; i++) {
                if (i==month) {
                    newDay+=day;
                }
                else if (i%2==0) {
                    newDay+=30;
                }
                else {
                    newDay+=31;
                }
            }
            people.add(newDay);
            for (int j = 0; j < people.size(); j++) {
                for (int k = 0; k < people.size(); k++) {
                    if ((people.get(j)==people.get(k))&&(j!=k)){
                        System.out.println("Match Detected!");
                        flag = true;
                        break;
                    }
                }
            }
        }
        scanner.close();
        System.out.println("An Average Of " + count + " Have To Join.");
    }
}
