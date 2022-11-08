package Tutorial5.Question7;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Clock {
    @Override
    public String toString() {
        return "Current Hour: " + getHours() + "\n" + "Current Minute: " + getMinutes();
    }
    public int getHours() {
        return Instant.now().atZone(ZoneId.systemDefault()).getHour();
    }
    public int getMinutes() {
        return Instant.now().atZone(ZoneId.systemDefault()).getMinute();
    }
    public String getTime() {
        String time = getHours() + " " +getMinutes();
        return time;
    }
}
