public class Parallelogramm {
    private final int alpha;
    private final int b;
    private final int a;

    public Parallelogramm(int a, int b, int alpha){
        this.a=a;
        this.b=b;
        this.alpha=alpha;
    }
    public int calculateA(){
        return (int) (this.a*this.b*Math.sin(alpha));
    }
}
