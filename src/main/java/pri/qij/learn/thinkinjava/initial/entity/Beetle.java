package pri.qij.learn.thinkinjava.initial.entity;

public class Beetle extends Insect {
    int k = prt("Beetle.k initialized");
    int m;
    public Beetle(){
        prt("k = " + k);
        prt("j = " + j);
    }
    static int x2 = prt("static Beetle.x2 initailized");
    static int prt(String s){
        System.out.println(s);
        return 63;
    }

    public static void main(String[] args) {
        prt("Beetle constructor");
        Beetle b = new Beetle();
    }
}
