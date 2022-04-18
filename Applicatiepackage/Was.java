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

    public Integer getGewicht(){
        return this.gewicht;
    }

    public String getKleur(){
        return this.kleur;
    }

    public String getMateriaal(){
        return this.materiaal;
    }

    public String toString(){
        return "Gewicht: " + this.gewicht +
                "\nKleur: " + this.kleur +
                "\nMateriaal: " + this.materiaal;
    }

}
