package Tutorial3;

public class Employee {
    String name;
    double salary;

    public Employee() {
        name = "";
        salary = 0.0;
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
