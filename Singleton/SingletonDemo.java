package pkg;

public class SingletonDemo {
    public static void main(String[] args) {
        for(int i=1 ; i<=100 ; i++){
            SingletonTest test=SingletonTest.getInstance();
            test.hello();
        }
    }
    
}
