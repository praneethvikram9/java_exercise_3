import java.util.Calendar;
import java.text.*;

import java.time.*;


public class CalendarDate {

    public static void main(String[] args){

        Calendar n = Calendar.getInstance();
        n.set(Calendar.DAY_OF_WEEK , Calendar.MONDAY);
        //System.out.println(n.getTime());
        DateFormat d = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(d.format(n.getTime()));
            n.add(Calendar.DATE,6);


        System.out.println(d.format(n.getTime()));


    }
}
