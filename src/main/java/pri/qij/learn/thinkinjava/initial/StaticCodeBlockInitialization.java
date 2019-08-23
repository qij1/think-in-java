package pri.qij.learn.thinkinjava.initial;

import pri.qij.learn.thinkinjava.initial.entity.Cups;

public class StaticCodeBlockInitialization {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.c1.f(99);
        System.out.println(Cups.i);
    }
}
