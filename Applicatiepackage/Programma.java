package Applicatiepackage;

public class Programma {
    private Integer temperatuur;
    private Integer toeren;
    private Integer tijdsduur;
    private boolean kort;
    private boolean extraWater;

    public Programma(Integer temperatuur, Integer toeren, Integer tijdsduur, boolean kort, boolean extraWater){
        this.temperatuur = temperatuur;
        this.toeren = toeren;
        this.tijdsduur = tijdsduur;
        this.kort = kort;
        this.extraWater = extraWater;
    }

    public Integer getTemperatuur(){
        return this.temperatuur;
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

    @Override
    public String toString(){
        return "Wasprogramma:" +
                "\nTemperatuur: " + this.temperatuur + " graden Celsius" +
                "\nToeren: " + this.toeren + " rotaties per minuut" +
                "\nTijdsduur: " + this.tijdsduur + " minuten" +
                "\nKort programma: " + this.kort +
                "\nExtra water: " + this.extraWater;
    }
}
