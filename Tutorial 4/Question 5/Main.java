package Tutorial4.Question5;

public class Main {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("Dinal",2344, 0712350234);
        System.out.println(card.getName());
        System.out.println(card.isExpired());

        DriverLicense license = new DriverLicense(2017);
        System.out.println("\n" + license.isExpired());

        Passport pass = new Passport("Colombo", 2023);
        System.out.println("\n" + pass.getBirthLocation());
        System.out.println(pass.isExpired());
    }
}
