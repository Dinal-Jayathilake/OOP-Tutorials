package Tutorial1;

import java.util.*;
public class tutorial1 {
    public static void main (String[] args) {

        /*Q1 System.out.println("\nWelcome to Online Learning!\n\nPlease virus go away!");*/

        /*Q3 for (int x=0; x<100; x+=2) {
            System.out.println(x);
        }*/

        /*Q4 int x = 0;
        while(x<100) {
            System.out.println(x);
            x+=2;
        }*/

        /*Q5 "abcabc456"*/

        //Q6
        int x=0;
        int[] arr = new int[6];
        Random random = new Random();
        while (x<6) {
            boolean flag = false;
            int number = random.nextInt(2,49);
            //Verification
            for (int y=0; y<6; y++) {
                if (arr[y] == number) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                arr[x] = number;
                x++;
            }
        }
        System.out.print("\nYour Lottery Number Is: " + arr[0] + "" + arr[1] + "" + arr[2] + "" + arr[3] + "" + arr[4] + "" + arr[5] + "\n");
    }
}
