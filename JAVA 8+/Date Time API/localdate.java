
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;

public class localdate {

    public static void main(String[] args) {
        // Cuurent system Date
        LocalDate today = LocalDate.now();
        // Custom Date
        LocalDate mydate = LocalDate.of(2017, 12, 7);
        // past day
        LocalDate localDate = today.minusDays(1);
        //past moth
        LocalDate localDate1 = today.minusMonths(100);
        //Cuurent - getDayOfMonth -> day 1-31
        int dayofMonth = today.getDayOfMonth();
        //Cuurent - getMonth -> JAN - DEC
        Month month = today.getMonth();
        //Cuurent -getMonthValue -> month-(1-12)
        int monthvalue = today.getMonthValue();
        //Cuurent -getYear -> 2012,2016
        int year = today.getYear();
  
         
        System.out.println(dayofMonth + " " + monthvalue + " " + month + " " + year);
        System.out.println(localDate + " " + localDate1);
    }
}
