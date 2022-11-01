package Tutorial4.Question5;

public class CreditCard extends Card {
    private int pinNumber;
    private int number;
    public CreditCard(String name, int pinNumber, int number) {
        super(name);
        this.pinNumber = pinNumber;
        this.number = number;
    }
    @Override
    public boolean isExpired() {
        return false;
    }
}
