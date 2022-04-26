package Applicatiepackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class AutomatischeWas {
    private Integer timerTijd;
    private Programma gewensteProgramma;
    private Was was;

    public AutomatischeWas(Programma gewensteProgramma, Was was) {
        this.gewensteProgramma = gewensteProgramma;
        this.was = was;
    }

    public Programma getGewensteProgramma() {
        return gewensteProgramma;
    }

    public Integer getTimer() {
        return this.timerTijd;
    }

    public void setTimer() {
        Scanner scanner = new Scanner(System.in);
        // todo format timestamp
        System.out.println("Wilt u een timer instellen?\nJa/Nee" +
                "\nHet is nu: " + getCurrentTimeStamp());
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

    public static String getCurrentTimeStamp() {
        Clock clock = Clock.system(ZoneId.of("Europe/Berlin"));
        ZonedDateTime now = ZonedDateTime.now(clock);
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(now);
    }

    public void beginTijd(){
        //todo format timestamp en print in automatisch wassen wanneer de was begint/klaar is
        System.out.printf("\n" + getCurrentTimeStamp());
    }

    public void eindTijd(){
        //todo format timestamp en print in automatisch wassen wanneer de was begint/klaar is
        System.out.printf("\n" + getCurrentTimeStamp());
    }

    @Override
    public String toString(){
        return "\nHier volgt alle wasinformatie van het ideale wasprogramma:" +
                "\n" + this.gewensteProgramma +
                "\nTimer (de was begint over...): " + this.timerTijd + " uur" +
                "\n\nInfo over de was: " +
                "\n" + this.was;
    }
}
