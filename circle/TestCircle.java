package oop2.week3.lec1.circle;

import static oop2.week3.lec1.circle.Util.*;

public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3);
        print(c1.getArea());
        Circle c2 = new Circle();
        c2.setRadius(10);
        print(c2.getArea());
    }
}
