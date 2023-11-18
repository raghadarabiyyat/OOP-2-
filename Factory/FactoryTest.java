package Factory;

public class FactoryTest {

    public A createImp(int type) {
        if (type == 1) {
            return new A();
        }
        if (type == 2) {
            return new C();
        }
        return null;
    }
    }
