package Applicatiepackage;

import java.util.Scanner;

public class katoenProgramma extends Programma{
    private static Integer temperatuur = 40;

    public katoenProgramma(Integer temperatuur, Integer toeren, Integer tijdsduur) {
        super(katoenProgramma.temperatuur, toeren, tijdsduur);
    }

    public void test(){
        this.temperatuur = 0;
    }
}
