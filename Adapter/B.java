package Adapter;

public class B extends C {

    C c = new C();

    public void setC(C c) {
        this.c = c;
    }
    String s = "Hello";

    public void process() {
        c.m1(s);
    }
}
