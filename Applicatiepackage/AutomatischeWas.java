package Applicatiepackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AutomatischeWas {
    private Integer timerTijd;
    private ArrayList<Programma> gewensteProgramma = new ArrayList<Programma>();
    private ArrayList<Was> was = new ArrayList<Was>();

    public AutomatischeWas(ArrayList<Programma> gewensteProgramma, ArrayList<Was> was){
        this.gewensteProgramma = gewensteProgramma;
        this.was = was;
    }

    public ArrayList<Programma> getGewensteProgramma(){
        return gewensteProgramma;
    }

    public Integer getTimer(){
        return this.timerTijd;
    }

    public void kiesTimer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies een timer (voer een getal in)...");
        Integer timerTijd = scanner.nextInt();
        this.timerTijd = timerTijd;
    }

    @Override
    public String toString(){
        return "Hier volgt het wasprogramma..." +
                "\n";
    }
}
