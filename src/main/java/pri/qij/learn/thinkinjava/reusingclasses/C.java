package pri.qij.learn.thinkinjava.reusingclasses;

public class C extends A{
    B b ;

    public C(int i) {
        super(i);
        b = new B(1);
    }

    public static void main(String[] args) {
        C c = new C(2);
    }
}
