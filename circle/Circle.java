package oop2.week3.lec1.circle;

import static oop2.week3.lec1.circle.Util.*;

public class Circle {

    final static double PI = 3.14;
    private int radius;

    public double getRound() {
        double round = 2 * PI * radius;
        return round;
    }

    public double getArea() {
        double area = PI * radius * radius;
        return area;
    }

    public void setRadius(int rad) {
        if (rad > 0) {
            radius = rad;
        } else {
            rad = 0;
        }
    }

    public int getRad() {
        return radius;
    }

    public Circle() {
        print(radius);
    }
    public Circle(int radius){
        this.radius=radius;
    }
}
