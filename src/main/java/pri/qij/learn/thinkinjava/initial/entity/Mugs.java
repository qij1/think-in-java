package pri.qij.learn.thinkinjava.initial.entity;

public class Mugs {
    Mug m1;
    Mug m2;
    {
        m1 = new Mug(1);
        m2 = new Mug(2);
        System.out.println("m1 & m2 initialized");
        String[] s = new String[]{"1111","1111",};
    }
    public Mugs(){
        System.out.println("Mugs()");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Mugs m = new Mugs();
    }
}
