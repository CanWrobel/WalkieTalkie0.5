public class Student {
    private static final int MAX = 45;
    private static int aktuelleKursstaerke = 35;

    private String name;
    private int matrikelNr;

    public Student (String nachname, int nummer){
        name = nachname;
        matrikelNr = nummer;
    }

    public void setMatrikelNr(int nummer){ //!warum geht public static void setMatrikelNummer nicht?
        matrikelNr = nummer;
    }

    public String getName(){
        return name;
    }
    public static void setKursstaerke(int neu){
        aktuelleKursstaerke = neu;
    }
}
/*
!s
?s
*s
*setKursstaerke() = Klassenmethode
*setMatrikelNr() = Klassenmethode
!static fuer gewoehnlich Klassenmethode

*Student = Konstruktor
!da werden die Klassenvariablen definiert

*public static void setKursstaerkeNeu(int neu) = Methodenkopf

?name = Klassenvariable
?MAX = Instanzvariable
?aktuelleKursstaerke = Instanzvariable
?{aktuelle Kursstaerke = neu;} = Methodenrumpf

+s
 */
