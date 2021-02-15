package formatarchivo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class testhora {

    //|26-10-2012 10:55 AM|
    // date format 1
    private static final DateTimeFormatter dateFormatter 
        = DateTimeFormatter.ofPattern("|dd-MM-yyyy HH:mm:ss a|");
    
     // date format 2
    //|NOV-20-2020 13:00:00|
    /*
    private static final DateTimeFormatter dateFormatterNew 
        = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");*/
    
    private static final DateTimeFormatter dateFormatterNew 
        = DateTimeFormatter.ofPattern("MMM-d-yyyy ");

    public static void main(String[] args) {

        String date = "|11-01-1995 02:00:00 AM|";

        // string to LocalDateTime

        LocalDateTime ldateTime = LocalDateTime.parse(date, dateFormatter);

        System.out.println(dateFormatter.format(ldateTime));

        // change date format
        System.out.println(dateFormatterNew.format(ldateTime)+"12:00:00 PM");


    }

}