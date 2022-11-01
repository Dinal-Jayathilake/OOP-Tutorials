package Tutorial4.Question9;

public class Onetime extends Appointment {
    @Override
    public boolean occursOn(int year, int month, int day) {
        return (app_day == day) && (app_month == month) && (app_year == year);
    }
}
