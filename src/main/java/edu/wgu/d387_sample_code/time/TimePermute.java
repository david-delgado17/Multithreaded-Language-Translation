package edu.wgu.d387_sample_code.time;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TimePermute {

    public static String getTime () {


        ZonedDateTime  time = ZonedDateTime.now();

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));


        String timeFrame = "hh:mm a";
        DateTimeFormatter timeFrameFormatter = DateTimeFormatter.ofPattern( timeFrame);

        String display = ET.format(timeFrameFormatter) + " ET / " + MT.format(timeFrameFormatter) + " MT / " + UTC.format(timeFrameFormatter) + " UTC";

        return display;

    }


}
