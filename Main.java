import Applicatiepackage.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            int gewicht = 0;
            while (gewicht == 0) {
                try {
                    System.out.println("Gewicht van de was (in kilogram)?");
                    gewicht = scanner.nextInt();
                    scanner.nextLine();
                } catch(Exception e){
                    System.out.println("Graag een correct gewicht invoeren...");
                    scanner.nextLine();
                }
            }
            String kleur;
            while (true){
                //todo getal komt er doorheen...
                try {
                    System.out.println("Kleur van de was?");
                    kleur = scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Graag een kleur invoeren...");
                    scanner.nextLine();
                }
            }
            String materiaal = null;
            while (materiaal == null){
                //todo getal komt er doorheen...
                try {
                    System.out.println("Materiaal van de was? Kies uit: katoen/wol/fijn");
                    materiaal = scanner.nextLine();
                }catch (Exception e){
                    System.out.println("Graag een materiaal invoeren..." +
                            "\nKies uit: katoen/wol/fijn");
                    scanner.nextLine();
                }
            }
            Was was = new Was(gewicht, kleur, materiaal);
            if (was.getMateriaal().equalsIgnoreCase("katoen")){
                katoenProgramma katoen = new katoenProgramma();
                katoen.extraWater();
                katoen.kortProgramma();
                AutomatischeWas automatischeWas = new AutomatischeWas(katoen, was);
                automatischeWas.setTimer();
                automatischeWas.milieuBewust(true);
                System.out.println(automatischeWas);
                boolean anderProgramma = automatischeWas.anderProgramma();
                if (anderProgramma == true) {
                    System.out.println(automatischeWas.toString1());
                }
                automatischeWas.beginTijd();
                automatischeWas.eindTijd();
//                while (true) {
//                    // todo check of was has started or has finished (observer pattern)
//                    break;
//                }
            }
            if (was.getMateriaal().equalsIgnoreCase("wol")) {
                wolProgramma wol = new wolProgramma();
                wol.extraWater();
                wol.kortProgramma();
                AutomatischeWas automatischeWas = new AutomatischeWas(wol, was);
                automatischeWas.setTimer();
                automatischeWas.milieuBewust(true);
                System.out.println(automatischeWas);
                boolean anderProgramma = automatischeWas.anderProgramma();
                if (anderProgramma == true) {
                    System.out.println(automatischeWas.toString1());
                }
                automatischeWas.beginTijd();
                automatischeWas.eindTijd();
//                while (true) {
//                    // todo check of was has started or has finished (observer pattern)
//                    break;
//                }
            }
            if (was.getMateriaal().equalsIgnoreCase("fijn")){
                fijnProgramma fijn = new fijnProgramma();
                fijn.extraWater();
                fijn.kortProgramma();
                AutomatischeWas automatischeWas = new AutomatischeWas(fijn, was);
                automatischeWas.setTimer();
                automatischeWas.milieuBewust(true);
                System.out.println(automatischeWas);
                boolean anderProgramma = automatischeWas.anderProgramma();
                if (anderProgramma == true) {
                    System.out.println(automatischeWas.toString1());
                }
                automatischeWas.beginTijd();
                automatischeWas.eindTijd();
//                while (true) {
//                    // todo check of was has started or has finished (observer pattern)
//                    break;
//                }
            }
            break;
        }
    }
}