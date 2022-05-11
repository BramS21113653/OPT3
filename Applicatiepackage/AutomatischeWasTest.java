package Applicatiepackage;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

class AutomatischeWasTest {

    @Test
    void addHoursToJavaUtilDate() {
        //arrange
        int uren = 10;
        Date actualDate = new Date();
        //act
        Date newDate = AutomatischeWas.addHoursToJavaUtilDate(uren);
        //check
        Assert.assertTrue(newDate.after(actualDate));
    }

    @Test
    void beginTijd() {
    }

    @Test
    void eindTijd() {
    }
}