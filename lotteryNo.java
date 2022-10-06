import java.util.*;
public class lotteryNo {
    public static void main (String[] args) {

        int x=0;
        int arr[] = new int[6];
        Random random = new Random();
        while (x<6) {
            boolean flag = false;
            int number = random.nextInt(2,49);
            //Verification
            for (int y=0; y<6; y++) {
                if (arr[y] == number){
                    flag = true;
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
