package Tutorial5.Question1;

public final class CalcManager {
    private CalcManager() {}
    public static boolean isEven(int n){
        boolean flag;
        if (n%2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
    public static int cube(int n) {
        return (int)Math.pow(n,3);
    }
    public static double add(double...x) {
        double total = 0;
        for (double number : x) {
            total = total + number;
        }
        return total;
    }
}
