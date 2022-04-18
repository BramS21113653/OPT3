package Applicatiepackage;

import java.util.ArrayList;

public class AutomatischeWas {
    private Programma gewensteProgramma;
    private Integer timerTijd;
    private ArrayList<Was> was = new ArrayList<Was>();


    public Programma gewensteProgramma(){
        // vervang door input
        return gewensteProgramma;
    }

    public void keuzeTimerAanpassen(){
        // vraag: Wilt u de timer aanpassen? JA / NEE
        kiesTimer();
    }

    public Integer kiesTimer(){
        // vervang door input
        this.timerTijd = 0;
        // ^^^
        return timerTijd;
    }
}
