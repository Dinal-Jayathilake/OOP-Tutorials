package Tutorial2;

public class Question4 {
    public static void main(String[] args) {
        var vend = new VendingMachine();
        vend.fillUp(10);
        vend.insertToken();
        System.out.println("Number Of Cans: " + vend.getCanCount());
        System.out.println("Number Of Tokens: " + vend.getTokenCount());
    }
}
