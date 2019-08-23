package pri.qij.learn.thinkinjava.initial.entity;

public class Insect {

    int i = 9;
    int j;
    int y = prt("Insect.y initialized");
    public Insect(){
        prt("i = " + i + " j = " + j);
    }
    static int x1 = prt("static Insect.x1 initialized");
    static int prt(String s){
        System.out.println(s);
        return 47;
    }
}
