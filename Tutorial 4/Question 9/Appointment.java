package Tutorial4.Question9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class Appointment {
    String description = "See the dentist";
    int app_day;
    int app_month;
    int app_year;
    String dateString = String.format("%d-%d-%d", app_year, app_month, app_day);

    public abstract boolean occursOn(int year, int month, int day);
    public String dayOfTheWeek() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    }
}
