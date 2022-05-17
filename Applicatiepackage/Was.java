package Applicatiepackage;

public class Was {
    private Integer gewicht;
    private String kleur;
    private String materiaal;

    public Was(Integer gewicht, String kleur, String materiaal){
        this.gewicht = gewicht;
        this.kleur = kleur;
        this.materiaal = materiaal;
    }

    public boolean geldigeWas(){
        if((this.materiaal.equalsIgnoreCase("Katoen") || this.materiaal.equalsIgnoreCase("wol")
                || this.materiaal.equalsIgnoreCase("fijn")) && this.gewicht < 8 && this.gewicht > 0){
            return true;
        } else{return false;}
    }

    public Integer getGewicht(){
        return this.gewicht;
    }

    public String getKleur(){
        return this.kleur;
    }

    public String getMateriaal(){
        return this.materiaal;
    }

    @Override
    public String toString(){
        return "Gewicht: " + this.gewicht + " kg" +
                "\nKleur: " + this.kleur +
                "\nMateriaal: " + this.materiaal;
    }

}
