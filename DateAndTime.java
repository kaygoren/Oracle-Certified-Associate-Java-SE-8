import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {

    public static void main(String ... args) {

        LocalDate date = LocalDate.of(1995, Month.JUNE, 10);

        LocalTime time1 = LocalTime.of(16, 59);
        LocalTime time2 = LocalTime.of(16, 59, 59, 200);

        LocalDateTime dateTime1 = LocalDateTime.of(1995, 6, 10, 16, 59);
        LocalDateTime dateTime2 = LocalDateTime.of(date, time1);

        dateTime1 = dateTime1.minusYears(1).plusMonths(3).minusHours(5);

        // LocalDate d = new LocalDate(); // DOES NOT COMPILE

        LocalDate date2 = LocalDate.of(2014, Month.JANUARY, 29); // 2014-01-29
        date2 = date2.plusMonths(1); // 2014-02-28

        Period period = Period.ofMonths(2); // every 2 months
        Period period2 = Period.of(1, 0, 7);  // every 1 year and 7 days

        date2 = date2.plus(period);  // 2014-04-28
        date2 = date2.plus(period2); // 2015-05-05

        Period wrong = Period.ofYears(1).ofWeeks(2);  // it means period of 2 weeks (omits period of 1 year)

        date = date.minus(wrong);

        System.out.println(date2.getDayOfYear());  // 125
        System.out.println(date2.getDayOfMonth());  // 5
        System.out.println(date2.getDayOfWeek());  // TUESDAY
        System.out.println(date2.getMonth());  //MAY
        System.out.println(date2.getMonthValue()); // 5
        System.out.println(date2.getYear()); // 2015

        LocalDateTime dt = LocalDateTime.of(2020, 3, 13, 22, 32, 10);

        System.out.println(dt);  // 2020-03-13T22:32:10

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter customF = DateTimeFormatter.ofPattern("MMMM dd, yyyy, HH:mm:ss");

        System.out.println(shortF.format(dt));  // 13.03.2020 22:32
        System.out.println(mediumF.format(dt));  // 13 Mar 2020 22:32:10
        System.out.println(customF.format(dt));  // Mart 13, 2020, 10:32:10

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy, HH:mm");
        LocalDateTime dt2 = LocalDateTime.parse("10 06 1995, 10:15", f);  // 1995-06-10T10:15
        LocalTime t = LocalTime.parse("11:22"); // 11:22
    }
}
