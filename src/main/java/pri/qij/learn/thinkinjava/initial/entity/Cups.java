package pri.qij.learn.thinkinjava.initial.entity;

public class Cups {
    public static Cup c1;
    public static int i ;
    static {
        c1 = new Cup(1);
        c2 = new Cup(3);
    }
    public static Cup c2 = new Cup(2);
    public Cups(){
        System.out.println("Cups()");
    }
}
