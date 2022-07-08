public class Beispiel {
    public static int berechneFaku(int eingabe){
        final int FAKTOR = 1;
        int faku = 1;
        for (int i = 2; i <= eingabe; i++){
            faku = faku * i;
        }
        return faku + FAKTOR;
    }

    public static void main(String[] args) {
        int erg = berechneFaku(5);
        System.out.println(erg);
    }
}
/*
? berechneFaku(5) = methodenaufruf
? 5 = aktueller Parameter
* berechneFaku = Methodenname
* erg = lokale Variable
* Beispiel = Klassenname
? eingabe = formaler Parameter
? FAKTOR = symbolische Konstante
* i = Laufvariable
* faku = lokale Variable
? 2 = lokale konstante
 */
