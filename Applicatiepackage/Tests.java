package Applicatiepackage;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

class Tests {

    @Test
    void addHoursToJavaUtilDate() {
        //arrange
        int uren = 1;
        Date actualDate = new Date();
        //act
        Date newDate = AutomatischeWas.addHoursToJavaUtilDate(uren);
        long difference = newDate.getTime() - actualDate.getTime();
        long uitkomst = difference / 3600000;
        //check
        Assert.assertEquals(uren, uitkomst);
    }

    @Test
    void addHoursToJAvaUtilDate() {
        //arrange
        int uren = 1;
        int timer = 2;
        Date actualDate = new Date();
        //act
        Date newDate = AutomatischeWas.addHoursToJavaUtilDate(timer, uren);
        long difference = newDate.getTime() - actualDate.getTime();
        long uitkomst = difference / 3600000;
        //check
        Assert.assertEquals(timer + uren, uitkomst);
    }

    @Test
    void changeTemperatuurMin () {
        //arrange
        int tempChange = 5;
        Programma programma = new katoenProgramma();
        //act
        int initTemp = programma.getTemperatuur();
        programma.changeTemperatuurMin(tempChange);
        int newTemp = programma.getTemperatuur();
        //check
        Assert.assertEquals(newTemp + tempChange, initTemp);
    }

    @Test
    void changeTemperatuurPlus () {
        //arrange
        int tempChange = 5;
        Programma programma = new katoenProgramma();
        //act
        int initTemp = programma.getTemperatuur();
        programma.changeTemperatuurPlus(tempChange);
        int newTemp = programma.getTemperatuur();
        //check
        Assert.assertEquals(newTemp - tempChange, initTemp);
    }
}