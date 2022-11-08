package Tutorial5.Question7;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class WorldClock extends Clock{
    int offset;
    public WorldClock(int offset) {
        this.offset = offset;
    }
    /*@Override
    public int getHours() {
        ZoneOffset offsetHours = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        System.out.println(offsetHours);
    }*/
}
