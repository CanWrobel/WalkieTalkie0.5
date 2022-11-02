public class Brett {
    public static int breite=7;
    public static int hoehe=6;

    private int[] reiheCount = new int[breite];
    private boolean reiheVoll;
    private Feld[][] feldarray = new Feld[hoehe][breite];

    public Brett(){
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                feldarray[i][j] = new Feld();
            }
        }
    }
    public void setFeldarray(int x, int y, String bildshirmausgabe){
        this.feldarray[x][y].setBildschirmausgabe(bildshirmausgabe);
    }
    public int getBreite(){
        return this.breite;
    }
    public int getHoehe(){
        return this.hoehe;
    }

    public String getBildschirmausgabeBrett(int i, int j){
        return this.feldarray[i][j].getBildschirmausgabeFeld();
    }

    public static void main(String[] args) {
        Feld[][] brett = new Feld[hoehe][breite];
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                brett[i][j] = new Feld();
            }
        }
        for (int i = 0; i < hoehe; i++) {
            System.out.println();
            for (int j = 0; j < breite; j++) {
                System.out.print(brett[i][j].getBildschirmausgabeFeld());
            }
        }
    }

    public static void setBreite(int breite) {
        Brett.breite = breite;
    }

    public static void setHoehe(int hoehe) {
        Brett.hoehe = hoehe;
    }

    public int[] getReiheCount() {
        return reiheCount;
    }

    public void setReiheCount(int[] reiheCount) {
        this.reiheCount = reiheCount;
    }

    public boolean isReiheVoll() {
        return reiheVoll;
    }

    public void setReiheVoll(boolean reiheVoll) {
        this.reiheVoll = reiheVoll;
    }

    public Feld[][] getFeldarray() {
        return feldarray;
    }

    public void setFeldarray(Feld[][] feldarray) {
        this.feldarray = feldarray;
    }

    @Override
    public String toString() {
        return "Brett{}";
    }
}
