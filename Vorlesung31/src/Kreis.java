public class Kreis {
    private final int radius;

    public Kreis (int radius){
        this.radius = radius;
    }
    public int calculateA(){
        return (int) (this.radius*this.radius*Math.PI);
    }
}
