package Applicatiepackage;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

class AutomatischeWasTest {

    @Test
    void addHoursToJavaUtilDate() {
        //arrange
        int uren = 2;
        Calendar actualDate = Calendar.getInstance();
        //act
        Date newDate = AutomatischeWas.addHoursToJavaUtilDate(uren);
        actualDate.add(actualDate.HOUR_OF_DAY, uren);
        //check
        //todo assert statement aanpassen
        //todo newDate minus uren, actualDate
        //todo cal.add(Calendar.HOUR, -1);
        System.out.println(actualDate.getTime());
        System.out.println(newDate);
        Assert.assertTrue((actualDate.getTime()).equals(newDate));
//        Assert.assertDatesAlmostEqual(actualDate.getTime(), newDate);
    }
}