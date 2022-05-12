package Applicatiepackage;

import java.util.Date;
import java.util.Scanner;

import java.util.Calendar;


public class AutomatischeWas {
    private Integer timerTijd = 0;
    private Programma gewensteProgramma;
    private Was was;

    public AutomatischeWas(Programma gewensteProgramma, Was was) {
        this.gewensteProgramma = gewensteProgramma;
        this.was = was;
    }

//    public Programma getGewensteProgramma() {
//        return gewensteProgramma;
//    }

//    public Integer getTimer() {
//        return this.timerTijd;
//    }

    public void setTimer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u een timer instellen?" +
                "\nHet is nu: " + getCurrentTimeStamp() + "\nJa/Nee");
        String antwoord = scanner.nextLine();
        while (antwoord.equalsIgnoreCase("ja")) {
            try {
                System.out.println("Kies een timer (voer een getal in)...");
                Integer timerTijd = scanner.nextInt();
                this.timerTijd = timerTijd;
                antwoord = "nee";
            } catch (Exception e) {
                System.out.println("Graag een getal invoeren...");
                scanner.next();
            }
        }
    }

    public Date getCurrentTimeStamp(){
        Calendar calendar1 = Calendar.getInstance();
        return calendar1.getTime();
    }

    public static Date addHoursToJavaUtilDate(int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }

    public static Date addHoursToJavaUtilDate(int timer, int duur) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, timer);
        calendar.add(Calendar.HOUR_OF_DAY, duur);
        return calendar.getTime();
    }

        public void beginTijd(){
        System.out.printf("\nDe was begint: " + addHoursToJavaUtilDate(this.timerTijd));
    }

    public void eindTijd(){
        System.out.printf("\nDe was is klaar: " +
                addHoursToJavaUtilDate(this.timerTijd, (gewensteProgramma.getTijdsduur() / 60)));
    }

    //todo bedenk iets om te testen
    public void milieuBewust(Boolean antwoord){
            if (antwoord == true){
                Integer aftrek = 5;
                gewensteProgramma.changeTemperatuurMin(aftrek);
        }
    }

    public boolean anderProgramma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u toch liever een normaal programma draaien? ja/nee");
        while (true) {
            String antwoord = scanner.nextLine();
            try {
                if (antwoord.equalsIgnoreCase("ja")) {
                    System.out.println("De temperatuur zal worden verhoogd...");
                    Integer plus = 5;
                    gewensteProgramma.changeTemperatuurPlus(plus);
                    return true;
                }
                if (antwoord.equalsIgnoreCase("nee")) {
                    System.out.println("In orde, hieronder volgt de laatste informatie...");
                    return false;
                }
            } catch(Exception e) {
                System.out.println("Voer uw antwoord opnieuw in...");
            }
        }

    }

    @Override
    public String toString(){
        return "\nIdeaal milieubewust programma:" +
                "\n" + this.gewensteProgramma +
                "\nTimer (de was begint over...): " + this.timerTijd + " uur" +
                "\n\nInfo over de was: " +
                "\n" + this.was + "\n";
    }

    public String toString1(){
        return "\nIdeaal normaal programma:" +
                "\n" + this.gewensteProgramma +
                "\nTimer (de was begint over...): " + this.timerTijd + " uur" +
                "\n\nInfo over de was: " +
                "\n" + this.was;
    }
}
