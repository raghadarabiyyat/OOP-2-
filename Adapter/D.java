package Adapter;

public class D extends C{
    public void m1(String text){
        A a = new A();
        a.m1(text.toCharArray());
    }
}
