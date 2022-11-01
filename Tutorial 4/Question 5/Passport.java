package Tutorial4.Question5;

public class Passport extends Card{
    private String birthLocation;
    private int expirationYear;

    public Passport(String birthLocation, int expirationYear) {
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }
    public String getBirthLocation() {
        return "Your Birth Location Is " + this.birthLocation;
    }
    @Override
    public boolean isExpired() {
        boolean expired = false;
        if (this.expirationYear<2022) {
            expired = true;
        }
        return expired;
    }
}
