package Adapter;

public class Test {
    public static void main(String[] args) {
        C c = new B();
        B b = new B();
        b.setC(c);
        b.process();
    }
}
