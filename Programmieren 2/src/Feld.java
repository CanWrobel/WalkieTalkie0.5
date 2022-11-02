public class Feld {
    private String farbe;
    private VierGewinntInterface a;
    private int nachbarn;
    private String bildschirmausgabe;
    private static String argument;


    public Feld(){
        this.bildschirmausgabe=" X ";
    }
    public void setFarbe(String farbe){
        this.farbe=farbe;

    }
    public String getFarbe(){
        return this.farbe;
    }

    public String getBildschirmausgabeFeld(){
        return this.bildschirmausgabe;
    }
    public void setBildschirmausgabe(String bildschirmausgabe){
        this.bildschirmausgabe = bildschirmausgabe;
    }



}
