package Tutorial4.Question9;

public class Monthly extends Appointment {
    @Override
    public boolean occursOn(int year, int month, int day) {
        return (app_day == day) && (app_month == month);
    }
}
