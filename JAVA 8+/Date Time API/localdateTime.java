import java.time.LocalDateTime;

public class localdateTime {
    public static void main(String[] args) {
        // Cuurent date-time
     LocalDateTime now = LocalDateTime.now();
        // custom date-time
     LocalDateTime mydate = LocalDateTime.parse("2023-03-22T14:43:02");
    LocalDateTime Opration =  mydate.minusDays(3);
    LocalDateTime Opra = mydate.minusWeeks(1);
     int  day = mydate.getYear();
     System.out.println(day);
    }
}