package java8.ex01;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Exercice 01 - Les dates avant Java 8
 */
public class DateAndTime_01_Test {

    // Vous vous souvenez de java.util.Date (Java 1) ?
    @Test
    public void test_date() {

        // TODO modifier les paramètres pour que le test soit passant
        Date date = new Date(117, 2, 24, 01, 02, 03);

        assertThat(date.toString(), is("Fri Mar 24 01:02:03 CET 2017"));

        // une date est mutable... :-(
        // TODO modifier le jour de la date pour que le test soit passant
        Date date2 = new Date(117, 2, 25, 01, 02, 03);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 1);
        date = c.getTime();
        assertThat(date.toString(), is("Sat Mar 25 01:02:03 CET 2017"));
    }

    // Vous vous souvenez de java.util.Calendar (Java 1.1) ?

    @Test
    public void test_calendar() throws Exception {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        Date date = new Date(117, 2, 24, 01, 02, 03);
        // TODO modifier l'objet calendar pour que le test soit passant
        calendar.setTime(date);
        assertThat(calendar.getTime().toString(), is("Fri Mar 24 01:02:03 CET 2017"));
        Date date2 = new Date(117, 2, 25, 01, 02, 03);
        // calendar est mutable... :-(
        // TODO modifier l'objet calendar pour que le test soit passant
        calendar.setTime(date2);
        assertThat(calendar.getTime().toString(), is("Sat Mar 25 01:02:03 CET 2017"));
    }


}
