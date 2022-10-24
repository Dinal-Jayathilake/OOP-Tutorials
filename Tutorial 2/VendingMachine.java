package Tutorial2;

public class VendingMachine {
    int cans = 0;
    int tokens = 0;

    public void fillUp(int cans) {
        this.cans = cans;
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
