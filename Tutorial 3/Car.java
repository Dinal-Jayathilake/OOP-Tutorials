package Tutorial3;

public class Car {
    private final String licensePlate;
    private final double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour

    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        } else {
            maxSpeed = 0.0;
        }
    }
    public  Car(String licensePlate1, double maxSpeed1, double speed1) {
        this.licensePlate = licensePlate1;
        this.maxSpeed = maxSpeed1;
        if (speed1>0) {
            this.speed = speed1;
            if (speed1>maxSpeed1) {
                this.maxSpeed = speed1;
            }
        } else {
            this.speed = 0;
        }
    }
    public void printStat() {
        System.out.println("\nLicense Plate: " + licensePlate);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Current Speed: " + speed);
    }
}
