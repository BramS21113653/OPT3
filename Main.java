import Applicatiepackage.*;
import java.util.Scanner;  // Import the Scanner class


public class Main {
    public static void main(String[] args){
        while (true){
            Scanner scanner = new Scanner(System.in);
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
            String kleur = null;
            while (kleur == null){
                //todo getal komt er doorheen...
                try {
                    System.out.println("Kleur van de was?");
                    kleur = scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Graag een kleur invoeren..." +
                            "\nKies uit: wit/bont/mix");
                }
            }
            String materiaal = null;
            while (materiaal == null){
                //todo getal komt er doorheen...
                try {
                    System.out.println("Materiaal van de was?");
                    materiaal = scanner.nextLine();
                }catch (Exception e){
                    System.out.println("Graag een materiaal invoeren..." +
                            "\nKies uit: katoen/wol/fijn");
                }
            }
            Was was = new Was(gewicht, kleur, materiaal);
            System.out.println(was);
            if (was.getMateriaal().equalsIgnoreCase("katoen")){
                //todo child klasses fixen van programma en hier objecten van aanmaken
                //todo deze objecten samen met het object was --> in automatischewas duwen
                //todo timer in automatischewas maken
                //todo maak minimaal 3 tests
                Boolean kort = kortProgramma();
                Boolean extraWater = extraWater();
                Programma katoen = new katoenProgramma(40, 1400, 60, kort, extraWater);
                System.out.println(katoen);
            }
            if (was.getMateriaal().equalsIgnoreCase("wol")){
                Boolean kort = kortProgramma();
                Boolean extraWater = extraWater();
                Programma wol = new wolProgramma(20, 600 , 60, kort, extraWater);
                System.out.println(wol);
            }
            if (was.getMateriaal().equalsIgnoreCase("fijn")){
                Boolean kort = kortProgramma();
                Boolean extraWater = extraWater();
                Programma fijn = new fijnProgramma(30, 800 , 60, kort, extraWater);
                System.out.println(fijn);
            }
            //todo object vullen
//            AutomatischeWas automatischeWas = new AutomatischeWas();
            break;
        }
    }
    private static boolean kortProgramma(){
        //todo herzien
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u een kort programma?\nJa/Nee");
        String kortInput = scanner.nextLine();
        Boolean kort = false;
        if (kortInput.equalsIgnoreCase("ja")){
            kort = true;
            return kort;
        } else{
            kort = false;
            return kort;
        }
    }
    private static boolean extraWater(){
        //todo herzien
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u extra water?\nJa/Nee");
        String kortInput = scanner.nextLine();
        Boolean kort = false;
        if (kortInput.equalsIgnoreCase("ja")){
            kort = true;
            return kort;
        } else{
            kort = false;
            return kort;
        }
    }
}