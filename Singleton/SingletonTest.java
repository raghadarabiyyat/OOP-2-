package pkg;

public class SingletonTest {
    private static SingletonTest instance = null;
    private SingletonTest (){
        System.out.println("New object has been created ");
    }
    public static SingletonTest getInstance(){
        if (instance == null){
            instance = new SingletonTest();
        }
        return instance;
    }
    public void hello(){
        System.out.println("Hello from Singleton");
    }
}
