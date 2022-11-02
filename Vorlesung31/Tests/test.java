public class test {
    public void test1(){
        Rechteck r = new Rechteck(1,2);
        int a = r.calculateA();
        System.out.println("A == "+a);
    }
    public void test2(){
        Quadrat q = new Quadrat(3);
        int a = q.calculateA();
        System.out.println("A == "+a);
    }
    public void test3(){
        Rechteck q = new Quadrat(3);
        int a = q.calculateA();
        System.out.println("A == "+a);
    }
}
