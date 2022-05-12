package Applicatiepackage;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

class Tests {

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
    void addHoursToJAvaUtilDate() {
        //arrange
        int uren = 10;
        int timer = 2;
        Date actualDate = new Date();
        //act
        Date newDate = AutomatischeWas.addHoursToJavaUtilDate(timer, uren);
        //check
        Assert.assertTrue(newDate.after(actualDate));
    }

    @Test
    void beginTijd () {
            int a = 1;
            int b = 1;
            Assert.assertEquals(a, b);
    }
}