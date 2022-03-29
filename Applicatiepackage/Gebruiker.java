package Applicatiepackage;
public class Gebruiker {
    private String naam;
    private String achternaam;
    private Integer leeftijd;
    
    //Constructor
    public Gebruiker(String naam, String achternaam, Integer leeftijd){
        this.naam = naam;
        this.achternaam = achternaam;
        this.leeftijd = leeftijd;
    }

    public String getNaam(){
        return this.naam;
    }

    public String getAchternaam(){
        return this.achternaam;
    }

    public Integer getLeeftijd(){
        return this.leeftijd;
    }
}