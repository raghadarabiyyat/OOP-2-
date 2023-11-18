package Factory;

public class Test {
    public static void main(String[] args) {
        FactoryTest f = new FactoryTest();
        A a1 = f.createImp(1);
        A a2 = f.createImp(1);
        a1.m1();
        a2.m1();
    }
}
