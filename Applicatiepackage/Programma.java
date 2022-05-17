package Applicatiepackage;

import java.util.Scanner;

public class Programma {
    private Integer temperatuur;
    private Integer toeren;
    private Integer tijdsduur;
    private boolean kort;
    private boolean extraWater;

    public Programma(Integer temperatuur, Integer toeren){
        this.temperatuur = temperatuur;
        this.toeren = toeren;
    }

    public void bepaalTijdsduur(Integer gewicht){
        if(gewicht > 0 && gewicht <= 2) {
            this.tijdsduur = 30;
        }
        else if(gewicht >= 3 && gewicht <= 5) {
            this.tijdsduur = 45;
        }
        else if(gewicht >= 6 && gewicht < 8) {
            this.tijdsduur = 60;
        } else{this.tijdsduur = 0;}
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

    public void setTijdsduurKort(){
        this.tijdsduur = 30;
    }

    public void setExtraWater(){
        this.extraWater = true;
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
            this.tijdsduur = 30;
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
