package Facade;

public class Facade {

    public SubSystem1 subsystem1 = new SubSystem1();
    public SubSystem2 subsystem2 = new SubSystem2();

    public void operate(){
        System.out.println("Facade is coordenating the subsystem ");
        subsystem1.operation1();
        subsystem2.operation2();
    }
}
