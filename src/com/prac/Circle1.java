package com.prac;
public class Circle1 {
    public static void main(String[] args) {
    Cylinder c = new Cylinder();
    c.radius = 9;
    c.height=10;
        System.out.println(c.volume());
    }
}
 class Circle {
    public double radius;

    public double area(){
         return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends  Circle{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}
