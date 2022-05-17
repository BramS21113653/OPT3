package Applicatiepackage;

public class wolProgramma extends Programma {
    private static Integer temperatuur = 20;
    private static Integer toeren = 600;

    public wolProgramma() {
        super(wolProgramma.temperatuur, wolProgramma.toeren);
    }

    @Override
    public void kortProgramma(){
        super.setKort(true);
    }

//    @Override
//    public String toString(){
//        return "Temperatuur: " + this.temperatuur + " graden Celsius" +
//                "\nToeren: " + this.toeren + " rotaties per minuut" +
//                "\nTijdsduur: " + this.tijdsduur + " minuten" +
//                "\nKort programma: " + super.getKort() + ", dit programma is altijd kort " +
//                "want het is een wolprogramma!" +
//                "\nExtra water: " + super.getExtraWater();
//    }
}