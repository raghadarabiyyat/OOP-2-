package behavioral;
import java.util.ArrayList;
public class A {
    ArrayList<AListener> listeners= new ArrayList();
    public void m1(){
        fireMethodCalled();
        System.out.println("Hello from m1");
    }
    public void addListener(AListener listener){
        listeners.add(listener);
    }
    public void fireMethodCalled(){
        for(AListener listener: listeners){
            listener.m1IsCalled();
        }
    }
}
