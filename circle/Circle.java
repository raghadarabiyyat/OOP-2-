package oop2.week3.lec1.circle;

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
     public void setRadius(int rad){
        radius= rad;
     }
}
