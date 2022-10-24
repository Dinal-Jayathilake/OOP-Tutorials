package Tutorial3;

public class VendingMachine {
    int cans,tokens;

    public VendingMachine() {
        cans = 10;
        tokens = 0;
    }
    public VendingMachine(int cans) {
        this.cans = cans;
        tokens = 0;
    }
    public boolean returnToken() {
        boolean flag = true;
        if (cans==0){
            System.out.println("\nProcessing...\n\nInsufficient Cans. Refilling Is Required.\n");
            flag = false;
        }
        return flag;
    }
    public void insertToken() {
        if (returnToken()) {
            System.out.println("\nProcessing...\n\nTransaction Complete!\n");
            tokens++;
            cans--;
        }
    }
    public int getCanCount() {
        return cans;
    }
    public int getTokenCount() {
        return tokens;
    }
}
