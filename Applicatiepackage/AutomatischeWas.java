package Applicatiepackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void kiesTimer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u een timer instellen?\nJa/Nee");
        String antwoord = scanner.nextLine();
        while (antwoord.equalsIgnoreCase("ja")) {
            try {
                System.out.println("Kies een timer (voer een getal in)...");
                Integer timerTijd = scanner.nextInt();
                this.timerTijd = timerTijd;
                scanner.next();
            } catch (Exception e) {
                System.out.println("Graag een getal invoeren...");
                scanner.next();
            }
        }
    }

    @Override
    public String toString(){
        //todo objecten uitlezen en printen
        return "Hier volgt alle info:" +
                "\n" +
                "\nTimer: " + this.timerTijd;
    }
}
