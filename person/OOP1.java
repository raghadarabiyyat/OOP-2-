package oop2.week3.lec1;

public class OOP1 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Raghad";
        p1.age = 20;
        p1.sayHello();
        Person p2 = new Person();
        p2.name = "Issa";
        p2.sayHello();
        Person p3 = p1;
        p3.sayHello();
        p3.name = "Kamal";
        p1.sayHello();
//        Person p4 = null;
//        p4.name = "Kamal";
//        p4.sayHello(); //a run-time error will occurr in this line because its reference is null
        // we have to construct the object "p4"
    }
}
