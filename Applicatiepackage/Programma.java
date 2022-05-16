package Applicatiepackage;

import java.util.Scanner;

public class Programma {
    private Integer temperatuur;
    private Integer toeren;
    private Integer tijdsduur;
    private boolean kort;
    private boolean extraWater;

    public Programma(Integer temperatuur, Integer toeren, Integer tijdsduur){
        this.temperatuur = temperatuur;
        this.toeren = toeren;
        this.tijdsduur = tijdsduur;
    }

    public boolean weigerWasprogramma(String materiaal, Integer gewicht){
        if((materiaal.equalsIgnoreCase("Katoen") || materiaal.equalsIgnoreCase("Katoen")
                || materiaal.equalsIgnoreCase("Katoen")) & gewicht < 8 & gewicht > 2){
            return true;
        } else{return false;}
    }

    public Integer getTemperatuur(){
        return this.temperatuur;
    }

    public void changeTemperatuurMin(Integer aftrek) {
        this.temperatuur = this.temperatuur - aftrek;
    }

    public void changeTemperatuurPlus(Integer plus) {
        this.temperatuur = this.temperatuur + plus;
    }

    public Integer getToeren(){
        return this.toeren;
    }

    public Integer getTijdsduur(){
        return this.tijdsduur;
    }

    public boolean getKort(){
        return this.kort;
    }

    public boolean getExtraWater(){
        return this.extraWater;
    }

    public void setKort(boolean kort){
        this.kort = kort;
    }

    public void extraWater(){
        //todo herzien
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u extra water?\nJa/Nee");
        String kortInput = scanner.nextLine();
        Boolean kort = false;
        if (kortInput.equalsIgnoreCase("ja")){
            kort = true;
            this.extraWater = true;
        } else{
            kort = false;
            this.extraWater = false;
        }
    }

    public void kortProgramma(){
        //todo herzien
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u een kort programma?\nJa/Nee");
        String kortInput = scanner.nextLine();
        Boolean kort = false;
        if (kortInput.equalsIgnoreCase("ja")){
            kort = true;
            this.kort = true;
        } else{
            kort = false;
            this.kort = false;
        }
    }

    @Override
    public String toString(){
        return "Temperatuur: " + this.temperatuur + " graden Celsius" +
                "\nToeren: " + this.toeren + " rotaties per minuut" +
                "\nTijdsduur: " + this.tijdsduur + " minuten" +
                "\nKort programma: " + this.kort +
                "\nExtra water: " + this.extraWater;
    }
}
