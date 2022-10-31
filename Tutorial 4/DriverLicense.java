package Tutorial4;

public class DriverLicense extends Card {
    private int expirationYear;

    public DriverLicense(int expirationYear) {
        this.expirationYear = expirationYear;
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
